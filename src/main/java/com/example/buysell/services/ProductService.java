package com.example.buysell.services;

import com.example.buysell.models.Product;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ProductService {
    private List<Product> products = new ArrayList<>();
    private long ID = 0;

    {
        products.add(new Product(++ID,"iphone13pro", "phone", 399, "moskva", "oleg"));
        products.add(new Product(++ID,"ps5", "console", 299, "minsk", "stas"));
    }

    public List<Product> list() {
        return products;
    }

    public void saveProduct(Product product){
        product.setId(++ID);
        products.add(product);
    }

    public void deleteProducts(Long id){
        products.removeIf(product -> product.getId().equals(id));
    }
}
