/*
영역 구분하기
ex / 수열으로 안되는 부분 + 수열로 되는 부분 + 안되는 부분 이런식으로 
*/
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
	
	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.valueOf(bf.readLine());
		// (1) * 
		for(int i = 1; i < N; i++)
			System.out.print(" ");
		System.out.println("*");
		if (N >= 2) {
			// (2) 
			for(int i = 2; i < N; i++)
			{
				// 2-1
				for (int p = 1; p <= N-(i); p++) 
					System.out.print(" ");
				// 2-2
				System.out.print("*");
				// 2-3
				for (int p = 1; p <= 2*(i-1)-1; p++) 
					System.out.print(" ");
				// 2-4
				System.out.print("*");
				System.out.println();
			}
			// (3) 2N + 1
			for(int i = 1; i <= 2*N - 1; i++) 
			{
				System.out.print("*");
			}
		}
		
	}
}
