package secuenciales;

import java.awt.EventQueue;
import java.awt.Insets;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class frm11 extends JFrame {
    private static final long serialVersionUID = 1L;
    JTextField txtNumero1, txtNumero2, txtResultado1, txtResultado2;

    public static void main(String[] args) {
        EventQueue.invokeLater(() -> {
            try {
                frm11 frame = new frm11();
                frame.setVisible(true);
            } catch (Exception e) {
                e.printStackTrace();
            }
        });
    }

    public frm11() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(0, 0, 400, 300);
        setLayout(null);
        setLocationRelativeTo(null);

        JLabel lblNumero1 = new JLabel("Número 1:");
        lblNumero1.setBounds(50, 50, 140, 30);
        getContentPane().add(lblNumero1);

        JLabel lblNumero2 = new JLabel("Número 2:");
        lblNumero2.setBounds(50, 90, 140, 30);
        getContentPane().add(lblNumero2);

        JLabel lblResultado1 = new JLabel("Resultado 1:");
        lblResultado1.setBounds(50, 150, 140, 30);
        getContentPane().add(lblResultado1);

        JLabel lblResultado2 = new JLabel("Resultado 2:");
        lblResultado2.setBounds(50, 190, 140, 30);
        getContentPane().add(lblResultado2);

        txtNumero1 = new JTextField();
        txtNumero1.setBounds(200, 50, 100, 30);
        txtNumero1.setHorizontalAlignment(SwingConstants.RIGHT);
        txtNumero1.setMargin(new Insets(5, 5, 5, 5));
        getContentPane().add(txtNumero1);

        txtNumero2 = new JTextField();
        txtNumero2.setBounds(200, 90, 100, 30);
        txtNumero2.setHorizontalAlignment(SwingConstants.RIGHT);
        txtNumero2.setMargin(new Insets(5, 5, 5, 5));
        getContentPane().add(txtNumero2);

        txtResultado1 = new JTextField();
        txtResultado1.setBounds(200, 150, 100, 30);
        txtResultado1.setFocusable(false);
        txtResultado1.setHorizontalAlignment(SwingConstants.RIGHT);
        txtResultado1.setMargin(new Insets(5, 5, 5, 5));
        getContentPane().add(txtResultado1);

        txtResultado2 = new JTextField();
        txtResultado2.setBounds(200, 190, 100, 30);
        txtResultado2.setFocusable(false);
        txtResultado2.setHorizontalAlignment(SwingConstants.RIGHT);
        txtResultado2.setMargin(new Insets(5, 5, 5, 5));
        getContentPane().add(txtResultado2);

        JButton btnCalcular = new JButton("Calcular");
        btnCalcular.setBounds(140, 230, 100, 30);
        getContentPane().add(btnCalcular);

        btnCalcular.addActionListener(e -> btnCalcular_actionPerforme());
    }

    protected void btnCalcular_actionPerforme() {
        int numero1 = Integer.parseInt(txtNumero1.getText());
        int numero2 = Integer.parseInt(txtNumero2.getText());

        int centena1 = numero1 / 100;
        int decena1 = (numero1 / 10) % 10;
        int unidad1 = numero1 % 10;

        int centena2 = numero2 / 100;
        int decena2 = (numero2 / 10) % 10;
        int unidad2 = numero2 % 10;

        double resultado1 = centena2 * 100 + decena1 * 10 + unidad2;
        double resultado2 = centena1 * 100 + decena2 * 10 + unidad1;

        txtResultado1.setText(String.valueOf(resultado1));
        txtResultado2.setText(String.valueOf(resultado2));
    }
}