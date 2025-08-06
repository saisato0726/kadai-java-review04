package Animal;

public abstract class Human extends Animal implements Thinkable {
	//趣味の情報を追加するフィールド
	private String hobby;
	
	public String getHobby() {
		return hobby;
	}
	
	public void setHobby(String hobby) {
		this.hobby = hobby;
	}
	
	//引数なしのコンストラクタ
	public Human() {
	}
	
	//引数ありのコンストラクタ
	public Human(String name, int age, String hobby) {
		super(name, age);
		this.hobby = hobby;
	}	

	@Override//考えるメソッド
	public void think(String hobby) {
		System.out.println("私は" + this.hobby + "について考えています。");
	}

}
