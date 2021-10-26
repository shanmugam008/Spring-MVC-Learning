package com.example.springmvc.SpringMvc.Entity;

import javax.persistence.*;

@Entity
@Table(name = "item")
public class Item {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    private String itemName;

//    @OneToOne(cascade = CascadeType.ALL , mappedBy = "item")
//    private Customer customer;



    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }


}
