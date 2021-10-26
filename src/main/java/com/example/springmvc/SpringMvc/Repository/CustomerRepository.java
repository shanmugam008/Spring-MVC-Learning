package com.example.springmvc.SpringMvc.Repository;

import com.example.springmvc.SpringMvc.Entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customer,Integer> {
}
