/*
 등차수열 : a + (n-1)d 
*/
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
	
	public static void main(String[] args) throws IOException {
		//BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		//String[] st = bf.readLine().split(" ");
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		for (int i = 1; i <= N; i++) {
			// " "
			for(int p = 1; p <= i-1; p++) {
				System.out.print(" ");
			}
			// "*"
			for(int p = 1; p <= (2*N+1)-2*i; p++) {
				System.out.print("*");
			}
			System.out.println();
		}

		for (int i = 2; i <= N; i++) {
			// " "
			for(int p = 1 ; p <= N-i; p++) {
				System.out.print(" ");
			}
			// "*"
			for(int p = 1; p <= 2*i-1; p++) {
				System.out.print("*");
			}
			
			System.out.println();
		}
	}
}
