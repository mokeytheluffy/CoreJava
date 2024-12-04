package Oct.ex_07112024.Single_Inheritance.w;

public class Testcase1 extends Comman_BestTest{
    Testcase1(){
        System.out.println("DC----child");
    }
    void testcases(){
        startBrowser();
        closeBrowser();
        readexelfile();
    }
}
