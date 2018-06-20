package kr.hs.emirim.kimtae1701.aopcal.main;

import kr.hs.emirim.kimtae1701.aopcal.cal.Calculator;
import kr.hs.emirim.kimtae1701.aopcal.cal.ImpeCalculator;
import kr.hs.emirim.kimtae1701.aopcal.cal.RecCalculator;

public class MainStart {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calculator cal1 = new ImpeCalculator();
		long f1 = cal1.factorial(100);
		System.out.println("Imp 100 : "+f1);
		
		Calculator cal2 = new RecCalculator();
		long f2 = cal2.factorial(100);
		System.out.println("Rec 100 : "+f2);
		
	}

}
