/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PAGE3;

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
public class X1Panel extends JPanel{
    
    ImageIcon russia, canada, unitedstates, china, brazil, baloon;
    Image russia_1, canada_1, unitedstates_1, china_1, brazil_1, baloon_1;
    
    
    public X1Panel(){
        
        russia = new ImageIcon(X1Panel.class.getResource("russia1.png"));
        russia_1 = russia.getImage();
        
        canada = new ImageIcon(X1Panel.class.getResource("canada2.png"));
        canada_1 = canada.getImage();
        
        unitedstates = new ImageIcon(X1Panel.class.getResource("unitedstates3.png"));
        unitedstates_1 = unitedstates.getImage();
        
        china = new ImageIcon(X1Panel.class.getResource("china4.png"));
        china_1 = china.getImage();
        
        brazil = new ImageIcon(X1Panel.class.getResource("brazil5.png"));
        brazil_1 = brazil.getImage();
        
        baloon = new ImageIcon(X1Panel.class.getResource("baloon.png"));
        baloon_1 = baloon.getImage();
        
        this.setBounds(0, 0, 600, 550);
        
    }
   
    public void paintComponent(Graphics g) {
        //paint component dengan default method
        super.paintComponent(g);
        
        Graphics2D Judul = (Graphics2D) g;
        Font judul = new Font("Arial", Font.PLAIN, 18);
        Judul.setFont(judul);
        Judul.drawString("NEGARA TERLUAS DI DUNIA", 170, 20);
        
        Graphics2D No1 = (Graphics2D) g;
        Font tulisan1 = new Font("Arial", Font.PLAIN, 14);
        No1.setFont(tulisan1);
        No1.drawString("1. ", 10, 105);
        
        Graphics2D No1a = (Graphics2D) g;
        Font tulisan1a = new Font("Arial", Font.BOLD, 18);
        No1a.setFont(tulisan1a);
        No1a.drawString("RUSIA", 120, 80);
        
        Graphics2D No1b = (Graphics2D) g;
        Font tulisan1b = new Font("Arial", Font.PLAIN, 14);
        No1b.setFont(tulisan1b);
        No1b.drawString("Memiliki total luas wilayah 17,1 juta kilometer persegi.", 120, 105);
        
        Graphics2D K1Russia = (Graphics2D) g;
        K1Russia.drawImage(russia_1, 30, 30, 80, 80, null);
        
        Graphics2D No2 = (Graphics2D) g;
        Font tulisan2 = new Font("Arial", Font.PLAIN, 14);
        No2.setFont(tulisan2);
        No2.drawString("2. ", 10, 200);
        
        Graphics2D No2a = (Graphics2D) g;
        Font tulisan2a = new Font("Arial", Font.BOLD, 18);
        No2a.setFont(tulisan2a);
        No2a.drawString("KANADA", 120, 175);
        
        Graphics2D No2b = (Graphics2D) g;
        Font tulisan2b = new Font("Arial", Font.PLAIN, 14);
        No2b.setFont(tulisan2b);
        No2b.drawString("Memiliki total luas wilayah 9,9 juta kilometer persegi.", 120, 200);
        
        Graphics2D K1Canada = (Graphics2D) g;
        K1Canada.drawImage(canada_1, 30, 125, 80, 80, null);
        
        Graphics2D No3 = (Graphics2D) g;
        Font tulisan3 = new Font("Arial", Font.PLAIN, 14);
        No3.setFont(tulisan3);
        No3.drawString("3. ", 10, 295);
        
        Graphics2D No3a = (Graphics2D) g;
        Font tulisan3a = new Font("Arial", Font.BOLD, 18);
        No3a.setFont(tulisan3a);
        No3a.drawString("UNITED STATES", 120, 270);
        
        Graphics2D No3b = (Graphics2D) g;
        Font tulisan3b = new Font("Arial", Font.PLAIN, 14);
        No3b.setFont(tulisan3b);
        No3b.drawString("Memiliki total luas wilayah 9,8 juta kilometer persegi.", 120, 295);
        
        Graphics2D K1UnitedStates = (Graphics2D) g;
        K1UnitedStates.drawImage(unitedstates_1, 30, 220, 80, 80, null);
        
        Graphics2D No4 = (Graphics2D) g;
        Font tulisan4 = new Font("Arial", Font.PLAIN, 14);
        No4.setFont(tulisan4);
        No4.drawString("4. ", 10, 390);
        
        Graphics2D No4a = (Graphics2D) g;
        Font tulisan4a = new Font("Arial", Font.BOLD, 18);
        No4a.setFont(tulisan4a);
        No4a.drawString("CHINA", 120, 365);
        
        Graphics2D No4b = (Graphics2D) g;
        Font tulisan4b = new Font("Arial", Font.PLAIN, 14);
        No4b.setFont(tulisan4b);
        No4b.drawString("Memiliki total luas wilayah 9,5 juta kilometer persegi.", 120, 390);
        
        Graphics2D K1China = (Graphics2D) g;
        K1China.drawImage(china_1, 30, 315, 80, 80, null);
        
        Graphics2D No5 = (Graphics2D) g;
        Font tulisan5 = new Font("Arial", Font.PLAIN, 14);
        No5.setFont(tulisan5);
        No5.drawString("5. ", 10, 485);
        
        Graphics2D No5a = (Graphics2D) g;
        Font tulisan5a = new Font("Arial", Font.BOLD, 18);
        No5a.setFont(tulisan5a);
        No5a.drawString("BRAZIL", 120, 460);
        
        Graphics2D No5b = (Graphics2D) g;
        Font tulisan5b = new Font("Arial", Font.PLAIN, 14);
        No5b.setFont(tulisan5b);
        No5b.drawString("Memiliki total luas wilayah 8,5 juta kilometer persegi.", 120, 485);
        
        Graphics2D K1Brazil = (Graphics2D) g;
        K1Brazil.drawImage(brazil_1, 30, 410, 80, 80, null);
        
        
            
    }
}
