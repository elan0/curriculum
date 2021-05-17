package com.example.security.springsecurity.account;


//実行時に宣言した各フィールド変数がカラムとして作成される
//問１－１ DB設計に必要なアノテーションを記述
@Table(name="accounts")
public class Account implements UserDetails{

	private static final long serialVersionUID = 1L;

	//権限は一般ユーザ、マネージャ、システム管理者の3種類とする
	public enum Authority {ROLE_USER,ROLE_MANAGER,ROLE_ADMIN}

	//問１－２ プライマリーキーを設定するアノテーションを記述
	@Embeddable
	@Column(nullable = false, unique = true)
	private String usernamae;
	
	
}
