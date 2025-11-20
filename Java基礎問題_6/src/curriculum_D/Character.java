package curriculum_D;

public class Character {

	//キャラクターの名前
	protected String name;

	//HP.AT,SP
	protected int hp;
	protected int at;
	protected int sp;

	//コンストラクタ：キャラクターを生成するときに実行される
	public Character(String name, int hp, int at, int sp) {
		this.name = name;
		this.hp = hp;
		this.at = at;
		this.sp = sp;
	}

	//生存しているかどうかHPが1以上なら生きている）
	public boolean isAlive() {
		return hp > 0;
	}

	// 攻撃を行うメソッド
	//targetのHPからthisキャラの攻撃力を引く
	public void attack(Character target) {
		target.hp -= this.at;

		//HPが0を下回らないようにする
		if (target.hp < 0)
			target.hp = 0;
	}

	//キャラクターのステータス表示
	@Override
	public String toString() {
		return name + " (HP:" + hp + ", AT:" + at + ", SP:" + sp + ")";
	}
}