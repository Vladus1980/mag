package Les04;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class MagazineDao {
	
	private Connection connection;
	private PreparedStatement preparedStatemant;

	public MagazineDao(Connection connection) {

		this.connection = connection;
	}

	private static String CREATE = "insert into Magazine(magazine_name, magazine_pages, magazine_price) value(?,?,?)";
	private static String READ_BY_ID = "select * from Magazine where id = ?";
	private static String UPDATE_BY_ID = "update Magazine set magazine_name =?, magazine_pages=?, magazine_price=?, where id= ?";
	private static String DELETE_BY_ID = "delete from Magazine where id = ?";
	private static String READ_ALL = "select * from Magazine";

	public void insert(Magazine magazine) throws SQLException {
		preparedStatemant = connection.prepareStatement(CREATE);
		preparedStatemant.setString(1, magazine.getMagazine_name());
		preparedStatemant.setInt(2, magazine.getMagazine_pages());
		preparedStatemant.setDouble(3, magazine.getMagazine_price());
		preparedStatemant.executeUpdate();
	}

	public Magazine read(int id) throws SQLException {
		preparedStatemant = connection.prepareStatement(READ_BY_ID);
		preparedStatemant.setInt(1, id);
		ResultSet resultSet = preparedStatemant.executeQuery();
		resultSet.next();

		return MagazineMapper.map(resultSet);

	}
	
	public void update(Magazine magazine) throws SQLException {
		preparedStatemant = connection.prepareStatement(UPDATE_BY_ID);
		preparedStatemant.setString(1, magazine.getMagazine_name());
		preparedStatemant.setInt(2, magazine.getMagazine_pages());
		preparedStatemant.setDouble(3, magazine.getMagazine_price());
		preparedStatemant.setInt(4, magazine.getId());
		preparedStatemant.executeUpdate();
	}
	
	public void delete(int id) throws SQLException {
		preparedStatemant = connection.prepareStatement(DELETE_BY_ID);
		preparedStatemant.setInt(1, id);
		preparedStatemant.executeUpdate();
	}
	
	public List<Magazine> readAll() throws SQLException{
		
		List<Magazine> MagazineList = new ArrayList<Magazine>();
		preparedStatemant = connection.prepareStatement(READ_ALL);
		ResultSet resultSet = preparedStatemant.executeQuery();
		while (resultSet.next()) {
			MagazineList.add(MagazineMapper.map(resultSet));
			
		}
		return MagazineList;
		
	}
}

