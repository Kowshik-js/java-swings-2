import java.awt.*; 
	import javax.swing.*;
	import java.awt.event.*;
	
	public class CheckBoxDemo extends JFrame
	implements ActionListener {
		JCheckBox chinButton; 
		JCheckBox glassesButton;
		JCheckBox hairButton;
		JCheckBox teethButton; 
		JButton goButton = new JButton("Go!");     //4SU21CS044
		public CheckBoxDemo() { 
			chinButton = new JCheckBox("Chin"); 
			chinButton.setSelected(true);
			glassesButton = new JCheckBox("Glasses"); 
			glassesButton.setSelected(true); 
			hairButton = new JCheckBox("Hair"); 
			hairButton.setSelected(true); 
			teethButton = new JCheckBox("Teeth");
			teethButton.setSelected(true);
			goButton.addActionListener(this);
			setLayout(new GridLayout(0, 1));
			add(chinButton);
			add(glassesButton);
			add(hairButton);
			add(teethButton);
			add(goButton);
			} 
		public static void main(String s[]) { 
			JFrame frame = new CheckBoxDemo();
			frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			frame.pack();
			frame.setVisible(true);
		}
		public void actionperformed(ActionEvent e)
		{
			if(glassesButton.isSelected())
			{
				System.out.println("Glass=true");
			}
			else
			{
				System.out.println("Glass=flase");
			}
			System.exit(0);
		}
		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			
		}
	}
				
				
			
