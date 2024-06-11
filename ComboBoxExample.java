import java.awt.*;
import javax.swing.*; 
import java.awt.event.*;
	
	 public class ComboBoxExample implements ActionListener { 
		JComboBox box;
		public ComboBoxExample() { 
			JFrame frame = new JFrame("ComboBoxExample"); 
			frame.setLayout(new FlowLayout()); 
			box = new JComboBox();
			box.addItem("1");
			box.addItem("2");                                //4SU21CS044
			box.addItem("3");
			
			box.addActionListener(this); 
			frame.add(box);
			frame.pack();
			frame.setVisible(true); 
			} 
		public static void main(String[] args) {
			// TODO Auto-generated method stub
 
		
			new ComboBoxExample();
		}
		public void actionPerformed(ActionEvent e)
		{
			if ("comboBoxChanged".equals(e.getActionCommand())) 
			{
				System.out.println("User chose index " + box.getSelectedIndex());
				}
			}
		}
	



