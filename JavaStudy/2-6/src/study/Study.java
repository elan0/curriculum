package study;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.Year;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;

/**
 *
 * 本課題では、基本的な日付操作クラスの使い方を学びましょう。
 *
 * 問①から問③まであります。
 * 問②に関しては、コメントを記述してください。
 *
 * ※この課題に関しては課題実施日によって結果が異なるため、出力結果が個々で異なります。
 */
public class Study {

	public static void main(String args[]) {

		// Dateクラスのインスタンスを生成
		Date now = new Date();

		// 問① ローカル変数「now」を使用し、本日の日付を表示してください。
		System.out.println(now);

		// Calendarクラスのインスタンスを生成
		Calendar calendar = Calendar.getInstance();

		// 問② 「(Calendar.MONTH) + 数値」の処理は、想定していない値となる可能性があります。
		// その理由をコメントへ記述してください。
		// [ここへ記述]
		// うるう年だと予定していた日数より1日多くなるから
		System.out.println(calendar.get(Calendar.YEAR));
		System.out.println(calendar.get(Calendar.MONTH) + 1);
		System.out.println(calendar.get(Calendar.DATE));
		// 問③ 上記の「calendar」を使用し、本日から1年2ヶ月15日先の日付を表示しなさい。
		// - この課題に関しては課題実施日によって結果が異なりますので、Wiki課題の画像とは結果が異なります。
		// - また、うるう年の場合は設定内容が正しくとも日付がズレて表示される可能性があります。
		calendar.add(Calendar.YEAR, 1);
		calendar.add(Calendar.MONTH, 2);
		calendar.add(Calendar.DATE, 15);
		System.out.println(calendar.get(Calendar.YEAR));
		System.out.println(calendar.get(Calendar.MONTH) + 1);
		System.out.println(calendar.get(Calendar.DATE));

		// うるう年判定
		printLeapYear(calendar.get(Calendar.YEAR));

		/**
		 * カレンダーの応用、
		 * カレンダーテキストを使うことで表示される日にちを変更することが出来る
		 * 年や月といったデータを処理中で使用したい場合
		 * ライブラリを使用する際、所定の形式へ変換する必要がある場合
		 */
		try {
			String dateTime = "2018/01/01 00:00:00";
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy/mm/dd hh:mm:ss");
			//型を間違えるとparseExceptionが発生する
			Date date = sdf.parse(dateTime);
			//Date型に日時の変更を行う
			System.out.println(date);
		} catch (ParseException e) {
			System.out.println("時間の取得に失敗");
		}
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
		//インスタンスじゃなくて直接パターンの指定が出来る。メモリ節約になる
		LocalDateTime ldt1 = LocalDateTime.parse("2018/12/29 12:00:00", dtf);

	}

	/**
	 * うるう年判定
	 * 問③で日付がズレる可能性があるため補足として出力
	 * @param year
	 */
	private static void printLeapYear(final int year) {
		System.out.println(year + "年は、うるう年" + (Year.isLeap(year) ? "です。" : "ではありません。"));
	}
}