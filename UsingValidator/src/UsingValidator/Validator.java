package UsingValidator;
import java.util.Scanner;

public class Validator {
	public static String getString(Scanner sc, String prompt)
	{
	    System.out.print(prompt);
//	    String s = sc.next();  // read user entry
//	    sc.nextLine();  // discard any other data entered on the line
//	    return s;
	    return sc.nextLine();
	}
	
	public static int getInt(Scanner sc, String prompt)
	{
	    int i = 0;
	    boolean isValid = false;
	    while (isValid == false)
	    {
	        System.out.print(prompt+" ");
	        if (sc.hasNextInt())
	        {
	            i = sc.nextInt();
	            isValid = true;
	        }
	        else
	        {
	            System.out.println("Error! Invalid integer value. Try again.");
	        }
	        sc.nextLine();  // discard any other data entered on the line
	    }
	    return i;
	}
	
	public static int getInt(Scanner sc, String prompt, int min, int max)
			{
			    int i = 0;
			    boolean isValid = false;
			    while (isValid == false)
			    {
			        i = getInt(sc, prompt);
			        if (i > max || i < min)
			            System.out.printf("Error! Number must be less than %d and greater than %d.\n", max, min);
			        else
			            isValid = true;
			    }
			    return i;
			}

	
	public static double getDouble(Scanner sc, String prompt)
	{
	    double d = 0;
	    boolean isValid = false;
	    while (isValid == false)
	    {
	        System.out.print(prompt + " ");
	        if (sc.hasNextDouble())
	        {
	            d = sc.nextDouble();
	            isValid = true;
	        }
	        else
	        {
	            System.out.println("Error! Invalid decimal value. Try again.");
	        }
	        sc.nextLine();  // discard any other data entered on the line
	    }
	    return d;
	}
	
	public static double getDouble(Scanner sc, String prompt, double min, double max)
			{
			    double d = 0;
			    boolean isValid = false;
			    while (isValid == false)
			    {
			        d = getDouble(sc, prompt);
			        if (d > max || d < min)
			            System.out.printf("Error! Number must be less than %.2f and greater than %.2f.\n", max, min);
			        else
			            isValid = true;
			    }
			    return d;
			}
}
