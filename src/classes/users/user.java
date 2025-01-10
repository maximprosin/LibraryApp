package classes.users;

public class user {
    private String name;
    private String email;
    private String password;
    private boolean loggedIn = false;

    public user(String name, String email, String password) {
        this.name = name;
        this.email = email;
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name != null && !name.trim().isEmpty()) {
            this.name = name;
        } else {
            throw new IllegalArgumentException("Поле имя не должно быть пустым");
        }
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        if (email != null && !email.trim().isEmpty()) {
            this.email = email;
        } else {
            throw new IllegalArgumentException("Поле электронная почта не должно быть пустым");
        }
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        if (password != null && !password.trim().isEmpty()) {
            this.password = password;
        } else {
            throw new IllegalArgumentException("Поле пароль не должно быть пустым");
        }
    }

    public void login(String email, String password) {
        if (this.email.equals(email) && this.password.equals(password)) {
            loggedIn = true;
            System.out.println("Вы успешно вошли в аккаунт! Здравствуйте, " + this.name + "!");
        }
    }

    public void logout() {
        loggedIn = false;
        System.out.println("До встречи, " + this.name + "!");
    }

    public boolean isLoggedIn() {
        return loggedIn;
    }

    public void setLoggedIn(boolean loggedIn) {
        this.loggedIn = loggedIn;
    }
}