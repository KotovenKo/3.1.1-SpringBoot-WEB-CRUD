package com.kot.SpringBoot.DAO;

import com.kot.SpringBoot.model.User;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;


import javax.persistence.TypedQuery;
import java.util.List;


public class UserDAOHibernateImpl implements UserDAO {

    @Autowired
    SessionFactory sessionFactory;

    @Override
    public List<User> getUsers() {
        System.out.println("In the get user method");
        TypedQuery<User> query = sessionFactory.getCurrentSession().createQuery("from User");
        return query.getResultList();
    }

    @Override
    public void addUser(User user) {
        sessionFactory.getCurrentSession().saveOrUpdate(user);
    }

    @Override
    public List<User> getNumberOfUsers(int counter) {
        List<User> query = sessionFactory.getCurrentSession().createQuery("from User ").getResultList();
        if (counter > query.size()) {
            counter = query.size();
        }
        return query.subList(0, counter);
    }

    @Override
    public User getUser(long id) {
        return sessionFactory.getCurrentSession().get(User.class, id);
    }

    @Override
    public void update(long id, User user) {
        System.out.println("In the update method");
        User updatedUser = sessionFactory.getCurrentSession().get(User.class, id);
        updatedUser.setName(user.getName());
        updatedUser.setSecondName(user.getSecondName());
        updatedUser.setAge(user.getAge());
        updatedUser.setEmail(user.getEmail());
        addUser(updatedUser);
    }

    @Override
    public void delete(long id) {
        User user = getUser(id);
        sessionFactory.getCurrentSession().delete(user);
    }
}
