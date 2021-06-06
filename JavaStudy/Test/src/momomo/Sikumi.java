package momomo;

public class Sikumi {
	public static void main(String[] args) {
		System.out.println("メソッドを呼び出します");
		String name = "山田";
		byte kazuC = 30;
		Yobidashi(kazuC);
		System.out.println("メソッド終了");
	}
	public static void Yobidashi(int kazuA) {
		System.out.println("intが動いた");
		System.out.println(kazuA);
	}
}
