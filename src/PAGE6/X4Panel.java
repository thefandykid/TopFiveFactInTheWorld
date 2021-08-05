/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PAGE6;


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
public class X4Panel extends JPanel{
    
    ImageIcon vatikan, monaco, nauru, tuvalu, sanmarino;
    Image vatikan_1, monaco_1, nauru_1, tuvalu_1, sanmarino_1;
    
    public X4Panel(){
        
        vatikan = new ImageIcon(X4Panel.class.getResource("vatican-city1.png"));
        vatikan_1 = vatikan.getImage();
        
        monaco = new ImageIcon(X4Panel.class.getResource("monaco2.png"));
        monaco_1 = monaco.getImage();
        
        nauru = new ImageIcon(X4Panel.class.getResource("nauru3.png"));
        nauru_1 = nauru.getImage();
        
        tuvalu = new ImageIcon(X4Panel.class.getResource("tuvalu4.png"));
        tuvalu_1 = tuvalu.getImage();
        
        sanmarino = new ImageIcon(X4Panel.class.getResource("san-marino5.png"));
        sanmarino_1 = sanmarino.getImage();
        
        this.setBounds(0, 0, 600, 550);
        
    }
   
    public void paintComponent(Graphics g) {
        //paint component dengan default method
        super.paintComponent(g);
        
        Graphics2D Judul = (Graphics2D) g;
        Font judul = new Font("Arial", Font.PLAIN, 18);
        Judul.setFont(judul);
        Judul.drawString("NEGARA DENGAN WILAYAH TERKECIL DI DUNIA", 80, 20);
        
        Graphics2D No1 = (Graphics2D) g;
        Font tulisan1 = new Font("Arial", Font.PLAIN, 14);
        No1.setFont(tulisan1);
        No1.drawString("1. ", 10, 105);
        
        Graphics2D No1a = (Graphics2D) g;
        Font tulisan1a = new Font("Arial", Font.BOLD, 18);
        No1a.setFont(tulisan1a);
        No1a.drawString("VATIKAN", 120, 80);
        
        Graphics2D No1b = (Graphics2D) g;
        Font tulisan1b = new Font("Arial", Font.PLAIN, 14);
        No1b.setFont(tulisan1b);
        No1b.drawString("Luas wilayahnya hanya 0,44 kilometer persegi.", 120, 105);
        
        Graphics2D K4Vatikan = (Graphics2D) g;
        K4Vatikan.drawImage(vatikan_1, 30, 30, 80, 80, null);
        
        Graphics2D No2 = (Graphics2D) g;
        Font tulisan2 = new Font("Arial", Font.PLAIN, 14);
        No2.setFont(tulisan2);
        No2.drawString("2. ", 10, 200);
        
        Graphics2D No2a = (Graphics2D) g;
        Font tulisan2a = new Font("Arial", Font.BOLD, 18);
        No2a.setFont(tulisan2a);
        No2a.drawString("MONACO", 120, 175);
        
        Graphics2D No2b = (Graphics2D) g;
        Font tulisan2b = new Font("Arial", Font.PLAIN, 14);
        No2b.setFont(tulisan2b);
        No2b.drawString("Luas wilayahnya hanya 2 kilometer persegi.", 120, 200);
        
        Graphics2D K4Monaco = (Graphics2D) g;
        K4Monaco.drawImage(monaco_1, 30, 125, 80, 80, null);
        
        Graphics2D No3 = (Graphics2D) g;
        Font tulisan3 = new Font("Arial", Font.PLAIN, 14);
        No3.setFont(tulisan3);
        No3.drawString("3. ", 10, 295);
        
        Graphics2D No3a = (Graphics2D) g;
        Font tulisan3a = new Font("Arial", Font.BOLD, 18);
        No3a.setFont(tulisan3a);
        No3a.drawString("NAURU", 120, 270);
        
        Graphics2D No3b = (Graphics2D) g;
        Font tulisan3b = new Font("Arial", Font.PLAIN, 14);
        No3b.setFont(tulisan3b);
        No3b.drawString("Luas wilayahnya hanya 21 kilometer persegi.", 120, 295);
        
        Graphics2D K4Nauru = (Graphics2D) g;
        K4Nauru.drawImage(nauru_1, 30, 220, 80, 80, null);
        
        Graphics2D No4 = (Graphics2D) g;
        Font tulisan4 = new Font("Arial", Font.PLAIN, 14);
        No4.setFont(tulisan4);
        No4.drawString("4. ", 10, 390);
        
        Graphics2D No4a = (Graphics2D) g;
        Font tulisan4a = new Font("Arial", Font.BOLD, 18);
        No4a.setFont(tulisan4a);
        No4a.drawString("TUVALU", 120, 365);
        
        Graphics2D No4b = (Graphics2D) g;
        Font tulisan4b = new Font("Arial", Font.PLAIN, 14);
        No4b.setFont(tulisan4b);
        No4b.drawString("Luas wilayahnya hanya 26 kilometer persegi.", 120, 390);
        
        Graphics2D K4Tuvalu = (Graphics2D) g;
        K4Tuvalu.drawImage(tuvalu_1, 30, 315, 80, 80, null);
        
        Graphics2D No5 = (Graphics2D) g;
        Font tulisan5 = new Font("Arial", Font.PLAIN, 14);
        No5.setFont(tulisan5);
        No5.drawString("5. ", 10, 485);
        
        Graphics2D No5a = (Graphics2D) g;
        Font tulisan5a = new Font("Arial", Font.BOLD, 18);
        No5a.setFont(tulisan5a);
        No5a.drawString("SAN MARINO", 120, 460);
        
        Graphics2D No5b = (Graphics2D) g;
        Font tulisan5b = new Font("Arial", Font.PLAIN, 14);
        No5b.setFont(tulisan5b);
        No5b.drawString("Luas wilayahnya hanya 61,2 kilometer persegi.", 120, 485);
        
        Graphics2D K4SanMarino = (Graphics2D) g;
        K4SanMarino.drawImage(sanmarino_1, 30, 410, 80, 80, null);
            
    }
}
