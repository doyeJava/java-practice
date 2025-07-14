public class Gugudan {

	public static void main(String[] args) {
		
		// 2단부터 9단까지 반복
		for (int dan = 2; dan <= 9; dan++) {
			System.out.println("== "+ dan + "단 ==");//현재 단 출력
			
			// 1부터 9까지 곱하기
			for (int i = 1; i <= 9; i++) {
				//각 단과 곱하는 수를 곱해서 출력
				System.out.printf("%d x %d = %d\n", dan, i, dan * i);
			}
			System.out.println(); // 단 사이 줄바꿈
		}
	}

}
