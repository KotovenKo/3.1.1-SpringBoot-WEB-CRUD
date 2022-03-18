package com.kot.SpringBoot.Service;

import com.kot.SpringBoot.DAO.UserDAO;
import com.kot.SpringBoot.DAO.UserDAOCrudRepo;
import com.kot.SpringBoot.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;


import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
public class UserServiceimpl implements UserService {

    //@Qualifier("userDAOCrudRepo")
    @Autowired
    UserDAOCrudRepo userDAOCrudRepo;

    @Override
    public List<User> getUsers() {
        return userDAOCrudRepo.findAll();
    }

    @Override
    public void addUser(User user) {
        userDAOCrudRepo.save(user);
    }

    @Override
    public List<User> getNumberOfUsers(int counter) {
        System.out.println("In service getnumber");
        return userDAOCrudRepo.findFirst(counter);
    }

    @Override
    public User getUser(long id) {
        return userDAOCrudRepo.findUserById(id);
    }

    @Override
    public void update(long id, User user) {
        userDAOCrudRepo.save(user);
    }

    public void delete(long id) {
        userDAOCrudRepo.delete(getUser(id));
    }
}
