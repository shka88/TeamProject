
/**
 * Circle과 Oval, Rect클래스로부터 도형을 그리고 면적을 계산하는 프로그램.
 *
 * @author (2018315036 양유석, 2018315030 이가영, 2018315022 이지연)
 * @version (2019.09.04)
 */
public class MyApp
{
    public static void main(String[] args){    
        Shape[] list = new Shape[3];
        list[0] = new Circle(10);    
        list[1] = new Oval(20,30);    
        list[2] = new Rect(10,40);
        
        for(int i = 0; i < list.length; i++)          
            list[i].redraw();    
        
        for(int i = 0; i < list.length; i++)          
            System.out.println("면적은 " + list[i].getArea()); 
    }
}
