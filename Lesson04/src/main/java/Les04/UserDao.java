package Les04;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class UserDao {

	private Connection connection;
	private PreparedStatement preparedStatemant;

	public UserDao(Connection connection) {

		this.connection = connection;
	}

	private static String CREATE = "insert into User(user_firstname, user_lastname, user_age, user_email, user_pass) value(?,?,?,?,?)";
	private static String READ_BY_ID = "select * from User where id = ?";
	private static String UPDATE_BY_ID = "update User set user_firstname =?, user_lastname=?, user_age=?, user_email=?, user_pass=? where id= ?";
	private static String DELETE_BY_ID = "delete from User where id = ?";
	private static String READ_ALL = "select * from User";

	public void insert(User user) throws SQLException {
		preparedStatemant = connection.prepareStatement(CREATE);
		preparedStatemant.setString(1, user.getUser_firstname());
		preparedStatemant.setString(2, user.getUser_lastname());
		preparedStatemant.setInt(3, user.getUser_age());
		preparedStatemant.setString(4, user.getUser_email());
		preparedStatemant.setString(5, user.getUser_pass());
		preparedStatemant.executeUpdate();
	}

	public User read(int id) throws SQLException {
		preparedStatemant = connection.prepareStatement(READ_BY_ID);
		preparedStatemant.setInt(1, id);
		ResultSet resultSet = preparedStatemant.executeQuery();
		resultSet.next();

		return UserMapper.map(resultSet);

	}
	
	public void update(User user) throws SQLException {
		preparedStatemant = connection.prepareStatement(UPDATE_BY_ID);
		preparedStatemant.setString(1, user.getUser_firstname());
		preparedStatemant.setString(2, user.getUser_lastname());
		preparedStatemant.setInt(3, user.getUser_age());
		preparedStatemant.setString(4, user.getUser_email());
		preparedStatemant.setString(5, user.getUser_pass());
		preparedStatemant.setInt(6, user.getId());
		preparedStatemant.executeUpdate();
	}
	
	public void delete(int id) throws SQLException {
		preparedStatemant = connection.prepareStatement(DELETE_BY_ID);
		preparedStatemant.setInt(1, id);
		preparedStatemant.executeUpdate();
	}
	
	public List<User> readAll() throws SQLException{
		
		List<User> userList = new ArrayList<User>();
		preparedStatemant = connection.prepareStatement(READ_ALL);
		ResultSet resultSet = preparedStatemant.executeQuery();
		while (resultSet.next()) {
			userList.add(UserMapper.map(resultSet));
			
		}
		return userList;
		
	}
}