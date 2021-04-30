
public class User {

	//ortak olan fieldlar user adý altýnda toplandý
	//getter ve setterlarý yazýldý field'larýmýzýn 
	    private String email;
	    private String userName;
	    private String password;
	    private int id;
	    private String userCode;


	    public User(String email, String userName, String password, int id) {
	        this.email = email;
	        this.userName = userName;
	        this.password = password;
	        this.id = id;
	    }

	    public String getEmail() {
	        return email;
	    }

	    public void setEmail(String email) {
	        this.email = email;
	    }

	    public String getUserName() {
	        return userName;
	    }

	    public void setUserName(String userName) {
	        this.userName = userName;
	    }

	    public String getPassword() {
	        return password;
	    }

	    public void setPassword(String password) {
	        this.password = password;
	    }

	    public int getId() {
	        return id;
	    }

	    public void setId(int id) {
	        this.id = id;
	    }

		public String getUserCode() {
			return "#"+this.userName+this.id;
		}
	
	
}
