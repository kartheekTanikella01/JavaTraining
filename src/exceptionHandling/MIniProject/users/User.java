package exceptionHandling.MIniProject.users;

import java.util.ArrayList;
import java.util.List;

public class User {
    private List<User> userList = new ArrayList<>();

    private int id;
    private String name;

    public User() {
    }

    public User(List<User> userList, int id, String name) {
        this.userList = userList;
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }

    public List<User> addUser(User user) {
        userList.add(user);
        return userList;

    }
}