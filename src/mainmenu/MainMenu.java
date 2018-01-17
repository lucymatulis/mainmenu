/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package mainmenu;
import java.awt.*;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.net.URL;
import javax.imageio.ImageIO;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.Timer;
import java.awt.Font;
/**
 *
 * @author lumat8093
 */
public class MainMenu {

    
   public static JLabel title = new JLabel();
   public static JLabel group = new JLabel();
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         MainMenuActions panel = new MainMenuActions();      
         JFrame application = new JFrame();
         panel.setLayout(null);
        
        panel.add(title);
        title.setVisible(true);
        title.setText("RELATIVE BOATION BITCHES");
        title.setBounds(235,5,200,200);
        
        panel.setBackground(Color.black);
        
        panel.add(group);
        group.setVisible(true);
        group.setText("BY LUCY AND THE BOYZ");
        group.setBounds(60,100,400,200);
        Font myFont = new Font("monospaced",Font.BOLD,20);
                group.setFont(myFont);
      
      application.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      application.add(panel);
      application.setSize(600, 400);      
      application.setVisible(true);
        
    }
    
}
