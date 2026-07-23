class odd_even4
{
	public static void main(String args[])
	{
		int num = Integer.parseInt(args[0]);
		System.out.println("Argument : " + args[0]);
		System.out.println("enter your number");
		// check whether the given number is even or odd
		if(num % 2 == 0){
			System.out.println(" even");
		}
		else{
			System.out.println(" odd");
		}
		 
	}	
} 