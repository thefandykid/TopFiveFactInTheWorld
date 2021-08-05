/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PAGE8;


import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JPanel;

/**
 *
 * @author LenovoID
 */
public class X6Panel extends JPanel{
    
    ImageIcon sweden, norway, finland, canada, unitedstates;
    Image sweden_1, norway_1, finland_1, canada_1, unitedstates_1;
    
    public X6Panel(){
        
        sweden = new ImageIcon(X6Panel.class.getResource("sweden1.png"));
        sweden_1 = sweden.getImage();
        
        norway = new ImageIcon(X6Panel.class.getResource("norway2.png"));
        norway_1 = norway.getImage();
        
        finland = new ImageIcon(X6Panel.class.getResource("finland3.png"));
        finland_1 = finland.getImage();
        
        canada = new ImageIcon(X6Panel.class.getResource("canada4.png"));
        canada_1 = canada.getImage();
        
        unitedstates = new ImageIcon(X6Panel.class.getResource("unitedstates5.png"));
        unitedstates_1 = unitedstates.getImage();
        
        this.setBounds(0, 0, 600, 550);
        
    }
   
    public void paintComponent(Graphics g) {
        //paint component dengan default method
        super.paintComponent(g);
        
        Graphics2D Judul = (Graphics2D) g;
        Font judul = new Font("Arial", Font.PLAIN, 18);
        Judul.setFont(judul);
        Judul.drawString("NEGARA DENGAN PULAU TERBANYAK DI DUNIA", 80, 20);
        
        Graphics2D No1 = (Graphics2D) g;
        Font tulisan1 = new Font("Arial", Font.PLAIN, 14);
        No1.setFont(tulisan1);
        No1.drawString("1. ", 10, 105);
        
        Graphics2D No1a = (Graphics2D) g;
        Font tulisan1a = new Font("Arial", Font.BOLD, 18);
        No1a.setFont(tulisan1a);
        No1a.drawString("SWEDIA", 120, 80);
        
        Graphics2D No1b = (Graphics2D) g;
        Font tulisan1b = new Font("Arial", Font.PLAIN, 14);
        No1b.setFont(tulisan1b);
        No1b.drawString("Memiliki pulau sebanyak 267.570 pulau.", 120, 105);
        
        Graphics2D K6Swedia = (Graphics2D) g;
        K6Swedia.drawImage(sweden_1, 30, 30, 80, 80, null);
        
        Graphics2D No2 = (Graphics2D) g;
        Font tulisan2 = new Font("Arial", Font.PLAIN, 14);
        No2.setFont(tulisan2);
        No2.drawString("2. ", 10, 200);
        
        Graphics2D No2a = (Graphics2D) g;
        Font tulisan2a = new Font("Arial", Font.BOLD, 18);
        No2a.setFont(tulisan2a);
        No2a.drawString("NORWEGIA", 120, 175);
        
        Graphics2D No2b = (Graphics2D) g;
        Font tulisan2b = new Font("Arial", Font.PLAIN, 14);
        No2b.setFont(tulisan2b);
        No2b.drawString("Memiliki pulau sebanyak 239.057 pulau.", 120, 200);
        
        Graphics2D K6Norway = (Graphics2D) g;
        K6Norway.drawImage(norway_1, 30, 125, 80, 80, null);
        
        Graphics2D No3 = (Graphics2D) g;
        Font tulisan3 = new Font("Arial", Font.PLAIN, 14);
        No3.setFont(tulisan3);
        No3.drawString("3. ", 10, 295);
        
        Graphics2D No3a = (Graphics2D) g;
        Font tulisan3a = new Font("Arial", Font.BOLD, 18);
        No3a.setFont(tulisan3a);
        No3a.drawString("FINLANDIA", 120, 270);
        
        Graphics2D No3b = (Graphics2D) g;
        Font tulisan3b = new Font("Arial", Font.PLAIN, 14);
        No3b.setFont(tulisan3b);
        No3b.drawString("Memiliki pulau sebanyak 178.947 pulau.", 120, 295);
        
        Graphics2D K6Finland = (Graphics2D) g;
        K6Finland.drawImage(finland_1, 30, 220, 80, 80, null);
        
        Graphics2D No4 = (Graphics2D) g;
        Font tulisan4 = new Font("Arial", Font.PLAIN, 14);
        No4.setFont(tulisan4);
        No4.drawString("4. ", 10, 390);
        
        Graphics2D No4a = (Graphics2D) g;
        Font tulisan4a = new Font("Arial", Font.BOLD, 18);
        No4a.setFont(tulisan4a);
        No4a.drawString("KANADA", 120, 365);
        
        Graphics2D No4b = (Graphics2D) g;
        Font tulisan4b = new Font("Arial", Font.PLAIN, 14);
        No4b.setFont(tulisan4b);
        No4b.drawString("Memiliki pulau sebanyak 52.455 pulau.", 120, 390);
        
        Graphics2D K6Kanada = (Graphics2D) g;
        K6Kanada.drawImage(canada_1, 30, 315, 80, 80, null);
        
        Graphics2D No5 = (Graphics2D) g;
        Font tulisan5 = new Font("Arial", Font.PLAIN, 14);
        No5.setFont(tulisan5);
        No5.drawString("5. ", 10, 485);
        
        Graphics2D No5a = (Graphics2D) g;
        Font tulisan5a = new Font("Arial", Font.BOLD, 18);
        No5a.setFont(tulisan5a);
        No5a.drawString("UNITED STATES", 120, 460);
        
        Graphics2D No5b = (Graphics2D) g;
        Font tulisan5b = new Font("Arial", Font.PLAIN, 14);
        No5b.setFont(tulisan5b);
        No5b.drawString("Memiliki pulau sebanyak 18.617 pulau.", 120, 485);
        
        Graphics2D K6US = (Graphics2D) g;
        K6US.drawImage(unitedstates_1, 30, 410, 80, 80, null);
            
    }
}
