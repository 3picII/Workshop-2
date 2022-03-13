package pl.coderslab.entity;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.Scanner;

public class Main01 {
    public static void main(String[] args) {
        UserDao userDao = new UserDao();
        User user1 = new User();
        user1.setUserName("Andrzej");
        user1.setEmail("Andrzej@poczta1");
        user1.setPassword("hasło1");
        userDao.create(user1);
        User user3 = new User();
        user3.setUserName("Krzyś");
        user3.setEmail("Krzyś@poczta3");
        user3.setPassword("hasło3");
        userDao.create(user3);
        User user4 = new User();
        user4.setUserName("Mateusz");
        user4.setEmail("Mateusz@poczta4");
        user4.setPassword("hasło4");
        userDao.create(user4);
        User user2 = new User();
        user2.setUserName("Michał");
        user2.setEmail("Michał@poczta2");
        user2.setPassword("hasło2");
        user2.setId(1);
        userDao.update(user2);
        User read = userDao.read(1);
        System.out.println(read);
        userDao.delete(3);
        userDao.printAll();
//        userDao.printAll2();
    }
}


