import javax.swing.*;   
public class ButtonRadio {

                                                 //4SU21CS044

JFrame f;  
  
ButtonRadio(){  
f=new JFrame();  
  
JRadioButton r1=new JRadioButton("A) Male");  
JRadioButton r2=new JRadioButton("B) FeMale");  
r1.setBounds(50,100,70,30);  
r2.setBounds(50,150,100,80);  
  
ButtonGroup bg=new ButtonGroup();  
bg.add(r1);bg.add(r2);  
  
f.add(r1);f.add(r2);  
  
f.setSize(300,300);  
f.setLayout(null);  
f.setVisible(true);  
}  
public static void main(String[] args) {  
    new ButtonRadio();  
}  
}
