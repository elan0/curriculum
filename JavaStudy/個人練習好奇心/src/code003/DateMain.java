package code003;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.OffsetDateTime;
import java.time.Year;
import java.time.ZonedDateTime;
import java.util.Calendar;
import java.util.Date;

public class DateMain {

	public static void main(String[] args) {
		/**
		 * Dateクラスの練習用
		 */
		Date now = new Date();
		System.out.println(now);
		/**
		 * Callenderクラス
		 */
		Calendar cal = Calendar.getInstance();
		System.out.println(cal.getTime());
		/**
		 * Callenderクラスの計算方法
		 */
		Calendar cal2 = Calendar.getInstance();
		System.out.print(cal2.get(Calendar.YEAR) + "/");
		System.out.print(cal2.get(Calendar.MONTH + 1) + "/");
		System.out.print(cal2.get(Calendar.DATE) + "/");
		System.out.print(cal2.get(Calendar.AM_PM) + "/");
		System.out.print(cal2.get(Calendar.HOUR) + "/");
		System.out.print(cal2.get(Calendar.MINUTE) + "/");
		System.out.println(cal2.get(Calendar.SECOND));

		System.out.println(cal2.get(Calendar.MONTH + 8));
		/**
		 * java.timeを使ったCalenderクラス
		 */
		LocalDateTime ldtNow = LocalDateTime.now();
		System.out.println(ldtNow.toString());
		//LocalDateTimeは0.001秒までカウントすることが出来る

		OffsetDateTime odtNow = OffsetDateTime.now();
		System.out.println(odtNow.toString());

		ZonedDateTime zdtNow = ZonedDateTime.now();
		System.out.println(zdtNow.toString());

		/*
		 * Local,Offset,Zoneの順に、.000,GMTとの時差,+どの場所かのデータを増やせる
		 * 但し、データを取得するにはその都度インスタンス化しなければならない
		 */
		LocalDateTime ldt = LocalDateTime.now();
		System.out.println(ldt.getMonthValue() + "月");
		//with~~を使うことでLocalDateTimeの指定を出来る
		ldt = ldt.withMonth(12);
		System.out.println(ldt.getMonthValue() + "月");
		//Year.isLeapを使うことでうるう年かどうかの判定もできる
		int year =2020;
		System.out.println(year + "年は、うるう年" + (Year.isLeap(year) ? "です" : "ではない"));


		/*
		 * カレンダー出力の書き換え
		 */
		Date date1 = new Date();
		Calendar ca2 =Calendar.getInstance();
		//MMだけ大文字、注意！
		SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy年MM月dd日hh時mm分");
		try {
		System.out.println(date1);
		System.out.println(sdf2.format(date1));
		date1 =sdf2.parse("1996年12月25日11時20分");
		System.out.println(date1);
		System.out.println(sdf2.format(date1));
		///////////////////////////////////////////////////////////
		System.out.println(ca2);
		System.out.println(ca2.after(sdf2));
		System.out.println(ca2.before(sdf2));

		}catch(ParseException e) {
			System.out.println("形を変えられないよ");
		}
	}

	/**
	 * うるう年判定
	 * @param year
	 */
	public static void printLeapYear(final int year) {
		boolean isLeapYear = false;
		if (year % 4 == 0) {
			if ((year % 100) == 0) {
				isLeapYear = ((year % 400) == 0);
			} else {
				isLeapYear = true;
			}
		}
		System.out.println(year + "年はうるう年" + (isLeapYear ? "です。" : "ではありません。"));
	}
}
