package fr.papounworld.bddspring.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;
 

import org.springframework.jdbc.core.RowMapper;

import fr.papounworld.bddspring.model.AppUser;
 
public class AppUserMapper implements RowMapper<AppUser> {
 
    public static final String BASE_SQL //
            = "Select u.User_Id, u.User_Name, u.Encryted_Password From App_User u ";
 
    
    @Override
    public AppUser mapRow(ResultSet resultSet, int rowNum) throws SQLException {
 
        Long userId = resultSet.getLong("User_Id");
        String userName = resultSet.getString("User_Name");
        String encrytedPassword = resultSet.getString("Encryted_Password");
 
        return new AppUser(userId, userName, encrytedPassword);
    }
 
}