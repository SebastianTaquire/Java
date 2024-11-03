package recursividad;

import java.awt.EventQueue;
import java.awt.Insets;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class recursividad02 extends JFrame {
    private static final long serialVersionUID = 1L;
    JTextField txtArray, txtMax;

    public static void main(String[] args) {
        EventQueue.invokeLater(() -> {
            try {
                recursividad02 frame = new recursividad02();
                frame.setVisible(true);
            } catch (Exception e) {
                e.printStackTrace();
            }
        });
    }

    public recursividad02() {
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

        JLabel lblMax = new JLabel("Elemento máximo:");
        lblMax.setBounds(50, 110, 150, 30);
        getContentPane().add(lblMax);

        txtMax = new JTextField();
        txtMax.setBounds(220, 110, 100, 30);
        txtMax.setFocusable(false);
        txtMax.setHorizontalAlignment(SwingConstants.RIGHT);
        txtMax.setMargin(new Insets(5, 5, 5, 5));
        getContentPane().add(txtMax);

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
        txtMax.setText(String.valueOf(maxElement(arr, arr.length)));
    }

    private int maxElement(int[] arr, int n) {
        int max = arr[0];
        for (int i = 1; i < n; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }
}