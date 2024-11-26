package Oct.ex_30102024;

public class Lab143_Pattern {public static void main(String[] args) {
    //iterate-----Move across
    int[][] matrix = {{1,2,3},{4,5,6},{7,8,9}};
    //R-->3
    //R-->C-->3
    for (int i = 0; i < matrix.length; i++) {
        for (int j = 0; j < matrix[i].length; j++) {
            System.out.print("*");

        }
        System.out.println("");
    }


}
}
