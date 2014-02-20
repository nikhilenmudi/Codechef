import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;

class Triangle {	
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		PrintWriter p = new PrintWriter(System.out);
		int cases = Integer.parseInt(br.readLine());
		int tsize;
		int[][] triangle;
		while(cases--!=0){
			StringTokenizer s;
			tsize=Integer.parseInt(br.readLine());
			triangle = new int[tsize][tsize];
			for(int i=0;i<tsize;i++){
			int j=0;
				s= new StringTokenizer(br.readLine().trim()," ");
				
				while(s.hasMoreTokens()){
					triangle[i][j]=Integer.parseInt(s.nextToken());
					j++;
				}
			}
			
			for(int k=tsize-2;k>=0;k--){
				for(int x=0;x<=k;x++){
					triangle[k][x]+=Math.max(triangle[k+1][x], triangle[k+1][x+1]);
				}
			}
			p.println(triangle[0][0]);
		}p.flush();
	}	
}	
