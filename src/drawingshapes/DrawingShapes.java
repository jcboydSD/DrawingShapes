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

    public static void drawBar(int length, String marker)
    {
        for (int i = 1; i <= length; i++)
        {
            System.out.print(marker);
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
    
    public static void drawBox(int length, int height, String marker)
    {
        for (int i = 1; i <= height; i++)
        {
            drawBar(length, marker);
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
        
        //user input for box
        int width, height;
        String answer;
        String marker = "*";
        
        System.out.print("How wide is the box? ");
        width = stdIn.nextInt();
        System.out.print("How high is the box? ");
        height = stdIn.nextInt();
        stdIn.nextLine();
        System.out.print("Do you want the default marker (asterisk), Y or N? ");
        answer = stdIn.nextLine();
        if (answer.matches("n|N"))
        {
            System.out.print("What character do you want to use? ");
            marker = stdIn.nextLine();
            drawBox(width, height, marker);          
        }
        else
        { 
            drawBox(width, height);
        } //end if
        
    } //end main
    
} //end class DrawingShapes
