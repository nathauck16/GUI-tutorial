import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class SwingDemo {
  SwingDemo() {
  JFrame frame1 = new JFrame("Swing Demo");

  frame1.setSize(275,100);

  //when not commented out, below code will crash our IDE when GUI is exited 
  //frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

  JLabel jlab = new JLabel("Oh hey a label!");
  JLabel lab2 = new JLabel(" second label");

  frame1.add(jlab);
  frame1.add(lab2, BorderLayout.SOUTH);

  frame1.setVisible(true);
  }

}