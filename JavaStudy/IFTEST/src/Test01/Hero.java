package Test01;

public class Hero {

	String name;
	int hp;
	int mp;

	public Hero() {
		this.name = "勇者";
		this.hp = 100;
		this.mp = 20;
	}

	public Hero(String name) {
		this.name = name;
		this.hp = 100;
		this.mp = 20;
	}
	public Hero(String name,int hp,int mp) {
		this.name = name;
		this.hp = hp;
		this.mp = mp;
	}





	public void Attack() {
		System.out.println(this.name + "の攻撃！");
	}
	public void Guard() {
		System.out.println(this.name + "は防御した");
	}
}
