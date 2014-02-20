import java.util.Scanner;
 
 
class Holes
{
	
	public static void main(String args[]){
Scanner s = new Scanner(System.in);
 
	int count = 0;
	String string=null;
	int lines = Integer.parseInt(s.nextLine());
	while(lines>0){
	string = s.nextLine();
	char c[] = string.toCharArray();
	for(int i =0;i<c.length;i++){
		if(c[i]=='A'||c[i]=='D'||c[i]=='O'||c[i]=='P'||c[i]=='Q'||c[i]=='R'){
			count++;
		}
		else if(c[i]=='B')
			count+=2;
		
	}
	System.out.println(count);
	lines--;
	count=0;
	}
	
	}
	
} 