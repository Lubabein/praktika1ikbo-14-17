import java.lang.*;
 class Ball{
    private String color;
    private int radius;
    public Ball(){
        color="blak";
        radius=15;
    }
    public Ball(int r){
        radius=r;
    }
    public Ball(String c){
        color=c;
    }
    public Ball(int r, String c){
        radius=r;
        color=c;
    }

    public void setColor(String c){
        color=c;
    }
     public void setRadius(int r){
        radius=r;
    }

    public String getColor(){
        return color;
    }
    public int getRadius(){
        return radius;
    }
    public void printV(){
        System.out.println("V="+1.00/3*3.14*radius*radius*radius);
    }
    public String ToString(){
        return "Color:"+color+" Radius="+radius;
    }

 }
public class BallTest{
 public static void main(String[] args) {
  Ball b =new Ball(14);
  Ball b1= new Ball(10,"red");
  b.setColor("green");
  b.printV();
  System.out.println(b1.ToString());
 }
}
