package Oct.ex_07112024.Single_Inheritance.w;

public class Testcase2 extends Comman_BestTest{

        Testcase2() {
            System.out.println("DC----child");
        }
        void testcase2 () {
            startBrowser();
            System.out.println("TC2 Executing");
            closeBrowser();
            readexelfile();
        }
    }

