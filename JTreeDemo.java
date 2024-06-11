
import java.awt.*;
import javax.swing.event.*;
import javax.swing.*;
import javax.swing.tree.*;

public class JTreeDemo extends JFrame implements TreeSelectionListener
{
    JTree tree;
    JLabel jlab;                          //4SU21CS044
public JTreeDemo() 
{   
    makeGUI();
    setSize(275,100);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);    
    setVisible(true);
}
private void makeGUI() 
{
DefaultMutableTreeNode top = new DefaultMutableTreeNode("Options");
DefaultMutableTreeNode a = new DefaultMutableTreeNode("A");
top.add(a);
DefaultMutableTreeNode a1 = new DefaultMutableTreeNode("A1");
a.add(a1);
DefaultMutableTreeNode b = new DefaultMutableTreeNode("B");
top.add(b);
DefaultMutableTreeNode b1 = new DefaultMutableTreeNode("B1");
b.add(b1);

tree = new JTree(top);
JScrollPane jsp = new JScrollPane(tree);
add(jsp);
jlab = new JLabel();
add(jlab, BorderLayout.SOUTH);
tree.addTreeSelectionListener(this);
}

public void valueChanged(TreeSelectionEvent tse) 
{
    jlab.setText("Selection is " + tse.getPath());
}
    public static void main(String[] args)
    {
        new JTreeDemo();
    }
}
