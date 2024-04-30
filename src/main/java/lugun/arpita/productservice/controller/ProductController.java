package lugun.arpita.productservice.controller;

import lugun.arpita.productservice.models.Product;
import org.springframework.web.bind.annotation.*;

@RestController //receive call from API, important class
public class ProductController {

    @PostMapping("/products")
    public void createProduct(){

    }

    @GetMapping("/products/{id}")

    public Product getProductDetails(@PathVariable("id") int id){

        return new Product();
    }

    @GetMapping("/products")
    public void getAllProduct(){

    }

    @PutMapping
    public void updateProduct(){

    }
}
