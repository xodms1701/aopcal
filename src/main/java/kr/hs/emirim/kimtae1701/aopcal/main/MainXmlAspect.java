package kr.hs.emirim.kimtae1701.aopcal.main;

import org.springframework.context.support.GenericXmlApplicationContext;

import kr.hs.emirim.kimtae1701.aopcal.cal.Calculator;

public class MainXmlAspect {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GenericXmlApplicationContext ctx =
				new GenericXmlApplicationContext("classpath:aopAspect.xml");

		Calculator impeCal = ctx.getBean("impeCal", Calculator.class);
		long fiveFact = impeCal.factorial(5);
		System.out.println("impeCal.factorial(5) = " + fiveFact);
	}

}
