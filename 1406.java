/*
1406 에디터 : 스택을 둘로 쪼갠다
마지막에 한꺼번에 출력할떄는 오른쪽으로 다 모으고 StringBuilder로 출력
*/
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
	
	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		String[] line = bf.readLine().split("");
		int N = Integer.valueOf(bf.readLine());
		Stack<String> left = new Stack<String>();
		Stack<String> right = new Stack<String>();
		for (int i = 0; i < line.length; i++)
		{
			left.push(line[i]);
		}
		while(N-- > 0)
		{
			String[] line2 = bf.readLine().split(" ");
			String cmd = line2[0];
			String token = "";
			if (cmd.equals("P"))
				token = line2[1];
			
			if (cmd.equals("L")) {
				if (left.isEmpty())
					continue;
				else {
					right.push(left.peek());
					left.pop();
				}
			} else if (cmd.equals("D")) {
				if (right.isEmpty()) {
					continue;
				} else {
					left.push(right.peek());
					right.pop();
				}
			} else if (cmd.equals("B")) {
				if (left.isEmpty())
					continue;
				else
					left.pop();
			} else {
				left.push(token);
			}
		}
		// 한번에 모아서 
		while(!left.empty()) {
			right.push(left.pop());
		}
		StringBuilder sb = new StringBuilder();
		while(!right.empty()) {
			sb.append(right.pop());
		}
		System.out.println(sb);
	}
}
