import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class RadioButtonDemo extends JFrame implements 	ActionListener {
  String birdString = "Bird";
  String catString = "Cat";                       //4SU21CS044
  String dogString = "Dog";
  String rabbitString = "Rabbit";
  String pigString = "Pig";
  JRadioButton birdButton = new JRadioButton(birdString);
  JRadioButton catButton = new JRadioButton(catString);
  JRadioButton dogButton = new JRadioButton(dogString);
  JRadioButton rabbitButton = new 	JRadioButton(rabbitString);
  JRadioButton pigButton = new JRadioButton(pigString);
  JButton goButton = new JButton("Go!");

  public RadioButtonDemo() {
    birdButton.setSelected(true);
    ButtonGroup group = new ButtonGroup();
    group.add(birdButton);
    group.add(catButton);
    group.add(dogButton);
    group.add(rabbitButton);
    group.add(pigButton);
    
    goButton.addActionListener(this);

    setLayout(new GridLayout(0, 1));
    add(birdButton);
    add(catButton);
    add(dogButton);
    add(rabbitButton);
    add(pigButton);
    add(goButton);
  }

  public static void main(String s[]) {
    JFrame frame = new RadioButtonDemo();
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    
    frame.pack();
    frame.setVisible(true);
  }
  
public void actionPerformed(ActionEvent e) {
    if (birdButton.isSelected()) {
      System.out.println("User finally selected bird.");
      System.exit(0);
    }
    if (catButton.isSelected()) {
      System.out.println("User finally selected cat.");
      System.exit(0);
    }
    if (dogButton.isSelected()) {
      System.out.println("User finally selected dog.");
      System.exit(0);
    }

    if (rabbitButton.isSelected()) {
      System.out.println("User finally selected rabbit.");
      System.exit(0);
    }
    if (pigButton.isSelected()) {
      System.out.println("User finally selected pig.");
      System.exit(0);
    }
  }
}
