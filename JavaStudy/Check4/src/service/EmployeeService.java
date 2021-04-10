package service;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.Calendar;

import bean.EmployeeBean;

/**
	 * ・社員情報検索サービス
	 */
public class EmployeeService {

	// 問1 接続情報を記述して下さい
	/** ドライバーのクラス名 */
	private static final String POSTGRES_DRIVER = "org.postgresql.Driver";
	/** JDMC接続先情報 */
	private static final String JDBC_CONNECTION = "jdbc:postgresql://localhost:5432/employee?characterEncoding=UTF-8";
	/** ユーザー名 */
	private static final String USER = "postgres";
	/** パスワード */
	private static final String PASS = "postgres";
	/** タイムフォーマット */
	private static final String TIME_FORMAT = "yyyy/MM/dd HH:mm:ss";

	// 問② 入力された値で、UPDATEする文
	/** SQL UPDATE文 */
	private static final String SQL_UPDATE = "UPDATE employee_table SET login_time = ? where id = ?;";
	/** SQL SELECT文 */
	private static final String SQL_SELECT = "select name, comment, login_time from employee_table where id = ? and password = ?;";

	EmployeeBean employeeDate = null;

	public EmployeeBean search(String id, String password) {

		Connection connection = null;
		Statement statement = null;
		ResultSet resultSet = null;
		PreparedStatement preparedStatement = null;

		try {
			// データベースに接続
			Class.forName(POSTGRES_DRIVER);
			connection = DriverManager.getConnection(JDBC_CONNECTION,USER,PASS);
			statement = connection.createStatement();

			// 処理が流れた時間をフォーマットに合わせて生成
			Calendar cal = Calendar.getInstance();
			SimpleDateFormat sdf = new SimpleDateFormat(TIME_FORMAT);

			// PreparedStatementで使用するためString型に変換
			String login_time = sdf.format(cal.getTime());


			/** データが届いているかどうかの確認.自分用 */
			System.out.println(id);
			System.out.println(password);
			System.out.println(login_time);
			/*
			 * 任意のっゆーざーんおログインタイムを更新できるようにプリペア度ステートメントを記述。
			 */

			// preparedStatementに実行したいSQLを格納
			preparedStatement = connection.prepareStatement(SQL_UPDATE);
			  // 問④ preparedStatementを使って、一番目のindexに今の時間をセットしてください。2番目のindexにIDをセットしてください。
			//UPDATE employee_table SET login_time = '?' where id = '?';
			preparedStatement.setString(1, login_time);
			preparedStatement.setString(2, id);
			  // 問⑤ UPDATEを実行する文を記述
			preparedStatement.executeUpdate();
			System.out.println("アップデート完了");
			/*
			 * UPDATEが成功したものを即座に表示
			 * 任意のユーザーを検索できるように、プリペアドステートメントを記述。
			 */
			preparedStatement = connection.prepareStatement(SQL_SELECT);
			  //問⑥ 一番目のindexにIDをセットしてください。2番目のindexにPASSWORDをセット。
			preparedStatement.setString(1, id);
			preparedStatement.setString(2, password);
			  // SQLを実行。実行した結果をresultSetに格納。
			resultSet = preparedStatement.executeQuery();

			while(resultSet.next()) {
				  // 問⑦ tmpName,tmpComment,tmpLoginTimeに適当な値を入れてください。
				System.out.println("格納した値");
				String tmpName = resultSet.getString("name");
				System.out.println(tmpName);
				String tmpComment = resultSet.getString("comment");
				System.out.println(tmpComment);
				String tmpLogin_Time = resultSet.getString("login_time");
				System.out.println(tmpLogin_Time);

				 // 問⑧ EmployeeBeanに取得したデータを入れてください。
				 employeeDate = new EmployeeBean();
				 employeeDate.setName(tmpName);
				 employeeDate.setComment(tmpComment);
				 employeeDate.setLogin_time(tmpLogin_Time);

			}
			 // forName()で例外発生
		}catch(ClassNotFoundException e) {
			e.printStackTrace();
		}catch(SQLException e){
			e.printStackTrace();
		}finally {
			try {
			if(resultSet != null) {
				resultSet.close();
			}
			if(statement != null) {
				statement.close();
			}
			if(connection != null) {
				connection.close();
			}
			}catch(SQLException e) {
				System.out.println("正常にプログラムが閉じられませんでした");
				e.printStackTrace();
			}
		}
		System.out.println("クラスに格納されたデータ");
		System.out.println(employeeDate.getName());
		System.out.println(employeeDate.getComment());
		System.out.println(employeeDate.getLogin_Time());

		return employeeDate;
	}
}





































