package secuenciales;

import java.awt.EventQueue;
import java.awt.Insets;
import java.text.DecimalFormat;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class frm05 extends JFrame {
    private static final long serialVersionUID = 1L;
    JTextField txtgiga, txtmegabytes, txtkilobytes, txtbytes;

    public static void main(String[] args) {
        EventQueue.invokeLater(() -> {
            try {
                frm05 frame = new frm05();
                frame.setVisible(true);
            } catch (Exception e) {
                e.printStackTrace();
            }
        });
    }

    public frm05() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(0, 0, 300, 250);
        setLayout(null);
        setLocationRelativeTo(null);
        
        JLabel lblgiga = new JLabel("Gigabytes:");
        lblgiga.setBounds(50, 50, 80, 30);
        getContentPane().add(lblgiga);

        JLabel lblmegabytes = new JLabel("Megabytes:");
        lblmegabytes.setBounds(50, 90, 80, 30);
        getContentPane().add(lblmegabytes);

        JLabel lblkilobytes = new JLabel("Kilobytes:");
        lblkilobytes.setBounds(50, 130, 80, 30);
        getContentPane().add(lblkilobytes);
        
        JLabel lblbytes = new JLabel("Bytes");
        lblbytes.setBounds(50, 170, 80, 30);
        getContentPane().add(lblbytes);

        txtgiga = new JTextField();
        txtgiga.setBounds(150, 50, 80, 30);
        txtgiga.setHorizontalAlignment(SwingConstants.RIGHT);
        txtgiga.setMargin(new Insets(5, 5, 5, 5));
        getContentPane().add(txtgiga);

        txtmegabytes = new JTextField();
        txtmegabytes.setBounds(150, 90, 80, 30);
        txtmegabytes.setFocusable(false);
        txtmegabytes.setHorizontalAlignment(SwingConstants.RIGHT);
        txtmegabytes.setMargin(new Insets(5, 5, 5, 5));
        getContentPane().add(txtmegabytes);

        txtkilobytes = new JTextField();
        txtkilobytes.setBounds(150, 130, 80, 30);
        txtkilobytes.setFocusable(false);
        txtkilobytes.setHorizontalAlignment(SwingConstants.RIGHT);
        txtkilobytes.setMargin(new Insets(5, 5, 5, 5));
        getContentPane().add(txtkilobytes);
        
        txtbytes = new JTextField();
        txtbytes.setBounds(150, 170, 80, 30);
        txtbytes.setFocusable(false);
        txtbytes.setHorizontalAlignment(SwingConstants.RIGHT);
        txtbytes.setMargin(new Insets(5, 5, 5, 5));
        getContentPane().add(txtbytes);

        JButton btnCalcular = new JButton("Calcular");
        btnCalcular.setBounds(100, 220, 80, 30);
        getContentPane().add(btnCalcular);

        btnCalcular.addActionListener(e -> btnCalcular_actionPerformer());
    }

    protected void btnCalcular_actionPerformer() {
    	int giga = Integer.parseInt(txtgiga.getText());
    	
    	double megabytes = giga * 1024;
    	double kilobytes = megabytes * 1024;
    	double bytes = kilobytes * 1024;
    	
    	DecimalFormat df = new DecimalFormat("##.00");
    	txtmegabytes.setText(df.format(megabytes));
    	txtkilobytes.setText(df.format(kilobytes));
    	txtbytes.setText(df.format(bytes));
    
    }
}