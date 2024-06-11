import javax.swing.*;  



public class ButtonDemo extends JFrame
{ 
JFrame f;  
ButtonDemo(){  
JButton b=new JButton("CLICK ME");       //4SU21CS044
b.setBounds(130,100,100, 40);  
add(b); 
setSize(400,500);  
setLayout(null);  
setVisible(true);  
}  
public static void main(String[] args) {  
new ButtonDemo();  
}

}
