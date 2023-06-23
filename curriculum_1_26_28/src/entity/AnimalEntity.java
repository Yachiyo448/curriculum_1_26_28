package entity;

/**
 * 動物の情報を扱うエンティティクラス
 */
public class AnimalEntity {

	// 動物名
	private String animalName;
	// 体長(m)
	private double height;
	// 速度(km/h)
	private int speed;
	// 学名
	private String scientificName;

	// コンストラクタ

	// デフォルトコンストラクタ
	public AnimalEntity() {
	}

	/**
	 * 動物名・体長(m)・速度(km/h)・学名を格納
	 * @param animalName
	 * @param height
	 * @param speed
	 * @param scientificName
	 */
	public AnimalEntity(String animalName, double height, int speed, String scientificName) {
		this.animalName = animalName;
		this.height = height;
		this.speed = speed;
		this.scientificName = scientificName;
	}

	// ゲッターとセッター

	/**
	 * @return animalName
	 */
	public String getAnimalName() {
		return animalName;
	}

	/**
	 * @param animalName セットする animalName
	 */
	public void setAnimalName(String animalName) {
		this.animalName = animalName;
	}

	/**
	 * @return height
	 */
	public double getHeight() {
		return height;
	}

	/**
	 * @param height セットする height
	 */
	public void setHeight(double height) {
		this.height = height;
	}

	/**
	 * @return speed
	 */
	public int getSpeed() {
		return speed;
	}

	/**
	 * @param speed セットする speed
	 */
	public void setSpeed(int speed) {
		this.speed = speed;
	}

	/**
	 * @return scientificName
	 */
	public String getScientificName() {
		return scientificName;
	}

	/**
	 * @param scientificName セットする scientificName
	 */
	public void setScientificName(String scientificName) {
		this.scientificName = scientificName;
	}

}
