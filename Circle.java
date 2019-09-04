
/**
 * Write a description of class Circle here.
 *
<<<<<<< HEAD
 * @author (2018315022 이지연)
=======
 * @author (your name)
>>>>>>> 603e4fb31c5c1df39b697d8eb6493916cffc284f
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
