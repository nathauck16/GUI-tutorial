import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class SwingDemo {
  SwingDemo() {
  JFrame frame = new JFrame("Swing Demo");

  frame.setSize(275,100);

  //when not commented out, below code will crash our IDE when GUI is exited 
  //frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

  JLabel jlab = new JLabel("Oh hey a label!");

  frame.add(jlab);

  frame.setVisible(true);
  }

}