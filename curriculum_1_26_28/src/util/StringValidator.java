package util;

/**
 * 文字列を受け取り、正しく入力されていなければエラーを返す
 */

public class StringValidator {

	/**
	 * 文字列引数がnullまたは0文字以下の場合、エラーを返す
	 * @param input
	 */
	public static void checkNotEmpty(String input) {
		if (input == null || input.length() <= 0) {
			throw new IllegalArgumentException("入力文字列は空です。");
		}
	}

	/**
	 * 文字列引数が整数または小数でない場合、エラーを返す
	 * @param input
	 */
	public static void checkNumeric(String input) {
		checkNotEmpty(input);
		if (!input.matches("-?\\d+(\\.\\d+)?")) {
			throw new IllegalArgumentException("整数または小数を入力してください。");
		}
	}

}
