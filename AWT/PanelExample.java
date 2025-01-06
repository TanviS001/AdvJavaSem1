import java.awt.*;

public class PanelExample{
public static void main(String args[]){
Frame f = new Frame("TextArea");
Panel p = new Panel();
p.setBackground(Color.PINK);

p.setBounds(100,100,80,30);

f.add(p);
f.setSize(400,400);
f.setVisible(true);
f.setLayout(null);

}}