package Oct.ex_14112024_Static_Keyword.ENUM;

public class Lab172 {
    public static void main(String[] args) {
        System.out.println(colors.RED.getHexcode());
        if (colors.GREEN.getHexcode() == "#61FF33"){
            System.out.println("Color is Green");
        }
    }

}

enum colors {

   RED("#FF000"), GREEN("#61FF33"),BLUE("#3377FF"),YELLOW("4477FF");


    private String hexcode;

    colors(String hexcode) {
        this.hexcode = hexcode;
    }
  String getHexcode(){
        return this.hexcode;
  }
}