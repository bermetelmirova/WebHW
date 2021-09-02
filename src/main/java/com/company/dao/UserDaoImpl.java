package com.company.dao;

import com.company.model.User;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Random;

import static com.company.config.DBConfig.connect;

public class UserDaoImpl implements UserDao {
    @Override
    public String autorisation(User user) {
        Random random = new Random();
        try (Connection connection = connect();
             ResultSet resultSet = connection.createStatement().executeQuery("SELECT * FROM users where login = '" + user.getLogin() + "'")
        ) {
            if(resultSet.next()){
                if(user.getPassword().equals(resultSet.getString("password_u"))){
                    return random.nextInt() + " ";
                }else {
                    return "Неверный пароль";
                }
            }else {
                return "Нет такого логина";
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return "null";
    }
}
