import java.awt.*;
import java.awt.event.*;

public class ButtonExample{
public static void main(String args[]){
Frame f=new Frame("Button");
Button b=new Button("Click me");

b.setBounds(100, 100, 100, 100);
b.addActionListener(e->System.out.println("Button Clicked!"));

f.add(b);
f.setSize(300,300);
f.setLayout(null);
f.setVisible(true);

}
}