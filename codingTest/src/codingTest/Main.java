package codingTest;

import java.io.*;
import java.util.*;

public class Main {

	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		/* BufferedReader 속도는 빠르나 Scanner 클래스에 비해 사용이 힘듬
		 * throws IOException 필수!
		 * nextToken() 으로 읽을 때 String으로만 받을 수 있음
		 * StringToeknizer*
		 * 
		 * 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 */
		String word = st.nextToken();
		
		word = word.toUpperCase();
		
		/* 알파벳은 대문자 A 65 ~ Z 90
		 *          소문자 a 97 ~ z 122 
		 * 의 인덱스(원소)를 갖는다.  */
		 
		int[] check = new int[26];

		char[] arr = word.toCharArray();
		
		for(int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
		
		System.out.println("///////////////");
		for(int i = 0; i < arr.length; i++) {
			check[arr[i]-'A']++;
			/* arr[arr[i]-65]++; 숫자 또는 char 형태로 계산하는 방법이 있으니 참고 */
		}

		char result = ' ';
		int max = 0;

		for(int i = 0; i < check.length; i++) {
			if( max < check[i] ) {
				max = check[i];
				result = (char) (i + 'A');
			} else if( max > 0 && check[i] == max ) {
				result = '?';
				break;
			}
		}
		
		System.out.println(result);
	}
}
