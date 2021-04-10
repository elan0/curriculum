package bean;

/**
 * ・社員情報データモデル
 */
public class EmployeeBean {
	private String Id;
	private String PassWord;
	private String Name;
	private String Comment;
	private String Login_Time;

	public void setId(String Id) {
		this.Id = Id;
	}

	public void setPassWord(String PassWord) {
		this.PassWord = PassWord;
	}

	public void setName(String Name) {
		this.Name = Name;
	}

	public void setComment(String Comment) {
		this.Comment = Comment;
	}
	public void setLogin_time(String Login_Time) {
		this.Login_Time = Login_Time;
	}

	public String Id() {
		return Id;
	}

	public String getPassword() {
		return PassWord;
	}

	public String getName() {
		return Name;
	}

	public String getComment() {
		return Comment;
	}

	public String getLogin_Time() {
		return Login_Time;
	}
}
