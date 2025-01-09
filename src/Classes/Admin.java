package Classes;

import java.util.ArrayList;
import java.util.List;

public class Admin extends User {
    private List<User> users;

    public Admin(String name, String email, String password) {
        super(name, email, password);
        this.users = new ArrayList<>();
    }

    public void addUser(User user) {
        users.add(user);
        System.out.println("Пользователь " + user.getName() + " был добавлен");
    }

    public void removeUser(User user) {
        users.remove(user);
        System.out.println("Пользователь " + user.getName() + " был удален");
    }

    public void listUsers() {
        System.out.println("Список пользователей:");
        for (User user : users) {
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
