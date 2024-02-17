import java.util.*;
public class ReverseNumber 
{
    	public static void main(String[] args) 
	{
                System.out.println("My Name Is Krinshsmith Kava");
                System.out.println("Er_no :: 220130318102");
                Scanner sc= new Scanner(System.in);
		System.out.print("Enter an Integer :: ");
        	int n = sc.nextInt();
	      	int reverse = reverseNumber(n);
        	System.out.println("Reverse of " + n + " is :: " + reverse);
	      	sc.close();
  	}
public static int reverseNumber(int number) 
{
        int reversedNumber = 0;
	 while (number != 0) 
	{
            int digit = number % 10;
            reversedNumber = reversedNumber * 10 + digit;
            number /= 10;
        }
	 return reversedNumber;
    }
}
