import java.awt.*;

public class TextAreaExample{
public static void main(String args[]){
Frame f = new Frame("TextArea");
TextArea area = new TextArea("Hey");

area.setBounds(100,100,80,30);

f.add(area);
f.setSize(400,400);
f.setVisible(true);
f.setLayout(null);

}}