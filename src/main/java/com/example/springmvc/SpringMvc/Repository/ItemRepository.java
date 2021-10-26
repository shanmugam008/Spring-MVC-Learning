package com.example.springmvc.SpringMvc.Repository;

import com.example.springmvc.SpringMvc.Entity.Item;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ItemRepository extends JpaRepository<Item, Integer> {
}
