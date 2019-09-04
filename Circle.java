
/**
 * Write a description of class Circle here.
 *
 * @author (your name)
 * @version (2019.09.04)
 */
public class Circle implements Shape
{
    int radius;

    public Circle(int radius){
        this.radius=radius;
    }

    public void draw(){
        System.out.println("반지름이 "+radius+"인 원입니다.");
    }

    public double getArea(){
        return radius*radius*PI;
    }
}
