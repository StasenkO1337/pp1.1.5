package jm.task.core.jdbc;

import jm.task.core.jdbc.service.UserService;
import jm.task.core.jdbc.service.UserServiceImpl;

public class Main {
    public static void main(String[] args){
        UserService userService = new UserServiceImpl();
        userService.createUsersTable();

        userService.saveUser("a1", "b1", (byte) 1);
        userService.saveUser("a2", "b2", (byte) 2);
        userService.saveUser("a3", "b3", (byte) 3);
        userService.saveUser("a4", "b4", (byte) 4);
        userService.saveUser("a5", "b5", (byte) 5);

        userService.removeUserById(2);

        userService.getAllUsers().forEach(System.out::println);

        userService.cleanUsersTable();

        userService.dropUsersTable();
    }

}