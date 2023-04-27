package baekJoonC1;

import java.io.*;
import java.util.*;

public class Q2920 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int[] arr = new int[st.countTokens()];
		int[] ascending = {1,2,3,4,5,6,7,8};
		int[] descending = {8,7,6,5,4,3,2,1};
		
		for(int i = 0; i < arr.length; i ++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		
		if(Arrays.equals(arr, ascending)) {
			System.out.println("ascending");
		}  else if(Arrays.equals(arr, descending)) {
			System.out.println("descending");
		} else {
			System.out.println("mixed");
		}
	}
}
