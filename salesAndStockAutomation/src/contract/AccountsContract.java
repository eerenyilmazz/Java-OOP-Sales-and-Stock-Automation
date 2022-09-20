package contract;

public class AccountsContract {

	private int id;
	private int authorityiId;
	private int employeeId;
	private String password;
	
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}

	public int getAuthorityiId() {
		return authorityiId;
	}
	
	public void setAuthorityiId(int authorityiId) {
		this.authorityiId = authorityiId;
	}

	public int getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return id + " " + authorityiId + " " + employeeId + " " + password;
	}

}
