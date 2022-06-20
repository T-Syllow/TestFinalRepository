package testFinalRepository.main;

import testFinalRepository.objects.User;

public class Main {

	public static void main(String[] args) {
		User user = new User("Mark", "123qwerty");
		System.out.println(user.toString());
		User user2 = new User("Dennis", "awsdkkk22");
		System.out.println(user2.toString());
		
		User user3 = new User("Arndold", "SchwarzWeis22");

	}

}
