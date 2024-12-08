package Oct.ex_11112024_AccessModifiers.Police;

public class Cop {
    private int gun;
    public String iCard;

    public Cop(int gun) {
        this.gun = gun;
    }
    protected void canIshoot(){
        System.out.println("Yes,You Can!!");
    }
}
