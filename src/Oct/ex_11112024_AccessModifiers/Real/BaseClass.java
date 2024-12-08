package Oct.ex_11112024_AccessModifiers.Real;

public class BaseClass {
   private String Browser;
    BaseClass(){
       System.out.println("DC- BaseClass");
   }
   BaseClass(String b){
       System.out.println("CC BaseClass");
   }
    public String getBrowser() {
        return Browser;
    }

    public void setBrowser(String browser,boolean Auth) {
        if (Auth) {
            this.Browser = browser;
        } else {
            System.out.println("Not Allowed");
        }
    }

    public void open_browser(){
        System.out.println("Opening of Browser");
    }

    public void open_browser(String browser_name){
        System.out.println("Opening of Browser--->\n" + browser_name);
    }
    public void close_browser(){
        System.out.println("closing the Browser");
    }
}
