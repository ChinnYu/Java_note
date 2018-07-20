package com.jason;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.text.DecimalFormat;
import java.util.Arrays;

public class Test {
	public static void main(String[] args) {
		//大整數運算
		String val1 = "84564545645555455";
		String val2 = "45456454565446468";
		BigInteger b1 = new BigInteger(val1);
		BigInteger b2 = new BigInteger(val2);
		System.out.println(b1.add(b2));//+
		System.out.println(b1.subtract(b2));//-
		System.out.println(b1.multiply(b2));
		System.out.println(b1.divide(b2));
		System.out.println(b1.remainder(b2));//%
		System.out.println(Arrays.toString(b1.divideAndRemainder(b2)));
		
		String val3 = "6588.5656559989896";
		String val4 = "6";
		BigDecimal b3 = new BigDecimal(val3);
		BigDecimal b4 = new BigDecimal(val4);
		System.out.println(b3.add(b4));//+
		System.out.println(b3.subtract(b4));//-
		System.out.println(b3.multiply(b4));
		System.out.println(b3.divide(b4));//報錯代表除不盡
		//System.out.println(b3.scale()-b4.scale());
		
		double pi = 3.1415927;
		System.out.println(new DecimalFormat("0").format(pi));
		System.out.println(new DecimalFormat("0.00").format(pi));
		System.out.println(new DecimalFormat("00.000").format(pi));
		System.out.println(new DecimalFormat("#").format(pi));
		System.out.println(new DecimalFormat("#.##%").format(pi));
		
		long num = 655566665;
		System.out.println(new DecimalFormat("###,###").format(num));
	}
}
