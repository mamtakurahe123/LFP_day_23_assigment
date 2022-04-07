package lamdaexpression;

public class UserRegistrationLamda {

	
	final String nameValidate = "^[A-Z][a-z]{2,}$";
	final String mobileValidate = "^[9][1]{0,1}\\s[1-9]{1}[0-9]{9}";
	final String emailValidate = "^[0-9a-zA-Z]+([._+-][0-9a-zA-Z]+)*@[0-9A-Za-z]+.[a-zA-Z]{2,4}([.][A-Za-z]{2,3})*$";
	final String passwordValidate = "(?=.*[A-Z])(?=.*[0-9])(?=.*[@$!%*#?&])[a-zA-Z0-9@$!%*#?&]{8,}$";
	
	private UserVelidationLamda firstName = (regex) -> (regex.matches(nameValidate));
	private UserVelidationLamda lastName = (regex) -> (regex.matches(nameValidate));
	private UserVelidationLamda phoneNomber=(regex) -> (regex.matches(mobileValidate));
	private UserVelidationLamda eMail=(regex) -> (regex.matches(emailValidate));
	private UserVelidationLamda password=(regex) -> (regex.matches(passwordValidate));
	
	public UserVelidationLamda getFirstName() {
		return firstName;
	}
	public void setFirstName(UserVelidationLamda firstName) {
		this.firstName = firstName;
	}
	public UserVelidationLamda getLastName() {
		return lastName;
	}
	public void setLastName(UserVelidationLamda lastName) {
		this.lastName = lastName;
	}
	public UserVelidationLamda getPhoneNomber() {
		return phoneNomber;
	}
	public void setPhoneNomber(UserVelidationLamda phoneNomber) {
		this.phoneNomber = phoneNomber;
	}
	public UserVelidationLamda geteMail() {
		return eMail;
	}
	public void seteMail(UserVelidationLamda eMail) {
		this.eMail = eMail;
	}
	public UserVelidationLamda getPassword() {
		return password;
	}
	public void setPassword(UserVelidationLamda password) {
		this.password = password;
	}
	
	
	
}

