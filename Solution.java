import java.util.Scanner;

//change to Main.java before submitting
public class Solution {
	
	public static void main(String[] args) {
		Scanner fs = new Scanner(System.in);
		int T = fs.nextInt();
		for (int tc = 1; tc <= T; tc++) {
			int n = fs.nextInt();
			int[] a = new int[n];
			for (int i = 0; i < n; i++) {
				a[i] = fs.nextInt();
			}
			int count = 0;
			for (int i = 0; i < n; i++) {
				if (a[i] >= 1000) {
					count++;
				}
			}
			System.out.println(count);
		}
		fs.close();
	}
}
