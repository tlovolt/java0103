package java0103;

import java.util.Scanner;

public class Condition1 {

	public static void main(String[] args) {
		//키보드로부터 입력받기 위한 객체를 생성
		Scanner sc = new Scanner(System.in);
		//점수 입력받기
		System.out.print("점수 입력:");
		int score = sc.nextInt();
		
		//점수가 60이상이면 합격이라고 출력
		if(score >= 60){
			System.out.println("합격");
		}
	
		sc.close();
	}
}




