package testFinalRepository.objects;

public class User {
  
	public static String username;
	public static String password;
  
  
	public static boolean isEingabekorrekt(String name, String pwd) {
		if(name.equals(username) && pwd.equals(password)) {
			return true;
		}
		return false;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
	
	
}
