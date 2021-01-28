package task001;

import task002.Sample;

public class Main {

	public static void main(String[] args) {
		Sample s1 = new Sample("佐藤", 80);
		Sample s2 = new Sample("田中", 90);
		Sample s3 = new Sample("加藤", 95);

		//HelloWorldの出力
		s1.getGreeting();

		//1~10の足し算
		s1.addNumber();

		//3年後の今日の曜日
		s1.findDayOfTheWeek();

		//引数が0なら偽。引数が1なら真。
		try {
			s2.displayBoolean1(2);
		} catch (IllegalArgumentException e) {
			// TODO: handle exception
			e.printStackTrace();
		}


		//String型のList
		s1.makeList(s1, s2, s3);

		//String型とInteger型のMap
		s1.makeMap(s1, s2, s3);

		//ニューヨークの現在時刻
		s1.getNewYorkTime();

		//和暦
		s1.getJapaneseCalender(1995, 3, 5);

		//0除算
		s1.divide(10, 0);

	}
}

