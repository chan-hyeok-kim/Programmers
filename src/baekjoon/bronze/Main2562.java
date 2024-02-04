package baekjoon.bronze;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main2562 {
	public static void main(String[] args) throws Exception {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
	    StringBuilder[] sb=new StringBuilder[2];
		StringTokenizer st;
		sb[0] = new StringBuilder(); 
        sb[1] = new StringBuilder();
		/*
		 *  1
		 */
	    
	    
	    int max=0;
	    int order=0;
		for(int i=0; i<9; i++) {
			st=new StringTokenizer(br.readLine());
			int num=Integer.parseInt(st.nextToken());
			if(num>max) {
				max=num;
				order=i+1;
			}
		}
		sb[0].append(max);
		sb[1].append(order);
		bw.write(String.valueOf(sb[0]));
		bw.newLine();
		bw.write(String.valueOf(sb[1]));
		
		bw.flush();
		bw.close();
		
	}
	
}


//