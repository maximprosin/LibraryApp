package com.libraryapp.classes;

import java.util.ArrayList;
import java.util.List;

public class Admin extends User {
    private final List<User> users;

    public Admin(String name, String email, String password) {
        super(name, email, password);
        this.users = new ArrayList<>();
    }

    public void addUser(User User) {
        users.add(User);
        System.out.println("Пользователь " + User.getName() + " был добавлен");
    }

    public void removeUser(User User) {
        users.remove(User);
        System.out.println("Пользователь " + User.getName() + " был удален");
    }

    public void listUsers() {
        System.out.println("Список пользователей:");
        for (User User : users) {
            System.out.println(User.getName());
        }
    }

    @Override
    public void login(String email, String password) {
        if (getEmail().equals(email) && getPassword().equals(password)) {
            setLoggedIn(true);
            System.out.println("Вы успешно вошли в админ-аккаунт! Здравствуйте, администратор " + getName() + "!");
        }
    }
}
