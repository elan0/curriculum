package study;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Properties;


	/**
	 * UTD-8エンコーディングされたプロパティファイルを{@link Properties} クラスで取り取り扱う
	 *
	 */
public class ResourceMainEncoding {
	static Properties loadUtf8Properties(String resourceName) throws IOException {
		try(	//getResourceAsStream=プロパティファイルを取得する部分、
				//今回だと中身が[/test.properties]になる
				InputStream is = ResourceMainEncoding.class.getResourceAsStream(resourceName);
				//この書き方だとどの位置にpropertiesファイルが置かれていても読み込むことが出来る
				InputStream isExc = ResourceMainEncoding.class.getClassLoader().getResourceAsStream("math.properties");
				//InputStremReaderでどの文字コードで読み込むかを指定する
				InputStreamReader isr = new InputStreamReader(is,"UTF-8");
				//propertiesファイルのインスタンスコードが入ってくる
				BufferedReader reader = new BufferedReader(isr)) {
				// readerの文字を１行読み込む
				System.out.println(reader.readLine());
					Properties result = new Properties();
					result.load(reader);
					return result;
				}
	}
	public static void main(String[]args) throws IOException{
		Properties properties = loadUtf8Properties("/test.properties");
		System.out.println(properties.getProperty("name"));
	}
}
