package com.kot.SpringBoot.model;

import javax.persistence.*;
import javax.validation.constraints.*;

@Entity
@Table(name = "users")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private long id;

    @Column(name = "name")
    @Size(min = 2, message = "Минимум 2 символа")
    @NotBlank(message = "Поле не должно быть пустым")
    private String name;

    @Column(name = "secondname")
    @Size(min = 2, message = "Минимум 2 символа")
    @NotBlank(message = "Поле не должно быть пустым")
    private String secondName;

    @NotNull
    @Positive(message = "Возраст должен быть больше нуля")
    @Column(name = "age")
    private int age;

    @NotBlank(message = "Поле не должно быть пустым")
    @Email(message = "Синтакиси не соответствует адресу электронной почты")
    @Column(name = "email")
    private String email;


    public User() {
    }

    public User(long id, String name, String secondName, int age, String email) {
        this.id = id;
        this.name = name;
        this.secondName = secondName;
        this.age = age;
        this.email = email;
    }

    public User(String name, String secondName, int age, String email) {
        this.name = name;
        this.secondName = secondName;
        this.age = age;
        this.email = email;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSecondName() {
        return secondName;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
