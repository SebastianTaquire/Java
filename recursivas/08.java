package recursividad;

import java.awt.EventQueue;
import java.awt.Insets;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class recursividad08 extends JFrame {
    private static final long serialVersionUID = 1L;
    JTextField txtN, txtFibonacci;

    public static void main(String[] args) {
        EventQueue.invokeLater(() -> {
            try {
                recursividad08 frame = new recursividad08();
                frame.setVisible(true);
            } catch (Exception e) {
                e.printStackTrace();
            }
        });
    }

    public recursividad08() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(0, 0, 400, 300);
        setLayout(null);
        setLocationRelativeTo(null);

        JLabel lblN = new JLabel("Ingrese N:");
        lblN.setBounds(50, 30, 100, 30);
        getContentPane().add(lblN);

        txtN = new JTextField();
        txtN.setBounds(220, 30, 100, 30);
        txtN.setHorizontalAlignment(SwingConstants.RIGHT);
        txtN.setMargin(new Insets(5, 5, 5, 5));
        getContentPane().add(txtN);

        JLabel lblFibonacci = new JLabel("Serie de Fibonacci:");
        lblFibonacci.setBounds(50, 80, 150, 30);
        getContentPane().add(lblFibonacci);

        txtFibonacci = new JTextField();
        txtFibonacci.setBounds(220, 80, 100, 30);
        txtFibonacci.setFocusable(false);
        txtFibonacci.setHorizontalAlignment(SwingConstants.LEFT);
        txtFibonacci.setMargin(new Insets(5, 5, 5, 5));
        getContentPane().add(txtFibonacci);

        JButton btnCalcular = new JButton("Calcular");
        btnCalcular.setBounds(150, 130, 100, 30);
        getContentPane().add(btnCalcular);

        btnCalcular.addActionListener(e -> btnCalcular_actionPerformed());
    }

    protected void btnCalcular_actionPerformed() {
        int n = Integer.parseInt(txtN.getText());
        StringBuilder fibonacciSeries = new StringBuilder();
        for (int i = 0; i < n; i++) {
            fibonacciSeries.append(fibonacci(i)).append(" ");
        }
        txtFibonacci.setText(fibonacciSeries.toString().trim());
    }

    private int fibonacci(int n) {
        if (n <= 1) return n;
        return fibonacci(n - 1) + fibonacci(n - 2);
    }
}