package com;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "com.dao.item")
public class BudgetCareApplication {

    public static void main(String[] args) {
        SpringApplication.run(BudgetCareApplication.class);
    }

}
