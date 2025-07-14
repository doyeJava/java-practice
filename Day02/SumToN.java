import java.util.Scanner;

public class SumToN {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);// 사용자 입력을 받을 Scanner 생성
		
		System.out.print("정수를 입력하세요: ");
		int num = sc.nextInt(); //사용자가 입력한 숫자 저장
		
		int sum = 0; //합계를 저장할 변수
		int i = 1;	 //반복 제어 변수 (1부터 시작)
		
		// i가 num보다 작거나 같을 때까지 반복
		while (i <= num) {
			sum += i; 	//sum = sum + i
			i++;		//i 값을 1씩 증가시킴
		}
		
		
		//결과 출력
		System.out.println("1부터 " + num + "까지의 합: " + sum);
		
		sc.close(); //리소스 누수 방지 Scanner 닫기
	}

}
