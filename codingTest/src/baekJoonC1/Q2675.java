package baekJoonC1;

import java.io.*;
import java.util.*;

public class Q2675 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int repeat = Integer.parseInt(br.readLine());
		String[] arr = new String[repeat];
		
		for(int i = 0; i < repeat; i++) {
			String recieve = "";
			StringTokenizer st = new StringTokenizer(br.readLine());
			int j = Integer.parseInt(st.nextToken());
			String x = st.nextToken();
			int wordlength = x.length();
			
			for(int add = 0; add < wordlength; add++) {
				for(int re = 0; re < j; re++) {
					recieve += x.charAt(add);
				}
			}
			
			arr[i] = recieve;
		}
		
		for(int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}
}
