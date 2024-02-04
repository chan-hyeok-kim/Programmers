package baekjoon.bronze;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class Main10810 {
	public static void main(String[] args) throws Exception {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
	    StringBuilder sb=new StringBuilder();
		StringTokenizer st;
		
		/*
		 *  5 4    ->총 바구니수, m번 공,m개의 줄
			1 2 3
			3 4 4
			1 4 1
			2 2 2
		 */
	    
        st=new StringTokenizer(br.readLine()," ");
	    int basket=Integer.parseInt(st.nextToken());
	    int m=Integer.parseInt(st.nextToken());

        Map<Integer, Integer> map=new HashMap<Integer, Integer>();
        
        for(int i=0; i<m; i++) {
        	st=new StringTokenizer(br.readLine()," ");
        	int start=Integer.parseInt(st.nextToken());
        	int end=Integer.parseInt(st.nextToken());
        	int k=Integer.parseInt(st.nextToken());
        	
	        for(int j=start; j<=end; j++) {
	        	map.put(j, k);
	        }
        }
        
        for(int i=1; i<=basket; i++) {
        	if(map.get(i)==null) {
        		sb.append(0).append(" ");
            }else {
            	sb.append(map.get(i)).append(" ");
        	}
        }
        
		bw.write(String.valueOf(sb));
		bw.flush();
		bw.close();
		
	}
	
}


//