package recursividad;

import java.awt.EventQueue;
import java.awt.Insets;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class recursividad extends JFrame {
    private static final long serialVersionUID = 1L;
    JTextField txtNumero, txtSecuencia;

    public static void main(String[] args) {
        EventQueue.invokeLater(() -> {
            try {
                recursividad frame = new recursividad();
                frame.setVisible(true);
            } catch (Exception e) {
                e.printStackTrace();
            }
        });
    }

    public recursividad() {
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

        JLabel lblSecuencia = new JLabel("Secuencia de Collatz:");
        lblSecuencia.setBounds(50, 80, 150, 30);
        getContentPane().add(lblSecuencia);

        txtSecuencia = new JTextField();
        txtSecuencia.setBounds(50, 120, 300, 30);
        txtSecuencia.setFocusable(false);
        txtSecuencia.setHorizontalAlignment(SwingConstants.LEFT);
        txtSecuencia.setMargin(new Insets(5, 5, 5, 5));
        getContentPane().add(txtSecuencia);

        JButton btnCalcular = new JButton("Calcular");
        btnCalcular.setBounds(150, 200, 100, 30);
        getContentPane().add(btnCalcular);

        btnCalcular.addActionListener(e -> btnCalcular_actionPerformed());
    }

    protected void btnCalcular_actionPerformed() {
        int numero = Integer.parseInt(txtNumero.getText());
        txtSecuencia.setText(collatzSequence(numero));
    }

    private String collatzSequence(int n) {
        StringBuilder sequence = new StringBuilder();
        while (n != 1) {
            sequence.append(n).append(" ");
            if (n % 2 == 0) {
                n /= 2;
            } else {
                n = 3 * n + 1;
            }
        }
        sequence.append(n);  
        return sequence.toString();
    }
}