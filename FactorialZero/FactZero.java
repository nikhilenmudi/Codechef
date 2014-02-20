import java.util.Scanner;
 
 
class FactZzero
{
	
	public static void main(String args[]){
Scanner s = new Scanner(System.in);
long count;
long number = 0;
int lines = s.nextInt();
 
while(lines--!=0){
	number = s.nextLong();
	count=0;
	while(number/5!=0){
		count+=number/5;
		number/=5;
	}
	System.out.println(count);		
}	
}
} 