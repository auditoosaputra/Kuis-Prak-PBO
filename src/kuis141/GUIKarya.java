package kuis141;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import static javax.swing.WindowConstants.EXIT_ON_CLOSE;

public class GUIKarya extends JFrame implements ActionListener{
    JLabel title, fb, ln, lj, lN, fp, lt, le, ls, lk;
    JTextField tn, tj, tN, tt, te, ts, tk;
    JButton save, back;
    
    public GUIKarya(){
        title = new JLabel("Penilaian Karya Tulis");
        fb = new JLabel("From Biodata");
        ln = new JLabel("Nama");
        lj = new JLabel("Jurusan");
        lN = new JLabel("NIM");
        fp = new JLabel("Form Penilaian (0-100)");
        lt = new JLabel("Tata Bahasa");
        le = new JLabel("EYD");
        ls = new JLabel("Struktur");
        lk = new JLabel("Kreativitas");
        
        title.setBounds(230,30,200,20);
        title.setPreferredSize(new Dimension(0,80));
        fb.setBounds(80,80,100,40);
        ln.setBounds(80,100,100,40);
        lj.setBounds(80,120,100,40);
        lN.setBounds(80,140,100,40);
        fp.setBounds(80,180,100,40);
        lt.setBounds(80,200,100,40);
        le.setBounds(80,220,100,40);
        ls.setBounds(80,240,100,40);
        lk.setBounds(80,260,100,40);
        
        tn = new JTextField();
        tj = new JTextField();
        tN = new JTextField();
        tt = new JTextField();
        te = new JTextField();
        ts = new JTextField();
        tk = new JTextField();
        
        tn.setBounds(200,110,240,25);
        tj.setBounds(200,130,240,25);
        tN.setBounds(200,150,240,25);
        tt.setBounds(200,210,240,25);
        te.setBounds(200,230,240,25);
        ts.setBounds(200,250,240,25);
        tk.setBounds(200,270,240,25);
        
        save = new JButton("Save");
        save.setBounds(185, 310, 100, 23);
        back = new JButton("Cancel");
        back.setBounds(295, 310, 100, 23);
        
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
        setResizable(false);
        setSize(570,380);
        setLocationRelativeTo(null);
        setLayout(null);
        
        add(title);
        add(fb);
        add(ln);
        add(lj);
        add(lN);
        add(fp);
        add(lt);
        add(le);
        add(ls);
        add(lk);
        add(tn);
        add(tj);
        add(tN);
        add(tt);
        add(te);
        add(ts);
        add(tk);
        add(save);
        add(back);
        
        save.addActionListener(this);
        back.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        if(ae.getSource() == save){
           try{
               String a = String.valueOf(tn.getText());
               String b = String.valueOf(tj.getText());
               int c = Integer.parseInt(tN.getText());
               Mahasiswa mhs = new Mahasiswa(a, b, c);
               
               double d = Double.parseDouble(tt.getText());
               double f = Double.parseDouble(te.getText());
               double g = Double.parseDouble(ts.getText());
               double h = Double.parseDouble(tk.getText());
               KTulis tul = new KTulis(d, f, g, h);
               
           } catch(Exception e){
               JOptionPane.showMessageDialog(null, "Input masih belum lengkap", "Error", JOptionPane.ERROR_MESSAGE);
               
           }
        }
        if(ae.getSource() == back){
            this.dispose();
            Kuis141 kuis = new Kuis141();
        }
        
    }
    
}
