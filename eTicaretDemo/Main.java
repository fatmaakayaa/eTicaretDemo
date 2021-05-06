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
		
		User user1 = new User("Fatma Rukiye", "Kaya", "frukiyekayaa@gmail.com", "123456"); // bilgilerin tamamý doðru

		User user2 = new User("Nur", "Yücel", "nuryücel@", "123456"); // yanlýþ mail adresi

		User user3 = new User("F", "K", "fk@gmail.com", "123456"); // Kýsa isim ve soyisim

		User user4 = new User("Melis", "Ocakoðlu", "melisocakoðlu@gmail.com", "1234"); // Kýsa parola

		User user5 = new User("Fatma Rukiye", "Kaya", "frukiyekayaa@gmail.com", "123456");
		
		User user6 = new User("özlemdöneli@gmail.com", "654321", new GoogleAccountAdapter());
		user6.setFirstName("Özlem");
		user6.setLastName("Döneli");

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

		
		userManager.signIn("frukiyekayaa@gmail.com", "123456"); // baþarýlý giriþ
		System.out.println("\n");
		userManager.signIn("frukiyekayaa@gmail.com", "123456"); // Daha önce giriþ yapýlmýþ
		System.out.println("-------------------------------------------");

		userManager.signOut("frukiyekayaa@gmail.com", "123456"); // baþarýlý çýkýþ
		System.out.println("-------------------------------------------");

		userManager.signOut("frukiyekayaa@gmail.com", "123456"); // Giriþ yapmadan çýkýþ yapmak
	}

}
