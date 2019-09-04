
/**
 * Write a description of class Oval here.
 *
 * @author (2018315036 양유석, 2018315030 이가영, 2018315022 이지연)
 * @version (2019.09.04)
 */
public class Oval implements Shape
{
    int width; 
    int height;
    
    public Oval(int width, int height){
        this.width = width;
        this.height = height;
    }
 
    public void draw(){
        System.out.println(width + "x" + height +"에 내접하는 타원입니다.");
    }
    
    public double getArea(){
        return PI*(width/2)*(height/2);
    }
}
