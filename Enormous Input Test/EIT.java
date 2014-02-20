import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
 
 
 
class EIT
{
 
	public static void main(String args[]) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] v = br.readLine().split(" ");
		long n = Long.parseLong(v[0]);
		long k = Long.parseLong(v[1]);
		int c=0;
		for(int i=1;i<=n;i++){
			long number = Long.parseLong(br.readLine());
			if(number%k==0){
				c++;
			}
		
			
		}
		System.out.println(c);
		
	}
} 