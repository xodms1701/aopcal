package kr.hs.emirim.kimtae1701.aopcal.cal;

public class ImpeCalculator implements Calculator {

	@Override
	public long factorial(long num) {
		long start = System.currentTimeMillis();
		long result = 1;
		for (long i = 1; i <= num; i++) {
			result *= i;
		}
		
		long end = System.currentTimeMillis();
		System.out.printf("lmp factorial(%d): 실행시간 = %d", num,(end-start));
		
		return result;
	}
}