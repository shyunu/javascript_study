package ex02.setter;

public class MemberDAO {

	private MyDataSource myDataSource;
	
	//세터주입
	public void setMyDataSource(MyDataSource myDataSource) {
		this.myDataSource = myDataSource;
	}

	//getter
	public MyDataSource getMyDataSource() {
		return myDataSource;
	}
	
	
	
	
}
