import java.util.Scanner;
 
class MyFirstSubmission
{
public static void main(String args[]){
int x;
Scanner myscanner = new Scanner(System.in);
while(true){
x=myscanner.nextInt();
if(x==42)
break;
else
System.out.println(x);
}
}
}  