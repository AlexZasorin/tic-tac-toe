package views.components;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;

public class BoardPanel extends JPanel
{
    private static final int GRID_THICKNESS = 4;

    public BoardPanel()
    {
        addComponentListener(new ComponentAdapter()
        {
            @Override
            public void componentResized(ComponentEvent e)
            {
                super.componentResized(e);
                repaint();
            }
        });
    }

    @Override
    public void paintComponent(Graphics g)
    {
        super.paintComponent(g);

        Graphics2D g2 = (Graphics2D) g;

        g2.setStroke(new BasicStroke(GRID_THICKNESS));

        Dimension curSize = getSize();

        int squareWidth = (curSize.width/3);
        int squareHeight = (curSize.height/3);

        // Horizontal Lines
        g2.drawLine(0, squareHeight, curSize.width, squareHeight);
        g2.drawLine(0, 2 * squareHeight, curSize.width, 2 * squareHeight);

        g2.drawLine(squareWidth, 0, squareWidth, curSize.height);
        g2.drawLine(2 * squareWidth, 0, 2 * squareWidth, curSize.height);
    }
}
