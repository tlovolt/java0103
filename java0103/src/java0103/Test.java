package java0103;

public class Test {

	public static void main(String[] args) {
		int second = 309209;
		//second에 초가 저장
		//하루는 86400 초, 1시간은 3600초, 1분은 60초
		//second 가 몇일 몇시간 몇분 몇초인지 출력

		int day = second / 86400;
		int hour = (second - (day * 86400))/3600;
		int minute = (second - (day * 86400) - (hour * 3600))/60;
		//초는 분까지 가져간 것을 모두 빼면 되는데 일, 시간, 분은 전부 60의 배수이기 때문에
		//60으로 나눈 나머지가 모두 뺀 값이 됩니다.
		int sec = second % 60;

		System.out.println(day + "일 " + hour +"시간 " + minute + "분 " + sec +"초");

	}

}
