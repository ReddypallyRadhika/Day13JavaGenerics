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
	public static Integer testMaximum(Integer x, Integer y, Integer z) {
		Integer max = x;
		if (y.compareTo(max) > 0) {
			max = y;
		}
		if (z.compareTo(max) > 0) {
			max = z;
		}

		printMax(x, y, z, max);
		return max;
	}
	public static Float testMaximum(Float x, Float y, Float z) {
		Float max = x;
		if (y.compareTo(max) > 0) {
			max = y;
		}
		if (z.compareTo(max) > 0) {
			max = z;
		}

		printMax(x, y, z, max);
		return max;
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
		Integer xInt = 5, yInt = 4, zInt =3 ;
		Float xF = 5.1F, yF = 4.1F, zF =3.1F ;
		String xStr = "Peach", yStr = "Banana", zStr ="Apple" ;
		MaximumGenerics<Integer> maximum = new MaximumGenerics<Integer>(xInt, yInt, zInt);
		MaximumGenerics.testMaximum(xInt, yInt, zInt);
		MaximumGenerics<Float> maximum1 = new MaximumGenerics<Float>(xF, yF, zF);
		MaximumGenerics.testMaximum(xF, yF, zF);
		MaximumGenerics<String> maximum2 = new MaximumGenerics<String>(xStr, yStr, zStr);
		MaximumGenerics.testMaximum(xStr, yStr, zStr);

	}

}
