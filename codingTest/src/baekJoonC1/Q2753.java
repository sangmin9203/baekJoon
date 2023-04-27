package baekJoonC1;

import java.io.*;
import java.util.*;

public class Q2753 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int year = Integer.parseInt(br.readLine());
		int result = 0;
		
		if( year%4==0 && (year%100!=0 || year%400==0) ) {
			result = 1;
		}
		
		System.out.println(result);
	}
}
