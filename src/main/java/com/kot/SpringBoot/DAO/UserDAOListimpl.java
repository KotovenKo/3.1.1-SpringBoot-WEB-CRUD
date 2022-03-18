package com.kot.SpringBoot.DAO;
import com.kot.SpringBoot.model.User;
import org.springframework.stereotype.Repository;
import java.util.ArrayList;
import java.util.List;

@Repository
public class UserDAOListimpl implements UserDAO {

    private int counterCars;
    private List<User> users;

    public UserDAOListimpl() {
        users = new ArrayList<>();
        users.add(new User("Tom", "Cruise", 34, "cruise@gmail.com"));
        users.add(new User("Bruce", "LEE", 35, "lee@gmail.com"));
        users.add(new User("CHACK", "Norris", 33, "norris@gmail.com"));
        users.add(new User("Sylvester", "Stallone", 55, "stallone@gmail.com"));
        users.add(new User("Keanu", "Reeves", 56, "reeves@gmail.com"));
    }

    @Override
    public List<User> getUsers() {
        return users;
    }

    @Override
    public void addUser(User user) {
        users.add(user);
    }

    @Override
    public List<User> getNumberOfUsers(int counter) {
        if (counter > users.size()) {
            counter = users.size();
        }
        return users.subList(0, counter);
    }

    @Override
    public User getUser(long id) {
        return null;
    }

    @Override
    public void update(long id, User user) {
    }

    @Override
    public void delete(long id) {
    }
}
