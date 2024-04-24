import java.util.*;
public class Sum_of_array 
{
    	public static void main(String[] args) 
	{
        	System.out.println("My Name Is Krinshsmith Kava");
                System.out.println("Er_no :: 220130318102");
                Scanner sc=new Scanner(System.in);
        	System.out.print("Enter the size of the array :: ");
        	int size = sc.nextInt();
        	int[] arr = new int[size];
        	int sum = 0;
	      	System.out.println("Enter the elements of the array ::");
        	for (int i=0;i<size;i++) 
	      	{
            		arr[i] = sc.nextInt();
            		sum+= arr[i];
        	}
        	System.out.println("The Sum of the Array Elements is :: " + sum);
  }
}
