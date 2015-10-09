package UsingValidator;
import java.util.Scanner;

public class User {
	private String name;
	private int age;
	private int height;
	private int weight;
	private double favNumber;
	
	
	Scanner sc = new Scanner(System.in);
	
	public String getName() {
		return name;
	}
	public void setName(String prompt) {
		this.name = Validator.getString(sc, prompt);
	}
	public int getAge() {
		return age;
	}
	public void setAge(String prompt, int min, int max) {
		this.age = Validator.getInt(sc, prompt, min, max);
	}
	public int getHeight() {
		return height;
	}
	public void setHeight(String prompt, int min, int max) {
		this.height = Validator.getInt(sc, prompt, min, max);
	}
	public int getWeight() {
		return weight;
	}
	public void setWeight(String prompt, int min, int max) {
		this.weight = Validator.getInt(sc, prompt, min, max);
	}
	public double getFavNumber() {
		return favNumber;
	}
	public void setFavNumber(String prompt, double min, double max) {
		this.favNumber = Validator.getDouble(sc, prompt, min, max);
	}
	
	

}
