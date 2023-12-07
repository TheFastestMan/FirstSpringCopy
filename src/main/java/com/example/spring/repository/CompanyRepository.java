package com.example.spring.repository;

import com.example.spring.entity.Company;
import org.hibernate.SessionFactory;
import org.springframework.transaction.annotation.Transactional;

@Transactional
public class CompanyRepository {
    private SessionFactory sessionFactory;

    public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    public void save(Company company) {
        sessionFactory.getCurrentSession().save(company);
    }

    public Company findCompanyById(Long id) {
        return sessionFactory.getCurrentSession().get(Company.class, id);
    }
}
