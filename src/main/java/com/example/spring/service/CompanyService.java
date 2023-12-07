package com.example.spring.service;

import com.example.spring.dto.CompanyDTO;
import com.example.spring.entity.Company;
import com.example.spring.mapper.CompanyMapper;
import com.example.spring.mapper.UserMapper;
import com.example.spring.repository.CompanyRepository;

public class CompanyService {
    private CompanyRepository companyRepository;
    private CompanyMapper companyMapper;

    public void setCompanyRepository(CompanyRepository companyRepository) {
        this.companyRepository = companyRepository;
    }

    public void setCompanyMapper(CompanyMapper companyMapper) {
        this.companyMapper = companyMapper;
    }

    public void registerCompany(CompanyDTO companyDTO) {
        Company company = companyMapper.toCompany(companyDTO);
        companyRepository.save(company);
    }

    public Company findCompanyById(Long id) {
        return companyRepository.findCompanyById(id);
    }
}
