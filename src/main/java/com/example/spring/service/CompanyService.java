package com.example.spring.service;


import com.example.spring.entity.Company;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.example.spring.repository.CompanyRepository;

@Service
public class CompanyService {

    @Autowired
    private CompanyRepository companyRepository;

    @Transactional
    public void registerCompany(Company company) {
        companyRepository.save(company);
    }
    @Transactional(readOnly = true)
    public Company findCompanyById(Long id) {
        return companyRepository.findCompanyById(id);
    }
}
