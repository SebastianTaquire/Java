package secuenciales;

import java.awt.EventQueue;
import java.awt.Insets;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class frm12 extends JFrame {
    private static final long serialVersionUID = 1L;
    JTextField txtA, txtB, txtC, txtResultado1, txtResultado2;

    public static void main(String[] args) {
        EventQueue.invokeLater(() -> {
            try {
                frm12 frame = new frm12();
                frame.setVisible(true);
            } catch (Exception e) {
                e.printStackTrace();
            }
        });
    }

    public frm12() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(0, 0, 400, 300);
        setLayout(null);
        setLocationRelativeTo(null);

        JLabel lblA = new JLabel("A:");
        lblA.setBounds(50, 50, 100, 30);
        getContentPane().add(lblA);

        JLabel lblB = new JLabel("B:");
        lblB.setBounds(50, 90, 100, 30);
        getContentPane().add(lblB);

        JLabel lblC = new JLabel("C:");
        lblC.setBounds(50, 130, 100, 30);
        getContentPane().add(lblC);

        JLabel lblResultado1 = new JLabel("Raíz 1:");
        lblResultado1.setBounds(50, 170, 100, 30);
        getContentPane().add(lblResultado1);

        JLabel lblResultado2 = new JLabel("Raíz 2:");
        lblResultado2.setBounds(50, 210, 100, 30);
        getContentPane().add(lblResultado2);

        txtA = new JTextField();
        txtA.setBounds(160, 50, 100, 30);
        txtA.setHorizontalAlignment(SwingConstants.RIGHT);
        txtA.setMargin(new Insets(5, 5, 5, 5));
        getContentPane().add(txtA);

        txtB = new JTextField();
        txtB.setBounds(160, 90, 100, 30);
        txtB.setHorizontalAlignment(SwingConstants.RIGHT);
        txtB.setMargin(new Insets(5, 5, 5, 5));
        getContentPane().add(txtB);

        txtC = new JTextField();
        txtC.setBounds(160, 130, 100, 30);
        txtC.setHorizontalAlignment(SwingConstants.RIGHT);
        txtC.setMargin(new Insets(5, 5, 5, 5));
        getContentPane().add(txtC);

        txtResultado1 = new JTextField();
        txtResultado1.setBounds(160, 170, 100, 30);
        txtResultado1.setFocusable(false);
        txtResultado1.setHorizontalAlignment(SwingConstants.RIGHT);
        txtResultado1.setMargin(new Insets(5, 5, 5, 5));
        getContentPane().add(txtResultado1);

        txtResultado2 = new JTextField();
        txtResultado2.setBounds(160, 210, 100, 30);
        txtResultado2.setFocusable(false);
        txtResultado2.setHorizontalAlignment(SwingConstants.RIGHT);
        txtResultado2.setMargin(new Insets(5, 5, 5, 5));
        getContentPane().add(txtResultado2);

        JButton btnCalcular = new JButton("Calcular");
        btnCalcular.setBounds(140, 250, 100, 30);
        getContentPane().add(btnCalcular);

        btnCalcular.addActionListener(e -> btnCalcular_actionPerforme());
    }

    protected void btnCalcular_actionPerforme() {
        int a = Integer.parseInt(txtA.getText());
        int b = Integer.parseInt(txtB.getText());
        int c = Integer.parseInt(txtC.getText());

        double discriminante = Math.pow(b, 2) - 4 * a * c;
        double raiz1 = (-b + Math.sqrt(discriminante)) / (2 * a);
        double raiz2 = (-b - Math.sqrt(discriminante)) / (2 * a);

        txtResultado1.setText(String.format("%.2f", raiz1));
        txtResultado2.setText(String.format("%.2f", raiz2));
    }
}