package recursividad;

import java.awt.EventQueue;
import java.awt.Insets;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class recursividad06 extends JFrame {
    private static final long serialVersionUID = 1L;
    JTextField txtNumero, txtFactorial;

    public static void main(String[] args) {
        EventQueue.invokeLater(() -> {
            try {
                recursividad06 frame = new recursividad06();
                frame.setVisible(true);
            } catch (Exception e) {
                e.printStackTrace();
            }
        });
    }

    public recursividad06() {
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

        JLabel lblFactorial = new JLabel("Factorial:");
        lblFactorial.setBounds(50, 80, 150, 30);
        getContentPane().add(lblFactorial);

        txtFactorial = new JTextField();
        txtFactorial.setBounds(220, 80, 100, 30);
        txtFactorial.setFocusable(false);
        txtFactorial.setHorizontalAlignment(SwingConstants.RIGHT);
        txtFactorial.setMargin(new Insets(5, 5, 5, 5));
        getContentPane().add(txtFactorial);

        JButton btnCalcular = new JButton("Calcular");
        btnCalcular.setBounds(150, 130, 100, 30);
        getContentPane().add(btnCalcular);

        btnCalcular.addActionListener(e -> btnCalcular_actionPerformed());
    }

    protected void btnCalcular_actionPerformed() {
        int numero = Integer.parseInt(txtNumero.getText());
        txtFactorial.setText(String.valueOf(factorial(numero)));
    }

    private int factorial(int n) {
        if (n == 0) return 1;
        return n * factorial(n - 1);
    }
}