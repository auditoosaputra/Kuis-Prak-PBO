package kuis141;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import static javax.swing.WindowConstants.EXIT_ON_CLOSE;

public class Kuis141 extends JFrame implements ActionListener{
    
    JLabel lmenu;
    JPanel nullPanel;
    
    JButton kbut, pbut;
    
    public Kuis141(){
        lmenu = new JLabel ("Aplikasi Penilaian Lomba Karya Tulis dan Cipta Puisi");
        lmenu.setHorizontalAlignment(JLabel.CENTER);
        lmenu.setPreferredSize(new Dimension(50,150));
        
        kbut = new JButton("Karya Tulis");
        kbut.setBounds(80,10,100,30);
        pbut = new JButton("Cipta Puisi");
        pbut.setBounds(190,10,100,30);
        
        nullPanel = new JPanel();
        nullPanel.setLayout(null);
        nullPanel.add(kbut);
        nullPanel.add(pbut);
        nullPanel.setPreferredSize(new Dimension(100,500));
        
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
        setResizable(false);
        setSize(370,370);
        setLocationRelativeTo(null);
        
        add(lmenu,"North");
        add(nullPanel,"Center");
        
        kbut.addActionListener(this);
        pbut.addActionListener(this);
        
    }
    
    public static void main(String[] args) {
        Kuis141 kuis = new Kuis141();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == kbut){
            this.dispose();
            GUIKarya gui = new GUIKarya();
        }
        if(e.getSource() == pbut){
            this.dispose();
            GUIPuisi guo = new GUIPuisi();
        }
    }
    
}
