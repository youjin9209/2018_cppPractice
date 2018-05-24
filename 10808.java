/*
10808 알파벳 개수 - result[line.charAt(i) - 'a']++;
'a' - 'a' == 0
'b' - 'a' == 1
'c' - 'a' == 2
*/
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
	
	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		String line = bf.readLine();
		int[] result = new int[26];
		for (int i = 0; i < line.length(); i++)
			result[line.charAt(i) - 'a']++;
		for (int i = 0; i < result.length; i++) 
			System.out.print(result[i] + " ");
	}
}
