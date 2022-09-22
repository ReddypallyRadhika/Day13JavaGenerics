/**
 * 
 */
package com.bridgeLabz;

/**
 * @author hp
 *
 */
/*
 * UC5
 * Extend the max method to also print the max to std out using Generic Method 
 * - Write printMax Generic Method which is internally called from testMaximum
 */
public class MaximumGenerics<T extends Comparable<T>> {

	T x, y, z, w;

	public MaximumGenerics(T x, T y, T z,T w) {
		// TODO Auto-generated constructor stub
		this.x = x;
		this.y = y;
		this.z = z;
		this.w = w;
	}

	public T Maximum() {
		return MaximumGenerics.Maximum(x, y, z, w);
	}

	public static <T extends Comparable<T>> T Maximum(T x, T y, T z,T w) {
		T max = x;
		if (y.compareTo(max) > 0) {
			max = y;
		}
		if (z.compareTo(max) > 0) {
			max = z;
		}
	
	if (w.compareTo(max) > 0) {
		max = w;
	}

		printMax(x, y, z, w, max);
		return max;
	}

	public static Integer testMaximum(Integer x, Integer y, Integer z,Integer w) {
		Integer max = x;
		if (y.compareTo(max) > 0) {
			max = y;
		}
		if (z.compareTo(max) > 0) {
			max = z;
		}
		if (w.compareTo(max) > 0) {
			max = w;
		}

		printMax(x, y, z, w, max);
		return max;
	}

	public static Float testMaximum(Float x, Float y, Float z,Float w) {
		Float max = x;
		if (y.compareTo(max) > 0) {
			max = y;
		}
		if (z.compareTo(max) > 0) {
			max = z;
		}
		if (w.compareTo(max) > 0) {
			max = w;
		}

		printMax(x, y, z, w, max);
		return max;
	}

	public static String testMaximum(String x, String y, String z,String w) {
		String max = x;
		if (y.compareTo(max) > 0) {
			max = y;
		}
		if (z.compareTo(max) > 0) {
			max = z;
		}
		if (w.compareTo(max) > 0) {
			max = w;
		}

		printMax(x, y, z, w, max);
		return max;
	}

	public static <T> void printMax(T x, T y, T z, T w, T max) {
		System.out.printf("Max of %s,%s,%s & %s is %s\n", x, y, z, w, max);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer xInt = 5, yInt = 4, zInt = 3,wInt = 2;
		Float xF = 5.1F, yF = 4.1F, zF = 3.1F, wF = 2.1F;
		String xStr = "Peach", yStr = "Banana", zStr = "Apple",wStr = "Pea";
		MaximumGenerics<Integer> maximum = new MaximumGenerics<Integer>(xInt, yInt, zInt,wInt);
		MaximumGenerics.testMaximum(xInt, yInt, zInt,wInt);
		MaximumGenerics<Float> maximum1 = new MaximumGenerics<Float>(xF, yF, zF, wF);
		MaximumGenerics.testMaximum(xF, yF, zF,wF);
		MaximumGenerics<String> maximum2 = new MaximumGenerics<String>(xStr, yStr, zStr, wStr);
		MaximumGenerics.testMaximum(xStr, yStr, zStr,wStr);
	}

}
