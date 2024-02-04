package baekjoon.bronze;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main15894 {
 
	public static void main(String[] args) throws Exception {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
	    StringBuilder sb=new StringBuilder();
		
		/*
		 *  1
		 */
		long n=Integer.parseInt(br.readLine());
		
		sb.append(n*4);
		
		bw.write(String.valueOf(sb));
		bw.flush();
		bw.close();
		
	}
	
}


//