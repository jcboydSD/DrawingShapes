package drawingshapes;

/******************************************************************************
 * DrawingShapes.java 
 * Programmer: @author jcboyd
 * Version: 1.0
 * Course: SDEV 2210
 *
 * This program draws shapes using characters based on user input
 *****************************************************************************/

import java.util.Scanner;

public class DrawingShapes {

    public static void drawBar(int length)
    {
        for (int i = 1; i <= length; i++)
        {
            System.out.print("*");
        } //end for
        System.out.println();
    } //end drawBar
    
    public static void drawBox(int length, int height)
    {
        for (int i = 1; i <= height; i++)
        {
            drawBar(length);
        } //end for
    } //end drawBox
    
    
    public static void main(String[] args) 
    {
        Scanner stdIn = new Scanner(System.in);
        System.out.println("Drawing Project by JC Boyd\n");
        
        //draw a right triangle
        for (int i = 1; i <= 6; i++)
        {
            drawBar(i);
        } //end for
        System.out.println();
        
        //draw a box
        drawBox(5, 4);
        System.out.println();
        
    } //end main
    
} //end class DrawingShapes
