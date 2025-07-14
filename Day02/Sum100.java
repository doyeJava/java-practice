public class Sum100 {

	public static void main(String[] args) {
		int sum = 0; //합계를 저장할 변수
		
		//1부터 100까지 반복하며 더함
		for (int i = 1; i <= 100; i++) {
			sum += i; //sum = sum + i
		}
		
		//최종 합 출력
		System.out.println("1부터 100까지의 합: " + sum);

	}

}
