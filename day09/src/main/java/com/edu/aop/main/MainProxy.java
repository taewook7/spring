package com.edu.aop.main;

import com.edu.aop.calc.ExeTimeCalculator;
import com.edu.aop.calc.ImplCalculator;
import com.edu.aop.calc.RecCalculator;

public class MainProxy {

	public static void main(String[] args) {
		
		ExeTimeCalculator ttCal1 = new ExeTimeCalculator(new ImplCalculator());
		System.out.println(ttCal1.factorial(20));
		
		ExeTimeCalculator ttCal2 = new ExeTimeCalculator(new RecCalculator());
		System.out.println(ttCal2.factorial(20));
		
			
	}

}
