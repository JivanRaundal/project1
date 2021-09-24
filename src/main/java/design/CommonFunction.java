package design;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

public class CommonFunction
{
    public static void addLabelBackground(JLabel lbl,String path)
    {
        BufferedImage img=null;
        try
        {
            img=ImageIO.read(new File(path));
            Image newimg=img.getScaledInstance(lbl.getWidth(), lbl.getHeight(), Image.SCALE_SMOOTH);
            ImageIcon icon=new ImageIcon(newimg);
            lbl.setIcon(icon);
        } catch (Exception e)
        {
            System.out.println("Exception caught");
        }
    }
}
