package task001;
import java.io.PrintStream;
import java.util.Random;
import java.util.Scanner;

public class Display {

	public void helloWorld1(String str) {
		//HelloWorldを1回表示
		System.out.println("HelloWorldを1回表示");
		System.out.println(str);
		System.out.println("-----------");
	}

	public void helloWorld2(String str) {
		//10回連続表示
		System.out.println("10回連続表示");
		for(int i = 0; i < 10; i++) {
			System.out.println(str);
		}
		System.out.println("-----------");
	}

	public void helloWorld3(String str) {
		//11回目からHello
		System.out.println("11回目からHello");
		for(int i = 0; i < 15; i++) {
			if (i < 10) {
				System.out.println(str);
			} else {
				System.out.println("Hello");
			}
		}
		System.out.println("-----------");
	}

	public void helloWorld4(String str) {
		//奇数はHelloWorld　偶数はHello
		System.out.println("奇数はHelloWorld　偶数はHello");
		for(int i = 0; i < 10; i++) {
			if (i % 2 == 0) {
				System.out.println("Hello");
			} else {
				System.out.println(str);
			}
		}
		System.out.println("-----------");
	}

	public void helloWorld5(String str) {
		//標準入力されたHelloWorldの出力
		System.out.println("標準入力されたハローワールドを変換");
		java.util.Scanner scanner = new Scanner(System.in);
		String s = scanner.next();

		if (s.equals("ハローワールド")) {
			System.out.println(str);
		} else {
			System.out.println("入力された文字が異なります");
		}

		System.out.println("-----------");
	}

	public void helloWorld6(String str) {
		//ランダムで生成した回数だけ表示(1~10回)
		System.out.println("ランダムで生成した回数だけ表示");
		int r = new Random().nextInt(10) + 1;
		for(int i = 0; i < r; i ++) {
			System.out.println(str);
		}
		System.out.println("-----------");
	}

	public void helloWorld7(String str) {
		//まわりくどい書き方
		char[] data = {'H', 'e', 'l', 'l', 'o', 'W', 'o', 'r', 'l', 'd'};
		String helloWorld = new String(data);
		PrintStream ps = System.out;
		ps.println(helloWorld);
		System.out.println("-----------");
	}
}
