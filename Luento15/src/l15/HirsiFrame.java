package l15;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.*;
import javax.swing.border.EmptyBorder;


/**
 * Graafinen versio hirsipuusta
 * @author Esa Kesti
 * @version 8 Sep 2020
 */
public class HirsiFrame extends JFrame {

    private JPanel contentPane;
    private final JLabel labelKirjaimia = new JLabel("Sanassa on 5 kirjainta");
    private final JLabel labelAnnaKirjain = new JLabel("Anna ensimm\u00E4inen kirjain");
    private final JTextField textFieldAnnaKirjain = new JTextField();

    /**
     * Launch the application.
     * @param args ei käytössä
     */
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    HirsiFrame frame = new HirsiFrame();
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
    public HirsiFrame() {
        textFieldAnnaKirjain.setColumns(10);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 680, 492);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setLayout(new FormLayout(new ColumnSpec[] {
                FormSpecs.RELATED_GAP_COLSPEC,
                FormSpecs.DEFAULT_COLSPEC,
                FormSpecs.RELATED_GAP_COLSPEC,
                FormSpecs.DEFAULT_COLSPEC,
                FormSpecs.RELATED_GAP_COLSPEC,
                FormSpecs.DEFAULT_COLSPEC,
                FormSpecs.RELATED_GAP_COLSPEC,
                ColumnSpec.decode("default:grow"),},
            new RowSpec[] {
                FormSpecs.RELATED_GAP_ROWSPEC,
                FormSpecs.DEFAULT_ROWSPEC,
                FormSpecs.RELATED_GAP_ROWSPEC,
                FormSpecs.DEFAULT_ROWSPEC,
                FormSpecs.RELATED_GAP_ROWSPEC,
                FormSpecs.DEFAULT_ROWSPEC,}));
        
        contentPane.add(labelKirjaimia, "4, 2");
        
        contentPane.add(labelAnnaKirjain, "4, 4");
        
        contentPane.add(textFieldAnnaKirjain, "8, 4, fill, default");
    }

}
