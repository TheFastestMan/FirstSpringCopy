package com.example.spring.repository;

import com.example.spring.entity.User;
import org.hibernate.SessionFactory;
import org.springframework.transaction.annotation.Transactional;

@Transactional
public class UserRepository {
    private SessionFactory sessionFactory;

    public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    public void save(User user) {
        sessionFactory.getCurrentSession().save(user);
    }

    public User findUserById(Long id) {
        return sessionFactory.getCurrentSession().get(User.class, id);
    }
}
