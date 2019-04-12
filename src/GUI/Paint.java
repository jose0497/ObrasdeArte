/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import Domain.Oval;
import Domain.Square;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Polygon;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author jose0
 */
public class Paint extends JPanel {

    Square square;
    Oval ovalMountain1;
    Oval ovalMountain2;
    Oval ovalSun;
    Oval ovalTree;
    Oval arm1;
    Oval arm2;
    Oval head;
    Oval leg1;
    Oval leg2;
    Oval trunk;

    //Constructor
    public Paint() {

        this.setPreferredSize(new Dimension(800, 400));
        this.square = new Square(0, 0, 850, 650);
        this.ovalMountain1 = new Oval(-10, 350, 600, 200);
        this.ovalMountain2 = new Oval(300, 320, 700, 400);
        this.ovalSun = new Oval(200, 0, 500, 600);
        this.ovalTree = new Oval(400, 10, 400, 100000);
        this.head = new Oval(197, 273, 15, 30);
        this.arm1 = new Oval(188, 303, 8, 35);
        this.arm2 = new Oval(214, 303, 8, 35);
        this.leg1 = new Oval(195, 325, 10, 50);
        this.leg2 = new Oval(205, 325, 10, 50);
        this.trunk = new Oval(196, 300, 18, 35);
    }

    //Será el método encargado de realizar el pintado en pantalla
    private void draw(Graphics g) {
        //Primitivas haciendo uso de Graphics
        //g.drawLine(20, 20, 120, 20);
        g.setColor(Color.red);
        g.fillRect(this.square.getX(), this.square.getY(), this.square.getHeight(), this.square.getWeight());
        g.setColor(Color.YELLOW);
        g.fillOval(this.ovalSun.getX(), this.ovalSun.getY(), this.ovalSun.getHeight(), this.ovalSun.getWeight());
        g.setColor(Color.BLACK);
        g.fillOval(this.ovalMountain1.getX(), this.ovalMountain1.getY(), this.ovalMountain1.getHeight(), this.ovalMountain1.getWeight());
        g.fillOval(this.ovalMountain2.getX(), this.ovalMountain2.getY(), this.ovalMountain2.getHeight(), this.ovalMountain2.getWeight());
        g.fillOval(this.ovalTree.getX(), this.ovalTree.getY(), this.ovalTree.getHeight(), this.ovalTree.getWeight());
        g.fillOval(this.head.getX(), this.head.getY(), this.head.getHeight(), this.head.getWeight());
        g.fillOval(this.arm1.getX(), this.arm1.getY(), this.arm1.getHeight(), this.arm1.getWeight());
        g.fillOval(this.arm2.getX(), this.arm2.getY(), this.arm2.getHeight(), this.arm2.getWeight());
        g.fillOval(this.leg1.getX(), this.leg1.getY(), this.leg1.getHeight(), this.leg1.getWeight());
        g.fillOval(this.leg2.getX(), this.leg2.getY(), this.leg2.getHeight(), this.leg2.getWeight());
        g.fillOval(this.trunk.getX(), this.trunk.getY(), this.trunk.getHeight(), this.trunk.getWeight());
       
        Polygon poligono1 = new Polygon();
        poligono1.addPoint(600, 50);
        poligono1.addPoint(580, 30);
        poligono1.addPoint(450, 40);
        poligono1.addPoint(500, 60);        
        g.fillPolygon(poligono1);
        
        Polygon poligono2 = new Polygon();
        poligono2.addPoint(600, 60);
        poligono2.addPoint(700, 50);
        poligono2.addPoint(750, 70);
        poligono2.addPoint(630, 75);        
        g.fillPolygon(poligono2);

        Polygon poligono4 = new Polygon();
        poligono4.addPoint(100, 155);
        poligono4.addPoint(85, 140);
        poligono4.addPoint(80, 135);
        poligono4.addPoint(100, 160); 
        poligono4.addPoint(120, 165); 
        poligono4.addPoint(135, 170);
        g.fillPolygon(poligono4);
        
        Polygon poligono5 = new Polygon();
        poligono5.addPoint(80, 115);
        poligono5.addPoint(65, 100);
        poligono5.addPoint(60, 95);
        poligono5.addPoint(80, 120); 
        poligono5.addPoint(100, 125); 
        poligono5.addPoint(115, 130);
        g.fillPolygon(poligono5);         
        
    }

    //Es necesario sobreescribir el metodo paintComponent para poder pintar
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        draw(g);
    }

    public static void main(String[] args) {
        JFrame ventana = new JFrame("Obra de arte 3");
        ventana.setContentPane(new Paint());
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ventana.pack();

        ventana.setResizable(false);
        ventana.setLocation(150, 100);
        ventana.setVisible(true);
    }

}
