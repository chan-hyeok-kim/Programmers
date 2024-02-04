package baekjoon.bronze;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main11382 {
 
	public static void main(String[] args) throws Exception {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
	    StringBuilder sb=new StringBuilder();
		StringTokenizer st;
		
		/*
		 *  5 5 5
		 */
		long[] x=new long[3];
		st=new StringTokenizer(br.readLine()," ");
		
		for(int i=0; i<3; i++) {
			x[i]=Long.parseLong(st.nextToken());
		}
		
	    sb.append(x[0]+x[1]+x[2]);

		bw.write(String.valueOf(sb));
		bw.flush();
		bw.close();
		
	}
	
}


//