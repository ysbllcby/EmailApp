package emailapp;

public class EmailApp {

	public static void main(String[] args) {
		Email email1 = new Email("John", "Smith");

		email1.setAltEmail("asdf@gmail.com");
		System.out.println(email1.getAlternateEmail());
	}

}
