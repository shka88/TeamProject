
/**
 * Write a description of interface Shape here.
 *
 * @author (2018315036 양유석)
 * @version (2019.09.02)
 */
public interface Shape
{
    final double PI = 3.14;
    void draw();
    double getArea();
    default public void redraw()
    {
         System.out.print("--- 다시 그립니다. ");
         draw();
    }
}

