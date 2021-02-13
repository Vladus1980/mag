package Les04;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class SubscriptionDao {
	
	private Connection connection;
	private PreparedStatement preparedStatement;
	public SubscriptionDao(Connection connection) {
		this.connection = connection;
	}
	
	private static String CREATE = "insert into Subscription(magazine_id, user_id) value(?,?)";
	private static String READ_BY_ID = "select * from Subscription where id = ?";
	private static String UPDATE_BY_ID = "update Subscription set magazine_id =?, user_id=? where id= ?";
	private static String DELETE_BY_ID = "delete from Subscription where id = ?";
	private static String READ_ALL = "select * from Subscription";
	
	public void insert (Subscription subscription) throws SQLException {
		preparedStatement = connection.prepareStatement(CREATE);
		preparedStatement.setInt(1, subscription.getMagazine_id());
		preparedStatement.setInt(2, subscription.getUser_id());
		preparedStatement.executeUpdate();
	}
}
