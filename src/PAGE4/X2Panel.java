/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PAGE4;

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
public class X2Panel extends JPanel{
    
    ImageIcon china, india, unitedstates, indonesia, pakistan;
    Image china_1, india_1, unitedstates_1, indonesia_1, pakistan_1;
    
    public X2Panel(){
        
        china = new ImageIcon(X2Panel.class.getResource("china1.png"));
        china_1 = china.getImage();
        
        india = new ImageIcon(X2Panel.class.getResource("india2.png"));
        india_1 = india.getImage();
        
        unitedstates = new ImageIcon(X2Panel.class.getResource("unitedstates3.png"));
        unitedstates_1 = unitedstates.getImage();
        
        indonesia = new ImageIcon(X2Panel.class.getResource("indonesia4.png"));
        indonesia_1 = indonesia.getImage();
        
        pakistan = new ImageIcon(X2Panel.class.getResource("pakistan5.png"));
        pakistan_1 = pakistan.getImage();
        
        this.setBounds(0, 0, 650, 550);
        
    }
   
    public void paintComponent(Graphics g) {
        //paint component dengan default method
        super.paintComponent(g);
        
        Graphics2D Judul = (Graphics2D) g;
        Font judul = new Font("Arial", Font.PLAIN, 18);
        Judul.setFont(judul);
        Judul.drawString("NEGARA DENGAN PENDUDUK TERBANYAK DI DUNIA", 120, 20);
        
        Graphics2D No1 = (Graphics2D) g;
        Font tulisan1 = new Font("Arial", Font.PLAIN, 14);
        No1.setFont(tulisan1);
        No1.drawString("1. ", 10, 105);
        
        Graphics2D No1a = (Graphics2D) g;
        Font tulisan1a = new Font("Arial", Font.BOLD, 18);
        No1a.setFont(tulisan1a);
        No1a.drawString("CHINA", 120, 80);
        
        Graphics2D No1b = (Graphics2D) g;
        Font tulisan1b = new Font("Arial", Font.PLAIN, 14);
        No1b.setFont(tulisan1b);
        No1b.drawString("Berdasarkan Worldometers Penduduk China sebanyak 1.439.323.776 Jiwa", 120, 105);
        
        Graphics2D K2China = (Graphics2D) g;
        K2China.drawImage(china_1, 30, 30, 80, 80, null);
        
        Graphics2D No2 = (Graphics2D) g;
        Font tulisan2 = new Font("Arial", Font.PLAIN, 14);
        No2.setFont(tulisan2);
        No2.drawString("2. ", 10, 200);
        
        Graphics2D No2a = (Graphics2D) g;
        Font tulisan2a = new Font("Arial", Font.BOLD, 18);
        No2a.setFont(tulisan2a);
        No2a.drawString("INDIA", 120, 175);
        
        Graphics2D No2b = (Graphics2D) g;
        Font tulisan2b = new Font("Arial", Font.PLAIN, 14);
        No2b.setFont(tulisan2b);
        No2b.drawString("Berdasarkan Worldometers Penduduk India sebanyak 1.380.004.385 Jiwa", 120, 200);
        
        Graphics2D K2India = (Graphics2D) g;
        K2India.drawImage(india_1, 30, 125, 80, 80, null);
        
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
        No3b.drawString("Berdasarkan Worldometers Penduduk United States sebanyak 331.002.651 Jiwa", 120, 295);
        
        Graphics2D K2UnitedStates = (Graphics2D) g;
        K2UnitedStates.drawImage(unitedstates_1, 30, 220, 80, 80, null);
        
        Graphics2D No4 = (Graphics2D) g;
        Font tulisan4 = new Font("Arial", Font.PLAIN, 14);
        No4.setFont(tulisan4);
        No4.drawString("4. ", 10, 390);
        
        Graphics2D No4a = (Graphics2D) g;
        Font tulisan4a = new Font("Arial", Font.BOLD, 18);
        No4a.setFont(tulisan4a);
        No4a.drawString("INDONESIA", 120, 365);
        
        Graphics2D No4b = (Graphics2D) g;
        Font tulisan4b = new Font("Arial", Font.PLAIN, 14);
        No4b.setFont(tulisan4b);
        No4b.drawString("Berdasarkan Worldometers Penduduk Indonesia sebanyak 273.523.615 Jiwa", 120, 390);
        
        Graphics2D K2Indonesia = (Graphics2D) g;
        K2Indonesia.drawImage(indonesia_1, 30, 315, 80, 80, null);
        
        Graphics2D No5 = (Graphics2D) g;
        Font tulisan5 = new Font("Arial", Font.PLAIN, 14);
        No5.setFont(tulisan5);
        No5.drawString("5. ", 10, 485);
        
        Graphics2D No5a = (Graphics2D) g;
        Font tulisan5a = new Font("Arial", Font.BOLD, 18);
        No5a.setFont(tulisan5a);
        No5a.drawString("PAKISTAN", 120, 460);
        
        Graphics2D No5b = (Graphics2D) g;
        Font tulisan5b = new Font("Arial", Font.PLAIN, 14);
        No5b.setFont(tulisan5b);
        No5b.drawString("Berdasarkan Worldometers Penduduk Indonesia sebanyak 220.892.340 Jiwa", 120, 485);
        
        Graphics2D K2Pakistan = (Graphics2D) g;
        K2Pakistan.drawImage(pakistan_1, 30, 410, 80, 80, null);
            
    }
}
