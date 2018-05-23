/*
규칙 찾기 - 1 ~ M-1번 push(pop())
          M번째 pop()
*/
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
	
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);	
		int N = sc.nextInt();
		int aN = N;
		int M = sc.nextInt();
		Queue<String> queue = new LinkedList<String>();
		int i = 1;
		int idx = 1;
		StringBuilder sb = new StringBuilder();
		sb.append("<");
		while (N-- > 0)
		{
			String a = String.valueOf(i);
			queue.add(a);
			i++;
		}
		N = aN;
		while(!queue.isEmpty())
		{
			for (int p = 1; p <= M; p++) 
			{
				if (p == M) {
					if (idx == N) {
						sb.append(queue.poll());
						sb.append(">");
					} else {
						sb.append(queue.poll());
						sb.append(", ");
						idx++;
					}
				}
				else
					queue.add(queue.poll());
			}
		}
		System.out.println(sb);
	}
}
