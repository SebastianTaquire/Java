package recursividad;

import java.awt.EventQueue;
import java.awt.Insets;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class recursividad04 extends JFrame {
    private static final long serialVersionUID = 1L;
    JTextField txtN, txtSuma;

    public static void main(String[] args) {
        EventQueue.invokeLater(() -> {
            try {
                recursividad04 frame = new recursividad04();
                frame.setVisible(true);
            } catch (Exception e) {
                e.printStackTrace();
            }
        });
    }

    public recursividad04() {
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

        JLabel lblSuma = new JLabel("Suma de impares:");
        lblSuma.setBounds(50, 80, 150, 30);
        getContentPane().add(lblSuma);

        txtSuma = new JTextField();
        txtSuma.setBounds(220, 80, 100, 30);
        txtSuma.setFocusable(false);
        txtSuma.setHorizontalAlignment(SwingConstants.RIGHT);
        txtSuma.setMargin(new Insets(5, 5, 5, 5));
        getContentPane().add(txtSuma);

        JButton btnCalcular = new JButton("Calcular");
        btnCalcular.setBounds(150, 130, 100, 30);
        getContentPane().add(btnCalcular);

        btnCalcular.addActionListener(e -> btnCalcular_actionPerformed());
    }

    protected void btnCalcular_actionPerformed() {
        int n = Integer.parseInt(txtN.getText());
        txtSuma.setText(String.valueOf(sumOddNumbers(n)));
    }

    private int sumOddNumbers(int n) {
        int suma = 0;
        int contador = 1;  
        while (n > 0) {
            suma += contador;
            contador += 2;  
            n--;
        }
        return suma;
    }
}