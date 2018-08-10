package algorithm_main;

import java.util.Scanner;

public class test {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int max = 0;
		int idx = 0;
		for (int i = 1; i <= 5; i++) {
			int sum = 0;
			for (int j = 1; j <= 4; j++) {
				int score = sc.nextInt();
				sum += score;
			}
			if (max < sum) {
				max = sum;
				idx = i;
			}
		}
		System.out.println(idx + " " + max);
	}
}
