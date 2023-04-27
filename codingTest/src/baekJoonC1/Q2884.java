package baekJoonC1;

import java.io.*;
import java.util.*;

public class Q2884 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int hour = Integer.parseInt(st.nextToken());
		int min = Integer.parseInt(st.nextToken());
		
		if( hour == 0 && (min - 45) < 0) {
			hour = 24;
		}
		
		if( (min-45) < 0 ) {
			hour--;
			min = 60 - (45-min);
		} else {
			min = min-45;
		}
		
		System.out.println(hour + " " + min);
	}
}
