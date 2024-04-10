package com.pb.productservicesst.models;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Category {
    private Long id;
    private String title;
    private String description;
    private Double price;
    private Category category;
}
