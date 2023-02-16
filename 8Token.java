import java.util.*;
public class Token{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the limit: ");
		int n = sc.nextInt();
		sc.nextLine();

		System.out.println("Enter "+n+" numbers(seperated by space): ");
		String numList = sc.nextLine();
		
		StringTokenizer st = new StringTokenizer(numList," ");
		
		System.out.println("Numbers to add: "+ numList);


		int sum = 0;
		while(st.hasMoreTokens()){
			sum = sum + Integer.parseInt(st.nextToken());
		}
	
		System.out.println("Sum = "+sum);
	}
}		
