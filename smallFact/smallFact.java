import java.math.BigInteger;
import java.util.Scanner;
 
 
class smallFact
{
	
	public static void main(String args[]){
Scanner s = new Scanner(System.in);
 
	BigInteger result;
	int num;
	int lines = Integer.parseInt(s.nextLine());
	while(lines>0){
	num = s.nextInt();	
	result = fact(num);
	System.out.println(result);
	lines--;
	}
	
	}
	
	static BigInteger fact(int number){
		if(number==0||number==1)
			return(BigInteger.ONE);
			else
				return(BigInteger.valueOf(number).multiply(fact(number-1)));
		
	}
} 