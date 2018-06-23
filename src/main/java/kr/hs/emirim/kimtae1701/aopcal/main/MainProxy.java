package kr.hs.emirim.kimtae1701.aopcal.main;

import kr.hs.emirim.kimtae1701.aopcal.cal.ExeTimeCalculator;
import kr.hs.emirim.kimtae1701.aopcal.cal.ImpeCalculator;
import kr.hs.emirim.kimtae1701.aopcal.cal.RecCalculator;

public class MainProxy {
	public static void main(String[] args) {
		int num = 20;
		ExeTimeCalculator ttCal1 = new ExeTimeCalculator(new ImpeCalculator());
		System.out.println(ttCal1.factorial(num));

		ExeTimeCalculator ttCal2 = new ExeTimeCalculator(new RecCalculator());
		System.out.println(ttCal2.factorial(num));
	}
}
