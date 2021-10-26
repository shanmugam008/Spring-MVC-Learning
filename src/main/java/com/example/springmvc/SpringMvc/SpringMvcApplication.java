package com.example.springmvc.SpringMvc;

import com.example.springmvc.SpringMvc.Entity.Customer;
import com.example.springmvc.SpringMvc.Entity.Item;
import com.example.springmvc.SpringMvc.Entity.Student;
import com.example.springmvc.SpringMvc.Repository.CustomerRepository;
import com.example.springmvc.SpringMvc.Repository.StudentRepository;
import com.example.springmvc.SpringMvc.Service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringMvcApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(SpringMvcApplication.class, args);

	}

	@Autowired
	private CustomerRepository customerRepository;

	@Override
	public void run(String... args) throws Exception {

//		Customer customer=new Customer("shan");
//
//		Item item=new Item("Watch");
//
//		customer.setItem(item);
//
//		customerRepository.save(customer);



	}
}
