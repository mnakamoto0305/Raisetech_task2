package task002;

import java.time.DayOfWeek;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.chrono.JapaneseDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class Sample {
	private String greeting = "HelloWorld";
	private String name;
	private int score;

	public Sample(String name, int score) {
		this.name = name;
		this.score = score;
	}

	//HelloWorldの出力
	public void getGreeting() {
		System.out.println(greeting);
	}

	//1~10までの足し算
	public void addNumber() {
		int num = 0;
		for(int i = 1; i < 11; i++) {
			num += i;
		}
		System.out.println(num);
	}

	//3年後の今日が何曜日なのか
	public void findDayOfTheWeek() {
		//3年後の今日を調べる
		LocalDateTime l = LocalDateTime.now();
		LocalDateTime ldate = l.plusYears(3);

//		曜日を調べる
		DayOfWeek day = ldate.getDayOfWeek();
		
		//曜日を日本語表記したい場合
//		DateTimeFormatter fmt  = DateTimeFormatter.ofPattern("E曜日");
//		System.out.println(ldate.format(fmt));
		
		System.out.println(day);
	}

	//引数が0なら偽。引数が1なら真。
	//TODO 引数に0か1以外を設定した場合の例外処理を書く
	public void displayBoolean1(int n) throws IllegalArgumentException {
		if (!(n == 0 | n == 1)) {
			throw new IllegalArgumentException("0か1を入力してください");
		}

		if (n == 0) {
			System.out.println("偽");
		} else if (n == 1) {
			System.out.println("真");
		}
	}

	//String型のList
	public void makeList(Sample s1,Sample s2, Sample s3) {
		List<String> name = new ArrayList<String>();
		name.add(s1.name);
		name.add(s2.name);
		name.add(s3.name);

		for(String s : name) {
			System.out.println(s);
		}
	}

	//String型とInteger型のMap
	public void makeMap(Sample s1, Sample s2, Sample s3) {
		Map<String, Integer> score = new LinkedHashMap<String, Integer>();
		score.put(s1.name, s1.score);
		score.put(s2.name, s2.score);
		score.put(s3.name, s3.score);

		for (String key : score.keySet()) {
			System.out.println(score.get(key));
		}
	}

	//東京の現在時刻を取得し、ニューヨークの時刻へ変換
	public void getNewYorkTime() {
		DateTimeFormatter fmt = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
		ZonedDateTime z1 = ZonedDateTime.now(ZoneId.of("America/New_York"));
		String ans = fmt.format(z1);
		System.out.println(ans);
	}

	//西暦表示を和暦に変換
	public void getJapaneseCalender(int year, int month, int dayOfMonth) {
		JapaneseDate jtime1 = JapaneseDate.of(year, month, dayOfMonth);
		DateTimeFormatter kanjiFormatter = DateTimeFormatter.ofPattern("Gyy年MM月dd日");
		String ans = kanjiFormatter.format(jtime1);
		System.out.println(ans);
	}

	//0除算
	public void divide(int i, int j) {
		try {
			System.out.println(i / j);
		} catch (ArithmeticException e) {
			// TODO: handle exception
			System.out.println("ArithmethicException 0では割り算できません");
		}
	}
}
