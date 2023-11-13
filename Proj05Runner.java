/****************************************
 File: Proj05runner.java
 Author: Fred Butoma
 Purpose: Proj05Runner.java is a class that implements a JFrame window
          and event handling for user interation with window
 ****************************************/

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;


public class Proj05Runner {
    // Constructor for Proj05Runner
    public Proj05Runner() {
        System.out.println("I certify that this program is my own work\n" +
                "and is not the work of others. I agree not\n" +
                "to share my solution with others.\n" +
                "-Fred Butoma");

        // Create a JFrame which is the window that will appear.
        JFrame displayWindow = new JFrame();

        // Set the size of the JFrame to be 300 pixels wide and 100 pixels tall.
        displayWindow.setSize(300, 100);

        //Set the title of the window
        displayWindow.setTitle("Fred Butoma, A05");

        // Set the JFrame's location to the upper-left corner of the screen.
        displayWindow.setLocation(0, 0);

        //Instantiate two Listener objects that will process Window events
        WProc1 winProcCmd1 = new WProc1(displayWindow);
//        WProc2 winProcCmd2 = new WProc2();

        //Register the listener with the displayWindow
        displayWindow.addWindowListener(winProcCmd1);
//        displayWindow.addWindowListener(winProcCmd2);


        // Make the JFrame visible to the user.
        displayWindow.setVisible(true);

    }

//
//        // Set the default close operation to EXIT_ON_CLOSE to terminate the program
//        // when the user clicks the close button.
//        displayWindow.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
//

//
//        // Add the JLabel to the JFrame so that it appears in the window.
//        displayWindow.add(label);
//
//
//


        // Add a WindowListener to handle window events.

        //This class is used to instantiate Listener objects. It implements the
        //WindowListener interface which requires that all methods declared be
        //overridden.
        class WProc1 implements WindowListener {
            //used to save a reference to the JFrame object
            JFrame displayWindowRef;

            WProc1(JFrame windowIn) {//constructor
                // save ref to JFrame object
                this.displayWindowRef = windowIn;
            }//end constructor

            public void windowClosed(WindowEvent e) {
//                System.out.println("WProc1 windowClosed test msg");
            }//end windowClosed()

            public void windowIconified(WindowEvent e) {
                System.out.println("Good Night");
            }//end windowIconified()

            public void windowOpened(WindowEvent e) {
//                System.out.println("WProc1 windowOpened test msg");
            }//end windowOpened()

            public void windowClosing(WindowEvent e) {
//                System.out.println("WProc1 windowClosing test msg");
                displayWindowRef.dispose();//generate WindowClosed
            }//end windowClosing()

            public void windowDeiconified(WindowEvent e) {
                System.out.println("Good Morning");
            }//end windowDeiconified()

            public void windowActivated(WindowEvent e) {
//                System.out.println("WProc1 windowActivated test msg");
            }//end windowActivated()

            public void windowDeactivated(WindowEvent e) {
//                System.out.println("WProc1 windowDeactivated test msg");
            }//end windowDeactivated()
        }//end class WProc1

//        //This class is used in conjunction with the previous class to instantiate
//        //listener objects
//        class WProc2 extends WindowAdapter {
//
//            public void windowIconified(WindowEvent e) {
//                System.out.println(
//                        "******** WProc2 windowIconified test msg");
//            }//end windowIconified()
//
//            public void windowDeiconified(WindowEvent e) {
//                System.out.println(
//                        "******** WProc2 windowDeiconified test msg");
//            }//end windowDeiconified()
//
//        }//end class WProc2
    }
//}

