/*
queue에서 get 쓰고 싶으면 형변환 !!!
((LinkedList<Integer>) queue).get(queue.size()-1)
*/
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
	
	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.valueOf(bf.readLine());
		Queue<Integer> queue = new LinkedList<Integer>();
		StringBuilder sb = new StringBuilder();
		while(N-- > 0)
		{
			String[] line = bf.readLine().split(" ");
			String cmd = line[0];
			if (cmd.equals("push")) {
				int X = Integer.valueOf(line[1]);
				queue.add(X);
			} else if (cmd.equals("pop")) {
				if (queue.isEmpty()) {
					System.out.println("-1");
				} else {
					System.out.println(queue.poll());
				}
			} else if (cmd.equals("size")) {
				System.out.println(queue.size());
			} else if (cmd.equals("empty")) {
				if (queue.isEmpty()) {
					System.out.println("1");
				} else {
					System.out.println("0");
				}
			} else if (cmd.equals("front")) {
				if (queue.isEmpty()) {
					System.out.println("-1");
				} else {
					System.out.println(queue.peek());
				}
			} else { // back
				if (queue.isEmpty()) {
					System.out.println("-1");
				} else {
					System.out.println(((LinkedList<Integer>) queue).get(queue.size()-1));
				}
			}
				
		}
	}
}
