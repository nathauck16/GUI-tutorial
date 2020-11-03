import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class ButtonDemo implements ActionListener {
  JLabel label;

  ButtonDemo(){
      JFrame frame = new JFrame("Button");
      frame.setLayout(new FlowLayout());
      frame.setSize(220,90);

      JButton up = new JButton("Up");
      JButton down = new JButton("Down");

      up.addActionListener(this);
      down.addActionListener(this);

      frame.add(up);
      frame.add(down);

      label = new JLabel("Press a button");
      frame.add(label);
      frame.setVisible(true);

  }

public void actionPerformed(ActionEvent ae) {
  if(ae.getActionCommand().equals("Up")){
      label.setText("You pressed down");
  }
  else {
      label.setText("You pressed down");
  }
}
}