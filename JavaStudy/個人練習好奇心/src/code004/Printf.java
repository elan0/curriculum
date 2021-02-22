package code004;

import java.util.Date;

public class Printf {
	public static void main(String[] args) {
		System.out.println("printfメソッドについて");
		/*
		for(int i =0;i<65535;i++) {
			System.out.printf("%o",i);
			if(i%10==0) {
				System.out.println();
			}
		}
		*/

		/*	printf(ここに入るやつ,数字)
		%d	10進整数表記になる
		%o	8進整数表記になる
		%x	16進整数表記になる
		%f	浮動小数点数表記になる
		*/
		int one = 1;
		System.out.printf("%03d", one);
		//0が3桁の意味

		Date date = new Date();
		System.out.printf("%tY年%<tB%<te日(%<ta)%<tp%<tI時%<tM分", date);
		/*
		tH, TH	時間　(00 – 23)　0 が付加される
		tI, TI (大文字のアイ)	時間　(01 – 12)　0 が付加される
		tk, Tk	時間　(0 – 23)　0 は付加されない
		tl, Tl (小文字のエル)	時間　(1 – 12)　0 は付加されない
		tM, TM	分　(00 – 59)　0 が付加される
		tS, TS	秒　(00 – 60)　0 が付加される
		tp, Tp	午前・午後の表記
		tB, TB	月の表示
		tb, Tb	月表示の省略形
		tA, TA	曜日の表示
		ta, Ta	曜日の省略形
		tY, TY	年の4桁　0 が付加される
		ty, Ty	年の下2桁　(00 – 99)　0 が付加される
		tm, Tm	月　(01 – 13)　0 が付加される（13は太陰暦を使用する場合に使う）
		td, Td	日　(01 – 31)　0 が付加される
		te, Te	日　(1 – 31)　0 は付加されない
		 */
	}
}
