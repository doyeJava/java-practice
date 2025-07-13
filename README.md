# java-practice - Day 1
## 오늘 한 일
-BMI 계산기 실습
-조건문/ Scanner 복습

## 코드 목록
-[BMI 계산기](./Day01/BMI.java)
-[홀짝 판별기](./Day01/EvenOdd.java)
-[나이 판별기](./Day01/AgeCheck.java)

## 배운점
-BMI계산기에 cm 단위 입력을 m 단위로 변환하기 위해 'double height = heightCm / 100.0;' 형태로 처리

-조건문 순서는 위에서 큰 범위부터 배치하는게 논리 오류를 막을 수 있는걸 알게됨

-Scnner사용 시 리소스 누수 경고(Resource leak: 'scanner' is never closed)가 발생했는데 'sc.close();'를 추가하여 해결
  -구글링을 통해 경고의 의미와 해결법을 찾아서 해결하는 점이 인상깊었다.
