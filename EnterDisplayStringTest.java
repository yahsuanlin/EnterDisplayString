import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class EnterDisplayStringTest {
  /** Main method */
  public static void main(String[] args) {
    JFrame frame = new EnterDisplayString();
    frame.setTitle("DisplayString");
    frame.setSize(500, 200);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setLocationRelativeTo(null); // Center the frame
    frame.setVisible(true);
  }
}
