package baekJoonC1;

import java.io.*;
import java.util.*;

public class Q2439 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int repeat = Integer.parseInt(st.nextToken());
		
		for(int i = 1; i <= repeat; i++) {
			for(int j = 0; j < repeat - i; j++) {
				System.out.print(" ");
			}
			for(int k = 0; k < i ; k++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
