package com.kot.SpringBoot.model;

import com.kot.SpringBoot.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import javax.annotation.PostConstruct;

@Component
public class UserTester {

   User user;

   @Autowired
   UserService userService;

   @PostConstruct
   public void crateNewCars() {
      userService.addUser(new User("Tom", "Cruise", 34, "cruise@gmail.com"));
      userService.addUser(new User("Bruce", "LEE", 35, "lee@gmail.com"));
      userService.addUser(new User("Chack", "Norris", 33, "norris@gmail.com"));
      userService.addUser(new User("Sylvester", "Stallone", 55, "stallone@gmail.com"));
      userService.addUser(new User("Keanu", "Reeves", 56, "reeves@gmail.com"));
   }
}
