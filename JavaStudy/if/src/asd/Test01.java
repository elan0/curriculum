package asd;

public class Test02 {
	public static void main(String[]args) {
		String don ="kihote";
		if(don.equals("kihote")) {
			System.out.println("ドンキホーテだよ");
		}
		if(don.equals("konishi")){
			System.out.println("ドン小西だよ");
		}
		if(don.equals("kihote")){
			System.out.println("ドンキホーテだよ");
		}
		if(!(don.equals("kihote"))) {
			System.out.println("誰だよ");
		}
	}
}
