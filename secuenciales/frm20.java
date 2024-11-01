package secuenciales;

import java.awt.EventQueue;
import java.awt.Insets;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class frm20 extends JFrame {
    private static final long serialVersionUID = 1L;
    JTextField txtCantidad, txtBilletes200, txtBilletes100, txtBilletes50, txtBilletes20, txtBilletes10, txtMonedas5, txtMonedas2, txtMonedas1;

    public static void main(String[] args) {
        EventQueue.invokeLater(() -> {
            try {
                frm20 frame = new frm20();
                frame.setVisible(true);
            } catch (Exception e) {
                e.printStackTrace();
            }
        });
    }

    public frm20() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(0, 0, 400, 400);
        setLayout(null);
        setLocationRelativeTo(null);

        JLabel lblCantidad = new JLabel("Cantidad en soles:");
        lblCantidad.setBounds(50, 30, 150, 30);
        getContentPane().add(lblCantidad);

        txtCantidad = new JTextField();
        txtCantidad.setBounds(220, 30, 100, 30);
        txtCantidad.setHorizontalAlignment(SwingConstants.RIGHT);
        txtCantidad.setMargin(new Insets(5, 5, 5, 5));
        getContentPane().add(txtCantidad);

        JLabel lblBilletes200 = new JLabel("Billetes de 200:");
        lblBilletes200.setBounds(50, 70, 150, 30);
        getContentPane().add(lblBilletes200);

        txtBilletes200 = new JTextField();
        txtBilletes200.setBounds(220, 70, 100, 30);
        txtBilletes200.setFocusable(false);
        txtBilletes200.setHorizontalAlignment(SwingConstants.RIGHT);
        txtBilletes200.setMargin(new Insets(5, 5, 5, 5));
        getContentPane().add(txtBilletes200);

        JLabel lblBilletes100 = new JLabel("Billetes de 100:");
        lblBilletes100.setBounds(50, 110, 150, 30);
        getContentPane().add(lblBilletes100);

        txtBilletes100 = new JTextField();
        txtBilletes100.setBounds(220, 110, 100, 30);
        txtBilletes100.setFocusable(false);
        txtBilletes100.setHorizontalAlignment(SwingConstants.RIGHT);
        txtBilletes100.setMargin(new Insets(5, 5, 5, 5));
        getContentPane().add(txtBilletes100);

        JLabel lblBilletes50 = new JLabel("Billetes de 50:");
        lblBilletes50.setBounds(50, 150, 150, 30);
        getContentPane().add(lblBilletes50);

        txtBilletes50 = new JTextField();
        txtBilletes50.setBounds(220, 150, 100, 30);
        txtBilletes50.setFocusable(false);
        txtBilletes50.setHorizontalAlignment(SwingConstants.RIGHT);
        txtBilletes50.setMargin(new Insets(5, 5, 5, 5));
        getContentPane().add(txtBilletes50);

        JLabel lblBilletes20 = new JLabel("Billetes de 20:");
        lblBilletes20.setBounds(50, 190, 150, 30);
        getContentPane().add(lblBilletes20);

        txtBilletes20 = new JTextField();
        txtBilletes20.setBounds(220, 190, 100, 30);
        txtBilletes20.setFocusable(false);
        txtBilletes20.setHorizontalAlignment(SwingConstants.RIGHT);
        txtBilletes20.setMargin(new Insets(5, 5, 5, 5));
        getContentPane().add(txtBilletes20);

        JLabel lblBilletes10 = new JLabel("Billetes de 10:");
        lblBilletes10.setBounds(50, 230, 150, 30);
        getContentPane().add(lblBilletes10);

        txtBilletes10 = new JTextField();
        txtBilletes10.setBounds(220, 230, 100, 30);
        txtBilletes10.setFocusable(false);
        txtBilletes10.setHorizontalAlignment(SwingConstants.RIGHT);
        txtBilletes10.setMargin(new Insets(5, 5, 5, 5));
        getContentPane().add(txtBilletes10);

        JLabel lblMonedas5 = new JLabel("Monedas de 5:");
        lblMonedas5.setBounds(50, 270, 150, 30);
        getContentPane().add(lblMonedas5);

        txtMonedas5 = new JTextField();
        txtMonedas5.setBounds(220, 270, 100, 30);
        txtMonedas5.setFocusable(false);
        txtMonedas5.setHorizontalAlignment(SwingConstants.RIGHT);
        txtMonedas5.setMargin(new Insets(5, 5, 5, 5));
        getContentPane().add(txtMonedas5);

        JLabel lblMonedas2 = new JLabel("Monedas de 2:");
        lblMonedas2.setBounds(50, 310, 150, 30);
        getContentPane().add(lblMonedas2);

        txtMonedas2 = new JTextField();
        txtMonedas2.setBounds(220, 310, 100, 30);
        txtMonedas2.setFocusable(false);
        txtMonedas2.setHorizontalAlignment(SwingConstants.RIGHT);
        txtMonedas2.setMargin(new Insets(5, 5, 5, 5));
        getContentPane().add(txtMonedas2);

        JLabel lblMonedas1 = new JLabel("Monedas de 1:");
        lblMonedas1.setBounds(50, 350, 150, 30);
        getContentPane().add(lblMonedas1);

        txtMonedas1 = new JTextField();
        txtMonedas1.setBounds(220, 350, 100, 30);
        txtMonedas1.setFocusable(false);
        txtMonedas1.setHorizontalAlignment(SwingConstants.RIGHT);
        txtMonedas1.setMargin(new Insets(5, 5, 5, 5));
        getContentPane().add(txtMonedas1);

        JButton btnCalcular = new JButton("Calcular");
        btnCalcular.setBounds(150, 390, 100, 30);
        getContentPane().add(btnCalcular);

        btnCalcular.addActionListener(e -> btnCalcular_actionPerformer());
    }

    protected void btnCalcular_actionPerformer() {
        int cantidad = Integer.parseInt(txtCantidad.getText());

        int billetes200 = cantidad / 200;
        int resto = cantidad % 200;

        int billetes100 = resto / 100;
        resto %= 100;

        int billetes50 = resto / 50;
        resto %= 50;

        int billetes20 = resto / 20;
        resto %= 20;

        int billetes10 = resto / 10;
        resto %= 10;

        int monedas5 = resto / 5;
        resto %= 5;

        int monedas2 = resto / 2;
        int monedas1 = resto % 2;

        txtBilletes200.setText(String.valueOf(billetes200));
        txtBilletes100.setText(String.valueOf(billetes100));
        txtBilletes50.setText(String.valueOf(billetes50));
        txtBilletes20.setText(String.valueOf(billetes20));
        txtBilletes10.setText(String.valueOf(billetes10));
        txtMonedas5.setText(String.valueOf(monedas5));
        txtMonedas2.setText(String.valueOf(monedas2));
        txtMonedas1.setText(String.valueOf(monedas1));
    }
}