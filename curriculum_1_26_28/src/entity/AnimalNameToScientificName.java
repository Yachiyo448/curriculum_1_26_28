package entity;

import java.util.HashMap;
import java.util.Map;

/**
 * 動物名から検索し、対応する学名を返すクラス
 * 対応する学名が無ければ「不明」を返す
 */

public class AnimalNameToScientificName {

	// 動物名をキーとし、学名を値とするマップを宣言
	private static final Map<String, String> ScientificNameMap = new HashMap<>();

	static {
		// キーと値のペアをマップに追加
		ScientificNameMap.put("シマウマ", "チャップマンシマウマ");
		ScientificNameMap.put("ゾウ", "ロキソドンタ・サイクロティス");
		ScientificNameMap.put("チンパンジー", "パン・トゥログロディテス");
		ScientificNameMap.put("パンダ", "アイルロポダ・メラノレウカ");
		ScientificNameMap.put("ライオン", "パンテラ レオ");
	}

	/**
	 * 動物名に対応する学名を返し、無ければ「不明」を返す
	 * @param animalName 動物名
	 * @return scientificName 対応する学名
	 */
	public String getScientificNameByAnimalName(String animalName) {
		// 返り値の定義
		String scientificName;

		// 引数と一致するキーがあれば、対応する値を返り値に代入する
		// 一致するキーが無ければ、「不明」を返り値に代入する
		if (ScientificNameMap.containsKey(animalName)) {
			scientificName = ScientificNameMap.get(animalName);
		} else {
			scientificName = "不明";
		}
		return scientificName;
	}

}
