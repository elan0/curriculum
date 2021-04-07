package Test04;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Example5_4 {
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
    	PreparedStatement preparedStatement = null;
    	ResultSet resultSet = null;

    	String USER_NAME ="TARO";
    	String PASSWORD = "HATA";
    	try {
    		Class.forName(POSTGRES_DRIVER);
    		connection = DriverManager.getConnection(JDBC_CONNECTION, USER,PASS);
    		/** 複数のINSERT文の書き込みを行うメソッド
    		 * PreparedStatementを使うことで複数のINSERTを行うことが出来る
    		 * String SQL内の?に文字が入力される(なぜか直接入力は出来ない)
    		 *  */
    		String SQL ="INSERT INTO Trening(test01,test02,test03) VALUES(?,?,?)";
    		preparedStatement = connection.prepareStatement(SQL);
    		for(int i=1;i<=10;i++) {
    			preparedStatement.setString(1,USER_NAME);
    			preparedStatement.setString(2, PASSWORD);
    			preparedStatement.setInt(3, i);
    			preparedStatement.executeUpdate();
    		}



    		/** 入力された文字をみる */
    		statement = connection.createStatement();
    		String SQL2 ="select * from trening";
    		resultSet = statement.executeQuery(SQL2);
    		while(resultSet.next()) {
    			String abc1 = resultSet.getString("test01");
    			String abc2 = resultSet.getString("test02");
    			String abc3 = resultSet.getString("test03");

    			System.out.print(abc1+",");
    			System.out.print(abc2+",");
    			System.out.println(abc3);
    		}

    	}catch(ClassNotFoundException e) {
    		e.printStackTrace();
    	}catch(SQLException e){
    		e.printStackTrace();
    	}finally {
    		try {
    			if(resultSet != null) {
    				resultSet.close();
    			}
    			if(preparedStatement != null) {
    				preparedStatement.close();
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
