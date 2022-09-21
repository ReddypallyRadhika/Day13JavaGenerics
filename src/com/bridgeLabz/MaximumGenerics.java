/**
 * 
 */
package com.bridgeLabz;

/**
 * @author hp
 *
 */
/*
 * UC3 Given 3 Strings find the maximum
 * E.g. Apple Peach Banana
 */
public class MaximumGenerics<T> {

	T x, y, z;

	public MaximumGenerics(T x, T y, T z) {
		// TODO Auto-generated constructor stub
		this.x = x;
		this.y = y;
		this.z = z;
	}

	public static String testMaximum(String x, String y, String z) {
		String max = x;
		if (y.compareTo(max) > 0) {
			max = y;
		}
		if (z.compareTo(max) > 0) {
			max = z;
		}

		printMax(x, y, z, max);
		return max;
	}

	public static <T> void printMax(T x, T y, T z, T max) {
		System.out.printf("Max of %s,%s & %s is %s\n", x, y, z, max);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String xStr = "Peach", yStr = "Banana", zStr ="Apple" ;
		MaximumGenerics<String> maximum = new MaximumGenerics<String>(xStr, yStr, zStr);
		MaximumGenerics.testMaximum(xStr, yStr, zStr);

	}

}
