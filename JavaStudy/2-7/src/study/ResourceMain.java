package study;

import java.util.ResourceBundle;

public class ResourceMain {
	public static void main(String[] args) {
		//プロパティファイルの取得、ResouceBundleで可能
		//java8以前の物だと、この状態で読み込むと文字コードが[ISO/IEC 8859-1]で表示される
		ResourceBundle bundle = ResourceBundle.getBundle("test");
		String value = bundle.getString("pass");
		System.out.println(value);
		//この状態だと文字化けして表示される
		System.out.println(bundle.getString("name"));

	}
}