package l15;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

/**
 * Malli graafinen liittymä
 * @author Esa Kesti
 * @version 8 Sep 2020
 */
public class FrameMalli extends JFrame {

    private JPanel contentPane;
    private final JButton nappula = new JButton("Kissa");
    private final JLabel labelTeksti = new JLabel("");
    private final JButton btnNewButton = new JButton("Koira");

    /**
     * Launch the application.
     * @param args 
     */
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    FrameMalli frame = new FrameMalli();
                    frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    /**
     * Create the frame.
     */
    public FrameMalli() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 450, 300);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setLayout(null);
        nappula.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                labelTeksti.setText("Kissa");
            }
        });
        nappula.setBounds(22, 26, 89, 23);
        
        contentPane.add(nappula);
        labelTeksti.setBounds(230, 30, 69, 19);
        
        contentPane.add(labelTeksti);
        btnNewButton.setBounds(22, 89, 89, 23);
        
        contentPane.add(btnNewButton);
    }
}
