package recursividad;

import java.awt.EventQueue;
import java.awt.Insets;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class recursividad09 extends JFrame {
    private static final long serialVersionUID = 1L;
    JTextField txtNumero, txtInvertido;

    public static void main(String[] args) {
        EventQueue.invokeLater(() -> {
            try {
                recursividad09 frame = new recursividad09();
                frame.setVisible(true);
            } catch (Exception e) {
                e.printStackTrace();
            }
        });
    }

    public recursividad09() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(0, 0, 400, 300);
        setLayout(null);
        setLocationRelativeTo(null);

        JLabel lblNumero = new JLabel("Ingrese un número:");
        lblNumero.setBounds(50, 30, 150, 30);
        getContentPane().add(lblNumero);

        txtNumero = new JTextField();
        txtNumero.setBounds(220, 30, 100, 30);
        txtNumero.setHorizontalAlignment(SwingConstants.RIGHT);
        txtNumero.setMargin(new Insets(5, 5, 5, 5));
        getContentPane().add(txtNumero);

        JLabel lblInvertido = new JLabel("Número invertido:");
        lblInvertido.setBounds(50, 80, 150, 30);
        getContentPane().add(lblInvertido);

        txtInvertido = new JTextField();
        txtInvertido.setBounds(220, 80, 100, 30);
        txtInvertido.setFocusable(false);
        txtInvertido.setHorizontalAlignment(SwingConstants.LEFT);
        txtInvertido.setMargin(new Insets(5, 5, 5, 5));
        getContentPane().add(txtInvertido);

        JButton btnCalcular = new JButton("Invertir");
        btnCalcular.setBounds(150, 130, 100, 30);
        getContentPane().add(btnCalcular);

        btnCalcular.addActionListener(e -> btnCalcular_actionPerformed());
    }

    protected void btnCalcular_actionPerformed() {
        int numero = Integer.parseInt(txtNumero.getText());
        txtInvertido.setText(String.valueOf(reverseNumber(numero)));
    }

    private int reverseNumber(int n) {
        if (n < 10) return n;
        return (n % 10) * (int) Math.pow(10, String.valueOf(n).length() - 1) + reverseNumber(n / 10);
    }
}