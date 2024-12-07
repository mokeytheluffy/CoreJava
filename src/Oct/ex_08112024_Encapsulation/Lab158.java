package Oct.ex_08112024_Encapsulation;

public class Lab158 {
    public static void main(String[] args) {
        VWOLogin vwoLogin = new VWOLogin("admin","password1234");
        System.out.println(vwoLogin.password);
        vwoLogin.password = "Hacker";
        System.out.println(vwoLogin.password);
        GoodVWOLogin vwoLogin1 = new GoodVWOLogin("goodname","password123");
       //System.out.println(vwoLogin1.password);
        String pass = vwoLogin1.getPassword(true);
        vwoLogin1.setPassword("hacker123",true);
        System.out.println(pass);
    }
}
class VWOLogin{
    public String username;
    public String password;

    public VWOLogin(String username,String password){
        this.username = username;
        this.password = password;
    }
}
class GoodVWOLogin {
    private String username;
    private String password;

    public GoodVWOLogin(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public String getPassword(boolean isAdmin) {
        if (isAdmin){
            return username;
        }
        return "None";
    }
    public void setPassword(String password, boolean isAdmin) {
        if (isAdmin) {
            this.password = password;
        }
        else {
            System.out.println("Not Alloweed");
        }
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    /*public String giveMePassword(Boolean isAuth) {
        if(isAuth){
            return username;
        }
            return "None";

    }*/
}
