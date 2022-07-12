package com.example.customerservice;

import com.example.customerservice.dto.CustomerRequestDTO;
import com.example.customerservice.services.CustomerService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class CustomerServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(CustomerServiceApplication.class, args);
    }
    @Bean
    CommandLineRunner start(CustomerService customerService){

        return args -> {
            customerService.save(new CustomerRequestDTO("id1","test1","test1@gmail.com" ));
            customerService.save(new CustomerRequestDTO("id2","test2","test2@gmail.com" ));
        };
    }

}
