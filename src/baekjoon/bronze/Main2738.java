package baekjoon.bronze;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main2738 {
 
	public static void main(String[] args) throws Exception {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
	    StringBuilder sb;
		StringTokenizer st;
		
		/*
		 *  3 3
			1 1 1
			2 2 2
			0 1 0
			3 3 3
			4 4 4
			5 5 100
		 */
		
			st=new StringTokenizer(br.readLine()," ");
			int str1=Integer.parseInt(st.nextToken());
			int str2=Integer.parseInt(st.nextToken());
			
			int[][] str=new int[str1][str2];
			for(int i=0; i<2*str1; i++) {
				int a=Integer.parseInt(st.nextToken());
				
			}
		
		    
		
		
	}
	
}


//