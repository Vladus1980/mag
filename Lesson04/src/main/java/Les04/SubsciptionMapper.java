package Les04;

import java.sql.ResultSet;
import java.sql.SQLException;

public class SubsciptionMapper {
	
	public static Subscription map(ResultSet result) throws SQLException {
		
		int user_id = result.getInt("user_id");
		int magazine_id = result.getInt("magazine_id");
		
		return new Subscription(magazine_id, user_id);
		
	}

}
