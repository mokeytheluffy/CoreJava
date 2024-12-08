package Oct.ex_11112024_AccessModifiers.Real;

public class TestCase1 extends BaseClass{

    public TestCase1(){
        super();// to call parent constructor in child class
        System.out.println("DC TC1");
    }

    public void startTestCase(){
        open_browser("Chrome");
        close_browser();
    }

    @Override // overriding setBrowser functionality
    public void setBrowser(String browser, boolean Auth) {
        System.out.println("Own Browser");// using own browser and not refer parent browser
        super.setBrowser(browser, Auth); // supper class is same as calling parent class as BaseClass
    }
}
