package eTicaretDemo;

import business.abstracts.UserService;
import business.concerete.ControlManager;
import business.concerete.UserManager;
import business.concerete.VerifyManager;
import core.concerete.GoogleAccountAdapter;
import dataAccess.concerete.UserInMemoryDao;
import entities.concerete.User;

public class Main {

	public static void main(String[] args) {
		
		User user1 = new User("Fatma Rukiye", "Kaya", "frukiyekayaa@gmail.com", "123456"); // bilgilerin tamam� do�ru

		User user2 = new User("Nur", "Y�cel", "nury�cel@", "123456"); // yanl�� mail adresi

		User user3 = new User("F", "K", "fk@gmail.com", "123456"); // K�sa isim ve soyisim

		User user4 = new User("Melis", "Ocako�lu", "melisocako�lu@gmail.com", "1234"); // K�sa parola

		User user5 = new User("Fatma Rukiye", "Kaya", "frukiyekayaa@gmail.com", "123456");
		
		User user6 = new User("�zlemd�neli@gmail.com", "654321", new GoogleAccountAdapter());
		user6.setFirstName("�zlem");
		user6.setLastName("D�neli");

		User user7 = new User("Sedef", "Keskin", "skeskin@mail.com", "123456");
		
		UserService userManager = new UserManager(
				new UserInMemoryDao(), 
				new ControlManager(), 
				new VerifyManager());

		userManager.register(user1);
		System.out.println("-------------------------------------------");

		userManager.register(user2);
		System.out.println("-------------------------------------------");

		userManager.register(user3);
		System.out.println("-------------------------------------------");

		userManager.register(user4);
		System.out.println("-------------------------------------------");

		userManager.register(user5);
		System.out.println("-------------------------------------------");

		userManager.register(user6);
		System.out.println("-------------------------------------------");

		userManager.register(user7);
		System.out.println("-------------------------------------------");

		
		userManager.signIn("frukiyekayaa@gmail.com", "123456"); // ba�ar�l� giri�
		System.out.println("\n");
		userManager.signIn("frukiyekayaa@gmail.com", "123456"); // Daha �nce giri� yap�lm��
		System.out.println("-------------------------------------------");

		userManager.signOut("frukiyekayaa@gmail.com", "123456"); // ba�ar�l� ��k��
		System.out.println("-------------------------------------------");

		userManager.signOut("frukiyekayaa@gmail.com", "123456"); // Giri� yapmadan ��k�� yapmak
	}

}
