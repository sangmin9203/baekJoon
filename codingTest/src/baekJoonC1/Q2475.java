package baekJoonC1;

import java.io.*;
import java.util.*;

public class Q2475 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int[] arr = new int[st.countTokens()];
		
		int sum = 0;
		
		for(int i = 0; i < arr.length; i++) {
			//Math.sqrt 제곱근 구하는 방법, Math.pow() 거듭제곱 구하는 방법
			sum += Math.pow(Double.parseDouble(st.nextToken()),2);
		}
		System.out.println(sum%10);
	}
}
