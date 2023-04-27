package baekJoonC1;

import java.io.*;
import java.util.*;

public class Q2908 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int q1 = Integer.parseInt(st.nextToken());
		int q2 = Integer.parseInt(st.nextToken());
		
		q1 = reverse(q1);
		q2 = reverse(q2);
		
		if(q1>q2) {
			System.out.println(q1);
		} else {
			System.out.println(q2);
		}
		
	}
	
	static int reverse(int i) {
		int[] arr = new int[3];
		
		for(int x = 0; x < arr.length; x++) {
			arr[x] = i%10;
			i /= 10;
		}
		
		for(int x = 0; x < arr.length; x++) {
			i = i*10 + arr[x];
		}
		
		return i;
	}
}
