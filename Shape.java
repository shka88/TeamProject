
/**
 * Write a description of interface Shape here.
 *
 * @author (2018315022 이지연)
 * @version (19.09.02)
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