package com.pb.productservicesst.controllers;

import com.pb.productservicesst.dtos.ExceptionDtos;
import com.pb.productservicesst.dtos.FakeStoreProductDto;
import com.pb.productservicesst.models.Product;
import com.pb.productservicesst.services.FakeStoreProductService;
import com.pb.productservicesst.services.ProductService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

//This controller is capable to host https apis
//localhost:8080/products ->ProductController
@RestController
@RequestMapping("/products") //What this request mapping will be doing is create mapping of this endpoint to controller
public class ProductController {//waiter so public
    private ProductService productService; // we can also use ProductService
    ProductController(ProductService productService){
        this.productService=productService;
    }

//    localhost:8080/products/id  rest says from url we shoud not be able tp identify if it is get post or whatevevr
@GetMapping("/{id}")
public ResponseEntity<Product> getProductById(@PathVariable("id") Long id) {
    ResponseEntity<Product> responseEntity = null;
    try {
        Product product = productService.getProductById(id);
        responseEntity = new ResponseEntity<>(product, HttpStatus.OK);
        System.out.println("Ganesh");
        return responseEntity;
    } catch (RuntimeException exception) {
        ExceptionDtos dtos=new ExceptionDtos();
        dtos.setMessage("Something went wrong");
        dtos.setResolution("Check Request");
        ResponseEntity<ExceptionDtos> responseEntity = new ResponseEntity<>(dtos, HttpStatus.NOT_FOUND);
//        System.out.println("Product not found for ID: " + id);
    }
//    return responseEntity;
}


    @GetMapping("/")
    public List<Product> getAllProducts(){
        throw new RuntimeException("shivmay");
//       return productService.getAllProducts() ;
//        return null;
    }
    @GetMapping("/shiv")
    public String pb(){
        return "shivvv";
    }
}
