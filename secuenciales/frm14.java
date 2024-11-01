package secuenciales;

import java.awt.EventQueue;
import java.awt.Insets;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class frm14 extends JFrame {
    private static final long serialVersionUID = 1L;
    JTextField txtNumero1, txtNumero2, txtNumero3, txtNumero4, txtNumero5, txtPromedio;

    public static void main(String[] args) {
        EventQueue.invokeLater(() -> {
            try {
                frm14 frame = new frm14();
                frame.setVisible(true);
            } catch (Exception e) {
                e.printStackTrace();
            }
        });
    }

    public frm14() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(0, 0, 400, 300);
        setLayout(null);
        setLocationRelativeTo(null);

        JLabel lblNumero1 = new JLabel("Número 1:");
        lblNumero1.setBounds(50, 30, 100, 30);
        getContentPane().add(lblNumero1);

        JLabel lblNumero2 = new JLabel("Número 2:");
        lblNumero2.setBounds(50, 70, 100, 30);
        getContentPane().add(lblNumero2);

        JLabel lblNumero3 = new JLabel("Número 3:");
        lblNumero3.setBounds(50, 110, 100, 30);
        getContentPane().add(lblNumero3);

        JLabel lblNumero4 = new JLabel("Número 4:");
        lblNumero4.setBounds(50, 150, 100, 30);
        getContentPane().add(lblNumero4);

        JLabel lblNumero5 = new JLabel("Número 5:");
        lblNumero5.setBounds(50, 190, 100, 30);
        getContentPane().add(lblNumero5);

        txtNumero1 = new JTextField();
        txtNumero1.setBounds(160, 30, 100, 30);
        txtNumero1.setHorizontalAlignment(SwingConstants.RIGHT);
        txtNumero1.setMargin(new Insets(5, 5, 5, 5));
        getContentPane().add(txtNumero1);

        txtNumero2 = new JTextField();
        txtNumero2.setBounds(160, 70, 100, 30);
        txtNumero2.setHorizontalAlignment(SwingConstants.RIGHT);
        txtNumero2.setMargin(new Insets(5, 5, 5, 5));
        getContentPane().add(txtNumero2);

        txtNumero3 = new JTextField();
        txtNumero3.setBounds(160, 110, 100, 30);
        txtNumero3.setHorizontalAlignment(SwingConstants.RIGHT);
        txtNumero3.setMargin(new Insets(5, 5, 5, 5));
        getContentPane().add(txtNumero3);

        txtNumero4 = new JTextField();
        txtNumero4.setBounds(160, 150, 100, 30);
        txtNumero4.setHorizontalAlignment(SwingConstants.RIGHT);
        txtNumero4.setMargin(new Insets(5, 5, 5, 5));
        getContentPane().add(txtNumero4);

        txtNumero5 = new JTextField();
        txtNumero5.setBounds(160, 190, 100, 30);
        txtNumero5.setHorizontalAlignment(SwingConstants.RIGHT);
        txtNumero5.setMargin(new Insets(5, 5, 5, 5));
        getContentPane().add(txtNumero5);

        JLabel lblPromedio = new JLabel("Promedio de los 3 mayores:");
        lblPromedio.setBounds(50, 230, 200, 30);
        getContentPane().add(lblPromedio);

        txtPromedio = new JTextField();
        txtPromedio.setBounds(220, 230, 100, 30);
        txtPromedio.setFocusable(false);
        txtPromedio.setHorizontalAlignment(SwingConstants.RIGHT);
        txtPromedio.setMargin(new Insets(5, 5, 5, 5));
        getContentPane().add(txtPromedio);

        JButton btnCalcular = new JButton("Calcular");
        btnCalcular.setBounds(140, 270, 100, 30);
        getContentPane().add(btnCalcular);

        btnCalcular.addActionListener(e -> calcularPromedio());
    }

    protected void calcularPromedio() {
        int n1 = Integer.parseInt(txtNumero1.getText());
        int n2 = Integer.parseInt(txtNumero2.getText());
        int n3 = Integer.parseInt(txtNumero3.getText());
        int n4 = Integer.parseInt(txtNumero4.getText());
        int n5 = Integer.parseInt(txtNumero5.getText());

        double mayor1 = Math.max(Math.max(n1, n2), Math.max(n3, Math.max(n4, n5)));
        double menor1 = Math.min(Math.min(n1, n2), Math.min(n3, Math.min(n4, n5)));
        double menor2 = Math.min(Math.max(n1, n2), Math.max(n3, Math.max(n4, n5)));

        double promedio = (mayor1 + menor2 + (n1 + n2 + n3 + n4 + n5 - mayor1 - menor1)) / 3;

        txtPromedio.setText(String.format("%.2f", promedio));
    }
}