package contract;

public class EmployeeContract {

	private int id;
	private String nameAndSurname;
	private String emaill;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}


	public String getNameAndSurname() {
		return nameAndSurname;
	}

	public void setNameAndSurname(String nameAndSurname) {
		this.nameAndSurname = nameAndSurname;
	}

	public String getEmaill() {
		return emaill;
	}

	public void setEmaill(String emaill) {
		this.emaill = emaill;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return id + " " + nameAndSurname + " " + emaill + " " ;
	}

}
