package com.JavaProgramExample;

public class SortNumber {

	public static void main(String[] args) {
		SortNumberProgram();
	}

	public static void SortNumberProgram() {
		int[] g = { 3, 67, 8, 98, 2, 123, 5, 1, 0 };

		int totalLength = g.length;
		int temp = 0;

		for (int i = 0; i < totalLength; i++) {
			for (int j = i + 1; j < totalLength; j++) {
				if (g[i] > g[j]) {
					temp = g[i];
					g[i] = g[j];
					g[j] = temp;

				}
			}
			System.out.println(g[i]);
		}
		System.out.println();
		System.out.println("3rd Highest number "+g[g.length - 3]);// will print the 3rd highest number
	}

}
