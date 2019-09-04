
/**
 * 가로와 세로의 길이를 받아 사각형객체를 만들고 넓이를 구해주는 클래스
 *
 * @author (2018315036 양유석, 2018315030 이가영, 2018315022 이지연)
 * @version (2019.09.04)
 */
public class Rect implements Shape
{
    int width; 
    int height;
    
    public Rect(int width, int height){
        this.width = width;
        this.height = height;
    }
 
    public void draw(){
        System.out.println(width + "x" + height +"크기의 사각형입니다.");
    }
    
    public double getArea(){
        return width*height;
    }
}
