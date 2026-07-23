import java.util.Scanner;

public class ifelsedemo_1 {
	public static void main(String[]args){
		Scanner sc= new Scanner(System.in);
		int win_ratio=80;
		
		//condition: checks if win ratio is greater than 80//
		if (win_ratio >= 70){
			System.out.println("result: top in the table!");
		} else{
			System.out.println("result: not in the top!");
		}
	System.out.println("execution complete");
	}
} 
	