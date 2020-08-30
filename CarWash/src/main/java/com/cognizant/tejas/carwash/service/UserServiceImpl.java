package com.cognizant.tejas.carwash.service;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Service;

import com.cognizant.tejas.carwash.model.User;

@Service("userService")
public class UserServiceImpl implements UserService{

@Autowired
	private JdbcTemplate jdbcTemplate;
	
public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
	this.jdbcTemplate = jdbcTemplate;
}
	
	@Override
	public boolean addUser(User register) {
		String sql = "insert into user_table(firstname,lastname,dateofbirth,gender,contact_number,address, category,username,password) values(?,?,?,?,?,?,?,?,?)";
		
		try {
			int counter = jdbcTemplate.update(sql,
					new Object[] { register.getFirstName(), register.getLastName(), register.getDateOfBirth(),
							register.getSex(), register.getContactNumber(),register.getAddress(), register.getCategory(),
							register.getUserId(), register.getPassword()});

			return true;

		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
		
	}


	@Override
	public List<User> read() {

		String sql2 ="select * from user_table";
		List<User> userList = jdbcTemplate.query(sql2, new RowMapper<User>() {
			
			@Override
			public User mapRow(ResultSet set, int rowNum) throws SQLException{
				
				User user= new User();
				
				user.setUserId(set.getString("username"));
				user.setPassword(set.getString("password"));
				user.setCategory(set.getString("category"));
				
				
				return user;
				
				
			}
		});
	
		
		return userList;
	}


	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}




		
		
	

	
	
}
