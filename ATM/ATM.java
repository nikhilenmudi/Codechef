import java.text.DecimalFormat;
import java.util.Scanner;
class ATM
{
public static void main(String args[])
{
int n;
float m;
Scanner s=new Scanner(System.in);
n=s.nextInt();
m=s.nextFloat();
DecimalFormat df = new DecimalFormat("0.00");
 
while(true){
if(n % 5==0 && n+0.5<=m){
	m=m-n;
	System.out.println(df.format(m-0.50));
	break;
}
	else
		System.out.println(df.format(m));
break;
	
}
}
}