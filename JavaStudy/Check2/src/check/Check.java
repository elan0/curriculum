package check;

import constants.Constants;

public class Check {
	/**
	 * クラスを呼び出して名前を呼び出す。
	 * 他のクラスからいろいろ呼び出す。
	 * Check2用のプログラム
	 */
	private String firstName ="畑中";
	private String lastName ="悠希";
	public static void main(String[] args) {
		Check name = new Check();
		//printNameメソッドを実行、と同時に出力
		System.out.println("printNameメソッド → "+name.printName());
		//1:PetClassをインスタンス化、
		//2:Constantsはimportしてフィールドを引っ張ってくる
		Pet pet = new Pet(Constants.CHECK_CLASS_JAVA,Constants.CHECK_CLASS_HOGE);
		pet.introduce();
		//Petクラスを継承したRobotPetを呼び出し、インスタンス化
		//親クラス(スーパークラス)のintroduceを呼び出せる
		Pet robo =new RobotPet(Constants.CHECK_CLASS_R2D2,Constants.CHECK_CLASS_LUKE);
		robo.introduce();
	}
	/**
	 * 苗字と名前を一つに合体させるメソッド
	 */
	
	public String printName() {
		return firstName+lastName;
	}
	//以下ゲッターセッター
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
}
