/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import java.awt.Color;
import java.awt.Graphics;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.BorderFactory;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollBar;
import javax.swing.JScrollPane;

/**
 *
 * @author brend
 */
public class PaintPollock extends javax.swing.JFrame {

    private int numberLines;

    public PaintPollock() {
        initComponents();
        this.setTitle("Arte Pollock");
        linesArt lArt = new linesArt();
        JScrollPane scrollPane = new JScrollPane(lArt);
        scrollPane.setBounds(100, 85, 600, 450);

        this.add(scrollPane);

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jtfNumberLines = new javax.swing.JTextField();
        jbtnNumberLines = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jbtnNumberLines.setText("Numero de lineas");
        jbtnNumberLines.setActionCommand("jbtnNumberLine");
        jbtnNumberLines.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnNumberLinesActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jbtnNumberLines)
                    .addComponent(jtfNumberLines, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(259, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jtfNumberLines, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jbtnNumberLines)
                .addContainerGap(226, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbtnNumberLinesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnNumberLinesActionPerformed
        Pattern patLetters = Pattern.compile("[aA-zZ]");
        Matcher matLetters = patLetters.matcher(jtfNumberLines.getText());
        if(!jtfNumberLines.getText().equalsIgnoreCase("") && !matLetters.find()){
        numberLines = Integer.parseInt(jtfNumberLines.getText());
        jtfNumberLines.setText("");
        repaint();
        }else{
            JOptionPane.showMessageDialog(null, "Ingrese un numero de lineas");
        }

    }//GEN-LAST:event_jbtnNumberLinesActionPerformed

    public class linesArt extends JPanel {

        public linesArt() {
            this.setBounds(100, 85, 600, 450);
            this.setVisible(true);

        }

        private void draw(Graphics g) {
            for (int i = 0; i < numberLines; i++) {
                int option = (int) (Math.random() * 11);
                int x0 = (int) (Math.random() * 601);
                int y0 = (int) (Math.random() * 451);
                int x1 = (int) (Math.random() * 601);
                int y1 = (int) (Math.random() * 451);
                switch (option) {
                    case 0:
                        g.setColor(Color.red);
                        break;
                    case 1:
                        g.setColor(Color.yellow);
                        break;
                    case 2:
                        g.setColor(Color.black);
                        break;
                    case 3:
                        g.setColor(Color.blue);
                        break;
                    case 4:
                        g.setColor(Color.yellow);
                        break;
                    case 5:
                        g.setColor(Color.cyan);
                        break;
                    case 6:
                        g.setColor(Color.green);
                        break;
                    case 7:
                        g.setColor(Color.magenta);
                        break;
                    case 8:
                        g.setColor(Color.orange);
                        break;
                    case 9:
                        g.setColor(Color.pink);
                        break;
                    case 10:
                        int R = (int) (Math.random() * 256);
                        int G = (int) (Math.random() * 256);
                        int B = (int) (Math.random() * 256);
                        Color color = new Color(R, G, B);
                        g.setColor(color);
                        break;
                    default:
                        break;
                }
                g.drawLine(x0, y0, x1, y1);
            }
        }

        @Override
        protected void paintComponent(Graphics g) {
            super.paintComponent(g);
            draw(g);
            

        }

    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jbtnNumberLines;
    private javax.swing.JTextField jtfNumberLines;
    // End of variables declaration//GEN-END:variables
}
