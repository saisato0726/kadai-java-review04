package Animal;

public class Human extends Animal implements Thinkable {
    // 趣味のフィールド
    private String hobby;

    public String getHobby() {
        return hobby;
    }

    public void setHobby(String hobby) {
        this.hobby = hobby;
    }

    // 引数なしのコンストラクタ
    public Human() {
    }

    // 引数ありのコンストラクタ
    public Human(String name, int age, String hobby) {
        super(name, age);
        this.hobby = hobby;
    }

    @Override
    public void think() {
        System.out.println("私は" + this.hobby + "について考えています。");
    }

    @Override
    public void say() {
        System.out.println(getName() + "です。" + getAge() + "歳です。");
    }
}