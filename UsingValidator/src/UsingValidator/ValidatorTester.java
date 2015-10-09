package UsingValidator;

public class ValidatorTester {
	public static void main(String[] args) {
		User person = new User();
		
		person.setName("Name: ");
		person.setAge("Age: 1 - 100", 1, 100);
		person.setHeight("Height: 36 - 92", 36, 92);
		person.setWeight("Weight: 80 - 400", 80, 400);
		person.setFavNumber("Favorite Numner: 0 - 1", 0, 1);
		
		System.out.println("Name:\t" + person.getName());
		System.out.println("Age:\t" + person.getAge());
		System.out.println("Height:\t" + person.getHeight());
		System.out.println("Weight:\t" + person.getWeight());
		System.out.println("Number:\t" + person.getFavNumber());
	}
}
