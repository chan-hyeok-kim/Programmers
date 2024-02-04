package baekjoon.bronze;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main3009 {
 
	public static void main(String[] args) throws Exception {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
	    StringBuilder sb=new StringBuilder();
		StringTokenizer st;
		
		/*
		 *  5 5
			5 7
			7 5
		 */
		int[] x=new int[3];
		int[] y=new int[3];
		
		for(int i=0; i<3; i++) {
			st=new StringTokenizer(br.readLine()," ");
			 x[i]=Integer.parseInt(st.nextToken());
			 y[i]=Integer.parseInt(st.nextToken());
		}
		
	    int missingX = 0, missingY = 0;
		for(int i=0; i<3; i++) {
	            if (x[i] == x[(i + 1) % 3]) {
	                missingX = x[(i + 2) % 3];
	            }
	            if (y[i] == y[(i + 1) % 3]) {
	                missingY = y[(i + 2) % 3];
	            }
		}
		
		
	    sb.append(missingX).append(" ").append(missingY);

		bw.write(sb.toString());
		bw.flush();
		bw.close();
		
	}
	
}


//