package util;

/**
 * 特定のフォーマットでできた文字列から動物のデータを生成し、文字列出力するクラス
 */
public class StringToAnilmalEntity {

	entity.AnimalEntity animalEntity = new entity.AnimalEntity();

	// コンストラクタ
	// 動物名・体長・速度で構成された文字列から動物のデータを生成
	public StringToAnilmalEntity(String formattedStr) {

		// 文字列を:で分割する
		String[] data = formattedStr.split(":");

		// 要素数が3で無い場合はエラーを返す
		if (data.length != 3) {
			throw new IllegalArgumentException("配列の要素数が不正です。");
		}

		// 分割した各文字列についてエラーチェック
		StringValidator.checkNotEmpty(data[0]);
		StringValidator.checkNumeric(data[1]);
		StringValidator.checkNumeric(data[2]);

		// 動物名を検索し、対応する学名を出力するクラスを呼び出す
		entity.AnimalNameToScientificName animalNameToScientificName = new entity.AnimalNameToScientificName();

		// 各文字列を型対応させ、動物のデータに代入
		animalEntity.setAnimalName(data[0]);
		animalEntity.setHeight(Double.parseDouble(data[1]));
		animalEntity.setSpeed(Integer.parseInt(data[2]));
		animalEntity.setScientificName(animalNameToScientificName.getScientificNameByAnimalName(data[0]));

	}

	/**
	 * 動物のデータを文字列として返す
	 */
	public String outputString() {
		String output;
		output = "動物名：" + animalEntity.getAnimalName() + "\n"
				+ "体長：" + animalEntity.getHeight() + "m\n"
				+ "速度：" + animalEntity.getSpeed() + "km/h\n"
				+ "学名：" + animalEntity.getScientificName();
		return output;
	}

}
