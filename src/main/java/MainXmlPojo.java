import org.springframework.context.support.GenericXmlApplicationContext;

import kr.hs.emirim.kimtae1701.aopcal.cal.Calculator;

public class MainXmlPojo {
	public static void main(String[] args) {
		GenericXmlApplicationContext ctx =
				new GenericXmlApplicationContext("classpath:aopPojo.xml");
		
		Calculator impCal = ctx.getBean("impeCal", Calculator.class);
		long fiveFact1 = impCal.factorial(5);
		System.out.println("impeCal.factorial(5) = "+fiveFact1);
		
		Calculator recCal = ctx.getBean("recCal", Calculator.class);
		long fiveFact2 = recCal.factorial(5);
		System.out.println("recCal.factorial(5) = " + fiveFact2);
		
	}
}
