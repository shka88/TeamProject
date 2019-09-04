
/**
 * Write a description of class Circle here.
 *
<<<<<<< HEAD
 * @author (2018315022 이지연)
=======
 * @author (2018315036 양유석, 2018315030 이가영, 2018315022 이지연)
>>>>>>> 2181261b68361c76c66b8ef2fe27923b6dcb3c84
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
