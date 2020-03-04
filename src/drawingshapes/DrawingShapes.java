package drawingshapes;

/******************************************************************************
 * DrawingShapes.java 
 * Programmer: @author jcboyd
 * Version: 2.0
 * Course: SDEV 2210
 *
 * This program draws shapes using characters based on user input
 *****************************************************************************/

import java.util.Scanner;

public class DrawingShapes {

    public static void drawBar(int length) 
    { //single line, default marker
        for (int i = 1; i <= length; i++)
        {
            System.out.print("*");
        } //end for
        System.out.println();
    } //end drawBar

    public static void drawBar(int length, String marker) 
    { //single line, custom marker
        for (int i = 1; i <= length; i++)
        {
            System.out.print(marker);
        } //end for
        System.out.println();
    } //end drawBar
    
    public static void drawBox(int length, int height)  
    { //multiple lines, default marker                                                 
        for (int i = 1; i <= height; i++)
        {
            drawBar(length);
        } //end for
    } //end drawBox
    
    public static void drawBox(int length, int height, String marker)
    { //multiple lines, custom marker
        for (int i = 1; i <= height; i++)
        {
            drawBar(length, marker);
        } //end for
    } //end drawBox
    
    public static void main(String[] args) 
    {
        Scanner stdIn = new Scanner(System.in);
        int width, height; //line and box dimensions
        String drawAnswer; //controls repeat loop
        String markerAnswer; //determines overloaded method 
        String marker;
        
        System.out.println("Drawing Project by JC Boyd");   
        
        do 
        {
            System.out.print("\nDo you want me to draw a box? (Y or N) ");
            drawAnswer = stdIn.nextLine();
      
            if (drawAnswer.equalsIgnoreCase("y"))
            {
                System.out.print("How wide is the box? ");
                width = stdIn.nextInt();
                System.out.print("How high is the box? ");
                height = stdIn.nextInt();
                stdIn.nextLine(); //clear Scanner input
                System.out.print("Do you want the default marker (asterisk), Y or N? ");
                markerAnswer = stdIn.nextLine();
                if (markerAnswer.equalsIgnoreCase("n"))
                {
                    System.out.print("What character do you want to use? ");
                    marker = stdIn.nextLine();
                    drawBox(width, height, marker); //call custom marker method
                }
                else
                { 
                    drawBox(width, height); //call default marker method
                } //end if  
            } //end if
        } while (drawAnswer.equalsIgnoreCase("y"));
          
    } //end main
    
} //end class DrawingShapes
