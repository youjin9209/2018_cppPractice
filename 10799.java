/*
10799 쇠막대기
-> 이전 index저장하고 1 차이날경우 레이저 ㅇㅋ 
*/
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
	
	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		String[] line = bf.readLine().split("");
		Stack<String> stack = new Stack<String>();
		int count = 0;
		int preIdx = 0;
		for (int i = 0; i < line.length; i++)
		{
			String token = line[i];
			if (token.equals("(")) {
				stack.push(token);
				preIdx = i;
			} else {
				if (stack.peek().equals("(") && ((i - preIdx) == 1)) {
					stack.pop();
					count += stack.size();
				} else {
					stack.pop();
					count += 1;
				}
			}
		}
		System.out.println(count);
	}
}
