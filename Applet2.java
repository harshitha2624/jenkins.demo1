
import java.applet.*;
import java.awt.*;
/*<applet code="Applet2.class" width="300" height="300"></applet>*/
public class Applet2 extends Applet{
public void paint(Graphics g)
{
int x[]={200,300,300,200,100,100};
int y[]={0,100,500,700,500,100};
g.setColor(Color:RED);
g.fillPolygon(x,y,6);

}
}
