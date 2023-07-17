package pkgclass.record;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JButton;

public final class MyButton extends JButton {

    public boolean isOver() {
        return over;
    }

    public void setOver(boolean over) {
        this.over = over;
    }

    public Color getColor() {
        return color;
    }

    public final void setColor(Color color) {
        this.color = color;
        setBackground(color);
    }

    public Color getColorOver() {
        return colorOver;
    }

    public void setColorOver(Color colorOver) {
        this.colorOver = colorOver;
    }

    public Color getColorClick() {
        return colorClick;
    }

    public void setColorClick(Color colorClick) {
        this.colorClick = colorClick;
    }

    public Color getBorderColor() {
        return borderColor;
    }

    public void setBorderColor(Color borderColor) {
        this.borderColor = borderColor;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public MyButton() 
    {
        //  Init Color
        setColor(new Color(255,255,255));
        setBackground(new Color(9,166,254));
        setForeground(Color.black);
        colorOver = new Color(255,255,255);
        colorClick = new Color(153,153,153);
        borderColor = new Color(153,153,153);
        setContentAreaFilled(false);
        //  Add event mouse
        addMouseListener(new MouseAdapter() 
        {
            @Override
            public void mouseEntered(MouseEvent me) 
            {
                setBackground(new Color(255,255,255));
                over = true;
            }

            @Override
            public void mouseExited(MouseEvent me) 
            {
                setBackground(new Color(9,166,254));
                over = false;
            }

            @Override
            public void mousePressed(MouseEvent me) 
            {
                setBackground(new Color(153,153,153));
            }

            @Override
            public void mouseReleased(MouseEvent me) 
            {
                if (over) 
                {
                    setBackground(new Color(255,255,255));
                } 
                else 
                {
                    setBackground(new Color(9,166,254));
                }
            }
        });
    }

    private boolean over;
    private Color color;
    private Color colorOver;
    private Color colorClick;
    private Color borderColor;
    private int radius = 0;

    @Override
    protected void paintComponent(Graphics grphcs) {
        Graphics2D g2 = (Graphics2D) grphcs;
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        //  Paint Border
        g2.setColor(borderColor);
        g2.fillRoundRect(0, 0, getWidth(), getHeight(), radius, radius);
        g2.setColor(getBackground());
        //  Border set 2 Pix
        g2.fillRoundRect(2, 2, getWidth() - 4, getHeight() - 4, radius, radius);
        super.paintComponent(grphcs);
    }
}