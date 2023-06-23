package util;

import java.util.Scanner;

/**
 * 特定のフォーマットでできた文字列をコンソール入力し、動物のデータをコンソール出力するクラス
 */

public class InputToAnimalInfo {

	public static void main(String[] args) {

		// コンソール入力用のインスタンスを生成
		Scanner scanner = new Scanner(System.in);
		// 入力を促すメッセージを出力
		System.out.println("コンソールに文字を入力してください");
		// コンソールに入力した値を代入
		String input = scanner.nextLine();
		
		// 入力した文字列が空でないかチェック
		StringValidator.checkNotEmpty(input);

		System.out.println("\nコンソール出力結果\n");

		// 入力内容を,で区切る
		String[] result = input.split(",");

		// 区切られた配列から動物データを逐次出力
		for (String item : result) {
			StringToAnilmalEntity stringToAnilmalEntity = new StringToAnilmalEntity(item);
			System.out.println(stringToAnilmalEntity.outputString() + "\n");
		}

		scanner.close();

	}

}
