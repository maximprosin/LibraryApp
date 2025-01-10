package classes.user;

import java.util.ArrayList;
import java.util.List;

public class admin extends user {
    private List<user> users;

    public admin(String name, String email, String password) {
        super(name, email, password);
        this.users = new ArrayList<>();
    }

    public void addUser(user user) {
        users.add(user);
        System.out.println("Пользователь " + user.getName() + " был добавлен");
    }

    public void removeUser(user user) {
        users.remove(user);
        System.out.println("Пользователь " + user.getName() + " был удален");
    }

    public void listUsers() {
        System.out.println("Список пользователей:");
        for (classes.user.user user : users) {
            System.out.println(user.getName());
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
