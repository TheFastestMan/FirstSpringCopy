package com.example.spring;

import com.example.spring.dto.CompanyDTO;
import com.example.spring.dto.UserDTO;
import com.example.spring.service.UserService;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.example.spring.service.CompanyService;

public class SpringRunner {

    public static void main(String[] args) {
        try (ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("springConfig.xml")) {
            UserService userService = context.getBean(UserService.class);
            CompanyService companyService = context.getBean(CompanyService.class);

            UserDTO userDTO = new UserDTO();
            userDTO.setName("Name8");

            CompanyDTO companyDTO = new CompanyDTO();
            companyDTO.setName("Company8");


            userService.registerUser(userDTO);
            companyService.registerCompany(companyDTO);

            System.out.println("User is " + userService.findUserById(1L));
            System.out.println("Company is " + companyService.findCompanyById(1L));


        }
    }
}
