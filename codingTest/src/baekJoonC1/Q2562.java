package baekJoonC1;

import java.io.*;
import java.util.*;

public class Q2562 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int[] arr = new int[9];
		int[] arr2 = new int[9];
		for(int i = 0; i < 9; i++) {
			int a = Integer.parseInt(br.readLine());
			arr[i] = a;
			arr2[i] = a;
		}
		
		Arrays.sort(arr);
		int max = arr[8];
		int cnt = 0;
		for(int i = 0; i < arr2.length; i++) {
			cnt++;
			if( max == arr2[i] ) {
				break;
			}
		}
		
		System.out.println(max);
		System.out.print(cnt);
	}
}
