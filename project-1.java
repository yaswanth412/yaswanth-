
import java.util.*;
public class Project1 {

	public static void main(String[] args) {

		        Scanner sc = new Scanner(System.in);
		        System.out.println("1. Fibonacci Series");
		        System.out.println("2. Even Number Series");
		        System.out.println("3. Odd Number Series");
		        System.out.println("4. Square Number Series");
		        System.out.print("Enter your choice: ");
		        int choice = sc.nextInt();
		        System.out.print("Enter number of terms: ");
		        int n = sc.nextInt();
		        switch(choice) {
		            case 1:
		                int a = 0, b = 1;
		                System.out.println("Fibonacci Series:");
		                for(int i = 1; i <= n; i++) {
		                    System.out.print(a + " ");
		                    int c = a + b;
		                    a = b;
		                    b = c;
		                }
		                break;
		            case 2:
		                System.out.println("Even Number Series:");
		                for(int i = 1; i <= n; i++) {
		                    System.out.print(i * 2 + " ");
		                }
		                break;
		            case 3:
		                System.out.println("Odd Number Series:");
		                for(int i = 0; i < n; i++) {
		                    System.out.print((2 * i + 1) + " ");
		                }
		                break;
		            case 4:
		                System.out.println("Square Number Series:");
		                for(int i = 1; i <= n; i++) {
		                    System.out.print((i * i) + " ");
		                }
		                break;
		            default:
		                System.out.println("Invalid Choice");
		        }
		    }
		

	}
