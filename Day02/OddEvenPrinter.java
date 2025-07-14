public class OddEvenPrinter {

	public static void main(String[] args) {
		//1부터 100까지 반복		
		for(int i = 1; i <= 100; i++) {
					
			//2로 나눈 나머지가 0이면 짝수
			if (i % 2 == 0) {
				System.out.println(i + " : 짝수");
			}else {
				//아니면 홀수
				System.out.println(i + " : 홀수");
			}
		}
	}

}
