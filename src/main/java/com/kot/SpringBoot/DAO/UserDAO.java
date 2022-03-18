package com.kot.SpringBoot.DAO;
import com.kot.SpringBoot.model.User;
import java.util.List;

public interface UserDAO {

    List<User> getUsers();

    void addUser(User user);

    List<User> getNumberOfUsers(int counter);

    User getUser(long id);

    void update(long id, User user);

    void delete(long id);
}
