package ch13Recursion.self_check;

import java.util.Arrays;

import utils.ArrayUtil;

public class SC8 {
	public static void main(String[] args) {
		int[] a = ArrayUtil.randomIntArray(5, 10);

		System.out.println(Arrays.toString(a));
		System.out.println(sum(a));

	}

	public static int sum(int[] a) {
		return sum(a, 0);
	}

	private static int sum(int[] a, int pos) {
		if(pos >= a.length) {
			return 0;
		}
		else {
			return a[pos] + sum(a, pos + 1);
		}
	}
}