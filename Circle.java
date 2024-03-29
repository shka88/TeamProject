
/**
 * 반지름이 radius인 원의 면적을 구하는 Circle class 
 *
 * @author (2018315036 양유석, 2018315030 이가영, 2018315022 이지연)
 * @version (2019.09.04)
 */
public class Circle implements Shape
{
    int radius;

    public Circle(int radius){ //
        this.radius=radius;
    }

    public void draw(){
        System.out.println("반지름이 "+radius+"인 원입니다.");
    }

    public double getArea(){
        return radius*radius*PI;
    }
}
