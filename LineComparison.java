package com.bridgelabs.problem8Emp;

import java.util.Scanner;

import com.bridgelabs.problemday3.LineComparisonUC3;

public class LineComparison {

	public LineComparison() {

		getLineCordinate();
	}

	public static void main(String[] args) {
		System.out.println("Welcome to Line Comparison Computation");

		LineComparison obj1 = new LineComparison();
	}

	public static void getLineCordinate() {
//		Integer lengthL1 = null, lengthL2 = null;
		Scanner scanobj = new Scanner(System.in);
		int[] lineLengthArray = new int[2];
		for (int i = 0; i < lineLengthArray.length; i++) {
			// System.out.println("enter the start and end cordinate of Line l1: ");
			System.out.println("enter the start and end  cordinate of Line L" + (i + 1) + " :");
			int x1 = scanobj.nextInt();
			int y1 = scanobj.nextInt();
			int x2 = scanobj.nextInt();
			int y2 = scanobj.nextInt();
			System.out.println("line L" + (i + 1) + " start cordinates (x1 ,y1 ) = ( " + x1 + "," + y1 + " )");
			System.out.println("line L" + (i + 1) + "  end cordinate (x2 ,y2) = ( " + x2 + "," + y2 + " )");

			int lineLength = calculateLineLength(x1, y1, x2, y2);
			lineLengthArray[i] = lineLength;
			System.out.println(" length of line: " + lineLength);

		}

		String len1 = String.valueOf(lineLengthArray[0]);
		String len2 = String.valueOf(lineLengthArray[1]);
		int res = len1.compareTo(len2);
		if (res == 0) {
			System.out.println("Line L1 and L2 are equal");
		} else if (res > 0) {
			System.out.println("Line L1 is greater than L2 ");
		} else {
			System.out.println("Line L1 is less than L2 ");
		}

	}

	private static int calculateLineLength(int x1, int y1, int x2, int y2) {
		int length = (int) Math.sqrt((Math.pow((x2 - x1), 2)) + (Math.pow((y2 - y1), 2)));
		return length;
	}

}
