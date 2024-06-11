import java.awt.*;
import javax.swing.*;
import java.awt.event.*;


public class CelsiusConverter implements ActionListener {
  JFrame converterFrame;
  //JPanel converterPanel;
  JTextField tempCelsius;
  JLabel celsiusLabel, fahrenheitLabel;                        //4SU21CS044
  JButton convertTemp;
  public CelsiusConverter() {
    converterFrame = new JFrame("Convert Celsius to Fahrenheit");
 
    converterFrame.setLayout(new FlowLayout());
  
    addWidgets();
    
    converterFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    converterFrame.pack();
    converterFrame.setVisible(true);
  }
  
    private void addWidgets() 
    {
    tempCelsius = new JTextField(2);
    celsiusLabel = new JLabel("Celsius",SwingConstants.LEFT);
    convertTemp = new JButton("Convert...");
    fahrenheitLabel = new JLabel("Fahrenheit",SwingConstants.LEFT);
    convertTemp.addActionListener(this);
    converterFrame.add(tempCelsius);
    converterFrame.add(celsiusLabel);
    converterFrame.add(convertTemp);
    converterFrame.add(fahrenheitLabel);
  }

  public void actionPerformed(ActionEvent event) {
    int tempFahr = (int)((Double.parseDouble(tempCelsius.getText())) * 1.8 + 32);
    fahrenheitLabel.setText(tempFahr + " Fahrenheit");
  }

  public static void main(String[] args) {    

    CelsiusConverter converter = new CelsiusConverter();
  }
}


