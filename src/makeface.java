import java.awt.Color;
import processing.core.PApplet;

public class makeface {
    private float xpos, ypos ,rad;
    private Color color;
    
    private PApplet pen;
    
    public Face(PApplet p, float x, float y)
    {
        xpos = x;
        ypos = y;
        rad =100;
        color = Color.red;
        pen=p;
    }
    
}

 public void draw()
{

    pen.stroke(0);
    pen.fill(color.getRed(),color.getGreen ,color.getBlue());
    drawCircle(xpos, ypos, rad ,rad);
    pen.fill(255,255,0);
    drawCircle(xpos - rad/5, ypos-rad/5, rad/4, rad/4 );
    drawCircle(xpos - rad/5, ypos-rad/5, rad/4, rad/4 );

    drawLine(xpos-.2*rad, ypos+.3*rad, xpos+.20*rad, ypos+.3*rad);
    drawLine(xpos-.2*rad, ypos+.3*rad, xpos-.25*rad, ypos+.2*rad);
    drawLine(xpos-.2*rad, ypos+.3*rad, xpos+.25*rad, ypos+.2*rad);
}


  private void drawCircle(float x , float y, float wid, float ht)
{
    pen.elipse(x,y,wid,ht);
}


   private void drawLine(double x1, double x2, double y1, double y2)
{
    pen.line((float)x1, (float) y1, (float)x2, (float)y2);
}
    public void erase()
{
    pen.fill(255);
    pen.noStroke();
    pen.ellipse(xpos, ypos, rad+5, rad+5);
}