package baekJoonC1;

import java.io.*;
import java.util.*;

public class Q2577 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int re = 1;
		for(int i = 0; i < 3; i++) {
			re *= Integer.parseInt(br.readLine());
		}
		
		int[] arr = new int[10];
		
		do {
		 int a = re % 10;
		 re /= 10;
		 arr[a]++;
		} while(re > 0);
		
		for(int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}
}
