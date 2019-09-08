package th.ac.su.midterm07600516.ModelProfile;

public class Auth {
    private static final String username_user= "aaa";
    private static final String password_user= "111";
    private static final String username_teacher= "bbb";
    private static final String password_teacher= "222";

    String Username;
    String Password;
    public Auth(String usernameInput,String passwordInput){
        this.Username = usernameInput;
        this.Password = passwordInput;
    }

    public boolean checkInput(){
        if (Username.equals(username_user) && Password.equals(password_user)) {
            return true;
        }
        else if (Username.equals(username_teacher) && Password.equals(password_teacher)) {
            return true;
        }
        else{
            return false;
        }
    }
}
