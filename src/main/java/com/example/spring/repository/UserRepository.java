package com.example.spring.repository;


import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import com.example.spring.entity.User;

@Repository
public class UserRepository {

    @Autowired
    private SessionFactory sessionFactory;

    @Transactional
    public void save(User user) {
        sessionFactory.getCurrentSession().save(user);
    }

    @Transactional(readOnly = true)
    public User findUserById(Long id) {
        return sessionFactory.getCurrentSession().get(User.class, id);
    }
}
