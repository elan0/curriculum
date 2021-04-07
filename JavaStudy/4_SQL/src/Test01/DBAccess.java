package Test01;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBAccess {
	/** ドライバーのクラス名 */
	private static final String POSTGRES_DRIVER = "org.postgresql.Driver";
	/** JDMC接続先情報 */
	private static final String JDBC_CONNECTON = "jdbc:postgresql://localhost:5432/lesson_db";
	/** ユーザー名 */
	private static final String USER = "postgres";
	/** パスワード */
	private static final String PASS = "postgres";

	public static void main(String[]args) {
		Connection connection = null;
		try {
			//データベースに接続する準備
			Class.forName(POSTGRES_DRIVER);
			//接続先の情報
			connection = DriverManager.getConnection(JDBC_CONNECTON,USER,PASS);
			System.out.println("接続完了");
		}catch(ClassNotFoundException e) {
			e.printStackTrace();
		}catch(SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				if(connection != null) {
					// データベース接続
					connection.close();
					System.out.println("接続終了");
				}
			}catch(SQLException e) {
				e.printStackTrace();
			}
		}
		/**
		Class.forNameにJDBCを与え、JDBCドライバをロードする
		次にDriverManagerのgetConnectionを使うことでデータベースへのアクセルを可能にする
		最後に
		データベースのアクセスをcloseする
		*/
	}
}
