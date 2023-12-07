package com.example.spring;

import com.example.spring.entity.Company;
import com.example.spring.service.UserService;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.example.spring.entity.User;
import com.example.spring.service.CompanyService;

public class SpringRunner {

    public static void main(String[] args) {
        try (ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("springConfig.xml")) {
            UserService userService = context.getBean(UserService.class);
            CompanyService companyService = context.getBean(CompanyService.class);

            User user = new User();
            user.setName("Name2");

            Company company = new Company();
            company.setName("Company2");


            userService.registerUser(user);
            companyService.registerCompany(company);

            System.out.println("User is " + userService.findUserById(1L));
            System.out.println("Company is " + companyService.findCompanyById(1L));


        }
    }
}
