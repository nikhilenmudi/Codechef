import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
class TS
{
 
	
	public static void main(String args[]) throws NumberFormatException, IOException{
		 
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		PrintWriter p = new PrintWriter(System.out);
		int[] a =  new int[Integer.parseInt(reader.readLine())];
		for(int i=0;i<a.length;i++){
			a[i]=Integer.parseInt(reader.readLine());
			
		}
		java.util.Arrays.sort(a);
		for(int i=0;i<a.length;i++){
			p.println(a[i]);
		}
		p.flush();
}
} 