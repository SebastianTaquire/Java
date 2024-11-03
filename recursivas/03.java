package recursividad;

import java.awt.EventQueue;
import java.awt.Insets;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class recursividad03 extends JFrame {
    private static final long serialVersionUID = 1L;
    JTextField txtDiscos, txtMovimientos;

    public static void main(String[] args) {
        EventQueue.invokeLater(() -> {
            try {
                recursividad03 frame = new recursividad03();
                frame.setVisible(true);
            } catch (Exception e) {
                e.printStackTrace();
            }
        });
    }

    public recursividad03() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(0, 0, 400, 300);
        setLayout(null);
        setLocationRelativeTo(null);

        JLabel lblDiscos = new JLabel("Número de discos:");
        lblDiscos.setBounds(50, 30, 150, 30);
        getContentPane().add(lblDiscos);

        txtDiscos = new JTextField();
        txtDiscos.setBounds(220, 30, 100, 30);
        txtDiscos.setHorizontalAlignment(SwingConstants.RIGHT);
        txtDiscos.setMargin(new Insets(5, 5, 5, 5));
        getContentPane().add(txtDiscos);

        JLabel lblMovimientos = new JLabel("Movimientos:");
        lblMovimientos.setBounds(50, 80, 150, 30);
        getContentPane().add(lblMovimientos);

        txtMovimientos = new JTextField();
        txtMovimientos.setBounds(220, 80, 100, 30);
        txtMovimientos.setFocusable(false);
        txtMovimientos.setHorizontalAlignment(SwingConstants.LEFT);
        txtMovimientos.setMargin(new Insets(5, 5, 5, 5));
        getContentPane().add(txtMovimientos);

        JButton btnCalcular = new JButton("Calcular");
        btnCalcular.setBounds(150, 130, 100, 30);
        getContentPane().add(btnCalcular);

        btnCalcular.addActionListener(e -> btnCalcular_actionPerformed());
    }

    protected void btnCalcular_actionPerformed() {
        int discos = Integer.parseInt(txtDiscos.getText());
        StringBuilder movimientos = new StringBuilder();
        solveHanoi(discos, 'A', 'C', 'B', movimientos);
        txtMovimientos.setText(movimientos.toString());
    }

    private void solveHanoi(int n, char from, char to, char aux, StringBuilder movimientos) {
        if (n == 1) {
            movimientos.append("Mover disco 1 de ").append(from).append(" a ").append(to).append("\n");
            return;
        }
        solveHanoi(n - 1, from, aux, to, movimientos);
        movimientos.append("Mover disco ").append(n).append(" de ").append(from).append(" a ").append(to).append("\n");
        solveHanoi(n - 1, aux, to, from, movimientos);
    }
}