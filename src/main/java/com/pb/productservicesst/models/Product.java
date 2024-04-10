package com.pb.productservicesst.models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
//We can also define Getter Setter at attribute level if u have all args constructor we wont have default constructor right
public class Product {
    private long id;
    private String title;
    private String description;
    private Double price;
    private Category category;
    private  String image;


}
