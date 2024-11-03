package recursividad;

import java.awt.EventQueue;
import java.awt.Insets;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class recursividad07 extends JFrame {
    private static final long serialVersionUID = 1L;
    JTextField txtArray, txtSuma;

    public static void main(String[] args) {
        EventQueue.invokeLater(() -> {
            try {
                recursividad07 frame = new recursividad07();
                frame.setVisible(true);
            } catch (Exception e) {
                e.printStackTrace();
            }
        });
    }

    public recursividad07() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(0, 0, 400, 300);
        setLayout(null);
        setLocationRelativeTo(null);

        JLabel lblArray = new JLabel("Ingrese los números (separados por comas):");
        lblArray.setBounds(50, 30, 300, 30);
        getContentPane().add(lblArray);

        txtArray = new JTextField();
        txtArray.setBounds(50, 70, 300, 30);
        txtArray.setMargin(new Insets(5, 5, 5, 5));
        getContentPane().add(txtArray);

        JLabel lblSuma = new JLabel("Suma de elementos:");
        lblSuma.setBounds(50, 110, 150, 30);
        getContentPane().add(lblSuma);

        txtSuma = new JTextField();
        txtSuma.setBounds(220, 110, 100, 30);
        txtSuma.setFocusable(false);
        txtSuma.setHorizontalAlignment(SwingConstants.RIGHT);
        txtSuma.setMargin(new Insets(5, 5, 5, 5));
        getContentPane().add(txtSuma);

        JButton btnCalcular = new JButton("Calcular");
        btnCalcular.setBounds(150, 160, 100, 30);
        getContentPane().add(btnCalcular);

        btnCalcular.addActionListener(e -> btnCalcular_actionPerformed());
    }

    protected void btnCalcular_actionPerformed() {
        String[] inputs = txtArray.getText().split(",");
        int[] arr = new int[inputs.length];
        for (int i = 0; i < inputs.length; i++) {
            arr[i] = Integer.parseInt(inputs[i].trim());
        }
        txtSuma.setText(String.valueOf(arraySum(arr, arr.length)));
    }

    private int arraySum(int[] arr, int n) {
        if (n <= 0) return 0;
        return arr[n - 1] + arraySum(arr, n - 1);
    }
}