package Les04;

import java.sql.ResultSet;
import java.sql.SQLException;

public class MagazineMapper {
	
public static Magazine map(ResultSet result) throws SQLException {
		
		String magazine_name = result.getString("magazine_name");
		int magazine_pages = result.getInt("magazine_pages");
		double magazine_price = result.getDouble("magazine_price");
		
		return new Magazine(magazine_name, magazine_pages, magazine_price);
		
	}


}