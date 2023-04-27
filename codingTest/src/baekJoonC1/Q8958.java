package baekJoonC1;

import java.io.*;
import java.util.*;

public class Q8958 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		int repeat = Integer.parseInt(br.readLine());
		
		for(int i = 0; i < repeat; i++) {
			String que = br.readLine();
			int result = 0;
			int con = 1;
			for(int j = 0; j < que.length(); j++) {
				if( que.charAt(j) == 'O' ) {
					result = result + con;
					con++;
				} else {
					con = 1;
				}
			}
			
			sb.append(result+"\n");
		}
		
		System.out.println(sb);
	}
}
