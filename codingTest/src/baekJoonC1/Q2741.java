package baekJoonC1;

import java.io.*;
import java.util.*;

public class Q2741 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		int re = Integer.parseInt(br.readLine());
		
		for( int i = re; i >= 1; i-- ) {
			sb.append(i+"\n");
		}
		
		System.out.print(sb);
	}

}
