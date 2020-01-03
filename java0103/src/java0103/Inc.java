package java0103;

public class Inc {

	public static void main(String[] args) {
		int a = 10;
		//a의 값을 1증가
		a++;
		System.out.println("a:" + a); //11 출력
		
		//a가 11인 상태에서 명령에 먼저 사용하고 1증가
		//11이 출력되고 a는 12가 됩니다.
		System.out.println("a:" + (a++)); //11
		
		//a를 먼저 증가시켜서 13을 만들고 명령에 사용
		System.out.println("a:" + (++a));//13

	}

}
