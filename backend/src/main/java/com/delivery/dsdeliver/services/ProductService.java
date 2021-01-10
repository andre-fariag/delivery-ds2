package com.delivery.dsdeliver.services;

import java.util.List;
import java.util.stream.Collectors;

import com.delivery.dsdeliver.dto.ProductDTO;
import com.delivery.dsdeliver.entities.Product;
import com.delivery.dsdeliver.repositories.ProductRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class ProductService {

    @Autowired // dependecy injection using JPA
    private ProductRepository repository;

    @Transactional(readOnly = true)
    public List<ProductDTO> findAll() {
        List<Product> list = repository.findAllByOrderByNameAsc();
        
        return list.stream().map(x -> new ProductDTO(x)).collect(Collectors.toList()); // list conversion from Product to ProductDTO
    }

}
