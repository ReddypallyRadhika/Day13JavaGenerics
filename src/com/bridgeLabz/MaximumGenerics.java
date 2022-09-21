/**
 * 
 */
package com.bridgeLabz;

/**
 * @author hp
 *
 */
/*
 * UC1 Given 3 Floats find the maximum Use Integer Object and compareTo method
 * to test the maximum number
 */
public class MaximumGenerics<T> {

	T x, y, z;

	public MaximumGenerics(T x, T y, T z) {
		// TODO Auto-generated constructor stub
		this.x = x;
		this.y = y;
		this.z = z;
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

	public static <T> void printMax(T x, T y, T z, T max) {
		System.out.printf("Max of %s,%s & %s is %s\n", x, y, z, max);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Float xF = 5.1F, yF = 4.1F, zF = 3.1F;
		MaximumGenerics<Float> maximum = new MaximumGenerics<Float>(zF, zF, zF);
		MaximumGenerics.testMaximum(xF, yF, zF);

	}

}
