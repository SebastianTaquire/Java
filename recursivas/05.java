package recursividad;

import java.awt.EventQueue;
import java.awt.Insets;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class recursividad05 extends JFrame {
    private static final long serialVersionUID = 1L;
    JTextField txtArray, txtBuscar, txtResultado;

    public static void main(String[] args) {
        EventQueue.invokeLater(() -> {
            try {
                recursividad05 frame = new recursividad05();
                frame.setVisible(true);
            } catch (Exception e) {
                e.printStackTrace();
            }
        });
    }

    public recursividad05() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(0, 0, 400, 300);
        setLayout(null);
        setLocationRelativeTo(null);

        JLabel lblArray = new JLabel("Ingrese los números mediante comas:");
        lblArray.setBounds(50, 30, 300, 30);
        getContentPane().add(lblArray);

        txtArray = new JTextField();
        txtArray.setBounds(50, 70, 300, 30);
        txtArray.setMargin(new Insets(5, 5, 5, 5));
        getContentPane().add(txtArray);

        JLabel lblBuscar = new JLabel("Número a buscar:");
        lblBuscar.setBounds(50, 110, 150, 30);
        getContentPane().add(lblBuscar);

        txtBuscar = new JTextField();
        txtBuscar.setBounds(220, 110, 100, 30);
        txtBuscar.setMargin(new Insets(5, 5, 5, 5));
        getContentPane().add(txtBuscar);

        JLabel lblResultado = new JLabel("Resultado:");
        lblResultado.setBounds(50, 150, 150, 30);
        getContentPane().add(lblResultado);

        txtResultado = new JTextField();
        txtResultado.setBounds(220, 150, 100, 30);
        txtResultado.setFocusable(false);
        txtResultado.setHorizontalAlignment(SwingConstants.LEFT);
        txtResultado.setMargin(new Insets(5, 5, 5, 5));
        getContentPane().add(txtResultado);

        JButton btnCalcular = new JButton("Buscar");
        btnCalcular.setBounds(150, 200, 100, 30);
        getContentPane().add(btnCalcular);

        btnCalcular.addActionListener(e -> btnCalcular_actionPerformed());
    }

    protected void btnCalcular_actionPerformed() {
        String[] inputs = txtArray.getText().split(",");
        int[] arr = new int[inputs.length];
        for (int i = 0; i < inputs.length; i++) {
            arr[i] = Integer.parseInt(inputs[i].trim());
        }
        int numeroBuscar = Integer.parseInt(txtBuscar.getText());
        int resultado = linearSearch(arr, numeroBuscar, 0);
        txtResultado.setText(resultado == -1 ? "No encontrado" : "Encontrado en índice: " + resultado);
    }

    private int linearSearch(int[] arr, int x, int index) {
        if (index >= arr.length) return -1;
        if (arr[index] == x) return index;
        return linearSearch(arr, x, index + 1);
    }
}