package Oct.ex_30102024;

public class Lab139_Arrays_For_Each {
    public static void main(String[] args) {
        int [] a= new int[3];
        a[0]=90;
        a[1]=91;
        a[2]=92;
        // Usually we use
        //for (int i = 0; i < a.length; i++) {
          //  System.out.println(a[i]);

        //enhance version
        for(int i:a) {
            System.out.println(i);
        }

       String[] aa = {"aniket","sakshi","pappu","pandu"};
        for (String b : aa){
            System.out.println(b);
        }

        }
    }

