package baekjoon.bronze;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main2753 {
 
	public static void main(String[] args) throws Exception {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
	    StringBuilder sb=new StringBuilder();
		
		/*
		 *  2015
		 */
		int year=Integer.parseInt(br.readLine());
		
		if((year%4==0 && year%100!=0)|| year%400==0) {
			sb.append("1");
		}else {
			sb.append("0");
		}
		
		
		bw.write(String.valueOf(sb));
		bw.flush();
		bw.close();
		
	}
	
}


//