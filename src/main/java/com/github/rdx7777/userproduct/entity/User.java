package com.github.rdx7777.userproduct.entity;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String name;
    private String surname;
    private String email;
    private String city;

    @ManyToMany(fetch = FetchType.EAGER)
//    @JoinTable(name = "user_products",
//        joinColumns = @JoinColumn(name = "user_id", referencedColumnName = "products_id"))
    private List<Product> products = new ArrayList<>();
}
