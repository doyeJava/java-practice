package doye.java.agecheck;

import java.util.Scanner;

public class BMI {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("키를 입력하세요(cm): ");
		double heightCm = sc.nextDouble();
		
		double height = heightCm / 100.0;
		
		System.out.print("몸무게를 입력하세요(kg): ");
		double weight = sc.nextDouble();
		
		double bmi = weight / (height * height);
		System.out.printf("당신의 BMI는 %.2f 입니다.\n", bmi);
		
		if (bmi >= 25) {
			System.out.println("과체중입니다.");
		} else if (bmi >= 18.5) {
			System.out.println("정상입니다.");
		} else {
			System.out.println("저체중입니다.");
		}
		sc.close();
	}

}
