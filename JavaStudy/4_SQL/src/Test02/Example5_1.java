package Test02;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Example5_1 {
    /** ドライバーのクラス名 */
    private static final String POSTGRES_DRIVER = "org.postgresql.Driver";
    /** ・JDMC接続先情報 */
    private static final String JDBC_CONNECTION = "jdbc:postgresql://localhost:5432/lesson_db";
    /** ・ユーザー名 */
    private static final String USER = "postgres";
    /** ・パスワード */
    private static final String PASS = "postgres";
    public static void main(String[]args) {
    	Connection connection = null;
    	Statement statement = null;
    	ResultSet resultSet = null;

    	try {
    		/** データベースへの接続 */
    		Class.forName(POSTGRES_DRIVER);
    		/** データベース接続完了 */
    		/** SQLのデータを取得 */
    		connection = DriverManager.getConnection(JDBC_CONNECTION,USER,PASS);
    		//statementはクエリツールみたいなもの
    		statement = connection.createStatement();
    		String SQL = "SELECT * FROM Goods";
    		//　この中にSQLの結果が格納されるイメージ
    		resultSet = statement.executeQuery(SQL);
    		/** SQLのデータを確保 */
    		while(resultSet.next()) {
    			String column1 = resultSet.getString("GoodsName");
    			String column2 = resultSet.getString("UnitPrice");
    			String column3 = resultSet.getString("UpdateDate");

    			System.out.print(column1 + ",");
    			System.out.print(column2 + ",");
    			System.out.println(column3 + ",");
    		}
    	}catch(ClassNotFoundException e) {
    		e.printStackTrace();
    	}catch(SQLException e) {
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
    			e.printStackTrace();
    		}
    	}
    }
}
