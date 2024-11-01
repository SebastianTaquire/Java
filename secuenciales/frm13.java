package secuenciales;

import java.awt.EventQueue;
import java.awt.Insets;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class frm13 extends JFrame {
    private static final long serialVersionUID = 1L;
    JTextField txtCateto1, txtCateto2, txtHipotenusa;

    public static void main(String[] args) {
        EventQueue.invokeLater(() -> {
            try {
                frm13 frame = new frm13();
                frame.setVisible(true);
            } catch (Exception e) {
                e.printStackTrace();
            }
        });
    }

    public frm13() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(0, 0, 400, 250);
        setLayout(null);
        setLocationRelativeTo(null);

        JLabel lblCateto1 = new JLabel("Cateto 1:");
        lblCateto1.setBounds(50, 50, 100, 30);
        getContentPane().add(lblCateto1);

        JLabel lblCateto2 = new JLabel("Cateto 2:");
        lblCateto2.setBounds(50, 90, 100, 30);
        getContentPane().add(lblCateto2);

        JLabel lblHipotenusa = new JLabel("Hipotenusa:");
        lblHipotenusa.setBounds(50, 130, 100, 30);
        getContentPane().add(lblHipotenusa);

        txtCateto1 = new JTextField();
        txtCateto1.setBounds(160, 50, 100, 30);
        txtCateto1.setHorizontalAlignment(SwingConstants.RIGHT);
        txtCateto1.setMargin(new Insets(5, 5, 5, 5));
        getContentPane().add(txtCateto1);

        txtCateto2 = new JTextField();
        txtCateto2.setBounds(160, 90, 100, 30);
        txtCateto2.setHorizontalAlignment(SwingConstants.RIGHT);
        txtCateto2.setMargin(new Insets(5, 5, 5, 5));
        getContentPane().add(txtCateto2);

        txtHipotenusa = new JTextField();
        txtHipotenusa.setBounds(160, 130, 100, 30);
        txtHipotenusa.setFocusable(false);
        txtHipotenusa.setHorizontalAlignment(SwingConstants.RIGHT);
        txtHipotenusa.setMargin(new Insets(5, 5, 5, 5));
        getContentPane().add(txtHipotenusa);

        JButton btnCalcular = new JButton("Calcular");
        btnCalcular.setBounds(140, 180, 100, 30);
        getContentPane().add(btnCalcular);

        btnCalcular.addActionListener(e -> btnCalcular_actionPerforme());
    }

    protected void btnCalcular_actionPerforme() {
        int cateto1 = Integer.parseInt(txtCateto1.getText());
        int cateto2 = Integer.parseInt(txtCateto2.getText());

        double hipotenusa = Math.sqrt(Math.pow(cateto1, 2) + Math.pow(cateto2, 2));

        txtHipotenusa.setText(String.format("%.2f", hipotenusa));
    }
}