package kr.hs.emirim.kimtae1701.aopcal.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import kr.hs.emirim.kimtae1701.aopcal.cal.Calculator;
import kr.hs.emirim.kimtae1701.aopcal.config.JavaConfig;

public class MainJavaAspect {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext ctx =
				new AnnotationConfigApplicationContext(JavaConfig.class);

		Calculator recCal = ctx.getBean("recCal", Calculator.class);
		long fiveFact = recCal.factorial(5);
		System.out.println("recCal.factorial(5) = " + fiveFact);
	}
}
