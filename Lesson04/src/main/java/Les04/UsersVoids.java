package Les04;

import java.util.ArrayList;
import java.util.List;

public class UsersVoids {
	
	private List<User> userList = new ArrayList<User>();
	private static UsersVoids usersVoids;
	
	private UsersVoids() {
		
	}
	
	public static UsersVoids getUsersVoids() {
		if (usersVoids== null) {
			usersVoids = new UsersVoids();
		}
		return usersVoids;
		
	}
	
	public List<User> getUserList(){
		return userList;
	}
	
	public void newUser(User user) {
		userList.add(user);
	}
	
	public User getUser(String user_email) {
		return userList.stream().filter(user -> user.getUser_email().equals(user_email)).findAny().orElse(null);
	}

}
