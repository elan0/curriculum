package Test01;

public class Sample {
	public static void main(String[] args) throws Exception {
		System.out.println("ヒーローを呼び出します");

		Keisan keisan = new Keisan();

		//10たす5の計算
		System.out.println("10たす5の足し算の"+
		"結果は・・・"+keisan.Tasu(10,5));

		//10ひく5の計算
		keisan.Hiku(10,5);


		//底辺の高さが10センチの時の1から
		//100000までの面積を求めなさい
		int teihen = 10;
		for(int i =1;i <= 100000;i++) {
			System.out.println("結果="
		+ keisan.SankakuMenseki(teihen, i));
		}
	}
}