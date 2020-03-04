package drawingshapes;

/******************************************************************************
 * DrawingShapes.java 
 * Programmer: @author jcboyd
 * Version: 1.0
 * Course: SDEV 2210
 *
 * This program draws shapes using characters based on user input
 *****************************************************************************/

public class DrawingShapes {

    public static void drawBar(int length)
    {
        for (int i = 1; i <= length; i++)
        {
            System.out.print("*");
        } //end for
        System.out.println();
    } //end drawBar
    
    
    
    
    public static void main(String[] args) {

    } //end main
    
} //end class DrawingShapes
