package com.example.spring.repository;


import com.example.spring.entity.Company;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
public class CompanyRepository {
    @Autowired
    private SessionFactory sessionFactory;

    @Transactional
    public void save(Company company) {
        sessionFactory.getCurrentSession().save(company);
    }

    @Transactional(readOnly = true)
    public Company findCompanyById(Long id) {
        return sessionFactory.getCurrentSession().get(Company.class, id);
    }
}
