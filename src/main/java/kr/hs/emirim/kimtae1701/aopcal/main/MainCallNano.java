package kr.hs.emirim.kimtae1701.aopcal.main;

import kr.hs.emirim.kimtae1701.aopcal.cal.Calculator;
import kr.hs.emirim.kimtae1701.aopcal.cal.ImpeCalculator;
import kr.hs.emirim.kimtae1701.aopcal.cal.RecCalculator;

public class MainCallNano {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		long num =10000;
		long start = System.nanoTime();
		Calculator cal1 = new ImpeCalculator();
		long f1 = cal1.factorial(num);
		long end = System.nanoTime();
		System.out.printf("lmp factorial(%d): 실행시간 = %d", num,(end-start));
		System.out.println();
		long start2 = System.nanoTime();
		Calculator cal2 = new RecCalculator();
		long f2 = cal2.factorial(num);
		long end2 = System.nanoTime();
		System.out.printf("Rec factorial(%d): 실행시간 = %d", num,(end2-start2));
		
	}
}
