package Oct.ex_18112024_Try_Catch;

public class Lab190_Custom_Exception {
    public static void main(String[] args) throws Exception {
        Lab189 sbi = new Lab189("INR",100);
        Lab189 icici = new Lab189("INR", 124);
        System.out.println(sbi.add(icici));

        Lab189 jp_morgan = new Lab189("USD", 100);
        //100+100*85 = 8600
        System.out.println(sbi.add(jp_morgan));
    }
}
