/*
11656 접미사 
*/
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {	
	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		String line = bf.readLine();
		String[] result = new String[line.length()];
		for (int i = 0; i < line.length(); i++) {
			result[i] = line.substring(i, line.length());
		}
		Arrays.sort(result);
		for (String ans : result)
			System.out.println(ans);
	}
}
