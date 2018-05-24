/*
10820 문자열 분석
*/
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
	
	public static void main(String[] args) throws IOException {
		//BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		Scanner sc = new Scanner(System.in);
		
		while (sc.hasNextLine())
		{
			int upper = 0;
			int lower = 0;
			int digit = 0;
			int blank = 0;
			String line = sc.nextLine();
			StringBuilder sb = new StringBuilder();
			for (int i = 0; i < line.length(); i++)
			{
				char c = line.charAt(i);
				if (c >= 'A' && c <= 'Z') // 대
					upper++;
				else if (c >= 'a' && c <= 'z') // 소
					lower++;
				else if (c >= '0' && c <= '9') // 숫
					digit++;
				else if (c == ' ')
					blank++;
			}
			sb.append(lower);
			sb.append(" " + upper);
			sb.append(" " + digit);
			sb.append(" " + blank);
			System.out.println(sb);
		}
	}
}
