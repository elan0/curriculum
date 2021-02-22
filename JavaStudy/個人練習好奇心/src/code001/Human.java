package code001;

public class Human {
	private int Hp1;
	protected int Hp2;
	int Hp3;
	public int Hp4;
	private static int Hp5;
	protected static int Hp6;
	static int Hp7;
	public static int Hp8;

	public int getHp1() {
		return Hp1;
	}

	public void setHp1(int hp1) {
		Hp1 = hp1;
	}

	public static int getHp5() {
		return Hp5;
	}

	public static void setHp5(int hp5) {
		Hp5 = hp5;
	}
	public void Humandesu() {
		System.out.println("人です");
	}
}
