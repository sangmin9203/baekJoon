package baekJoonC1;

import java.io.*;
import java.util.*;

public class Q1546 {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int a = Integer.parseInt(br.readLine());
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		Double[] arr = new Double[a];
		
		for(int i = 0; i < arr.length; i++) {
			arr[i] = Double.parseDouble(st.nextToken());
		}
		
		Arrays.sort(arr);
		
		Double sum = 0.0;
		for(int i = 0; i < arr.length; i++) {
			arr[i] = (arr[i] /arr[arr.length-1]) * 100;
			sum += arr[i];
		}
		
		System.out.println(sum/arr.length);
	}
}
