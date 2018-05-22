/*
스택 괄호 
-> ZeroSum
*/
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
	
	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		//Scanner sc = new Scanner(System.in);

		int N = Integer.valueOf(bf.readLine());
		
		while (N-- > 0) 
		{
			Stack<String> stack = new Stack<String>();
			String[] st = bf.readLine().split("");
			int cnt = 0;
			for (int idx = 0; idx < st.length; idx++)
			{
				// "(" 일경우 push
				if (st[idx].equals("(")) {
					stack.push(st[idx]);
					cnt++;
				}
				// ")"      pop - pop할때 isempty 확인 
				else {
					if (stack.isEmpty()) {
						cnt--;
						break;
					} else {
						stack.pop();
						cnt--;
					}
				}
					
			}
			// top에 남아있는게 없을 경우 YES
			if (stack.isEmpty() && (cnt == 0))
				System.out.println("YES");
			else 
				System.out.println("NO");
		}

	}
}
