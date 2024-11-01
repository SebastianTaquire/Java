package secuenciales;

import java.awt.EventQueue;
import java.awt.Insets;
import java.text.DecimalFormat;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class frm03 extends JFrame {
    private static final long serialVersionUID = 1L;
    JTextField txtKilometros, txtPies, txtMillas, txtMetros, txtYardas;

    public static void main(String[] args) {
        EventQueue.invokeLater(() -> {
            try {
                frm03 frame = new frm03();
                frame.setVisible(true);
            } catch (Exception e) {
                e.printStackTrace();
            }
        });
    }

    public frm03() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(0, 0, 300, 300);
        setLayout(null);
        setLocationRelativeTo(null);
        
        JLabel lblKilometros = new JLabel("Kilómetros:");
        lblKilometros.setBounds(50, 30, 80, 30);
        getContentPane().add(lblKilometros);

        JLabel lblPies = new JLabel("Pies:");
        lblPies.setBounds(50, 70, 80, 30);
        getContentPane().add(lblPies);

        JLabel lblMillas = new JLabel("Millas:");
        lblMillas.setBounds(50, 110, 80, 30);
        getContentPane().add(lblMillas);

        JLabel lblMetros = new JLabel("Metros:");
        lblMetros.setBounds(50, 190, 80, 30);
        getContentPane().add(lblMetros);

        JLabel lblYardas = new JLabel("Yardas:");
        lblYardas.setBounds(50, 230, 80, 30);
        getContentPane().add(lblYardas);

        txtKilometros = new JTextField();
        txtKilometros.setBounds(150, 30, 80, 30);
        txtKilometros.setHorizontalAlignment(SwingConstants.RIGHT);
        txtKilometros.setMargin(new Insets(5, 5, 5, 5));
        getContentPane().add(txtKilometros);

        txtPies = new JTextField();
        txtPies.setBounds(150, 70, 80, 30);
        txtPies.setHorizontalAlignment(SwingConstants.RIGHT);
        txtPies.setMargin(new Insets(5, 5, 5, 5));
        getContentPane().add(txtPies);

        txtMillas = new JTextField();
        txtMillas.setBounds(150, 110, 80, 30);
        txtMillas.setHorizontalAlignment(SwingConstants.RIGHT);
        txtMillas.setMargin(new Insets(5, 5, 5, 5));
        getContentPane().add(txtMillas);

        txtMetros = new JTextField();
        txtMetros.setBounds(150, 190, 80, 30);
        txtMetros.setFocusable(false);
        txtMetros.setHorizontalAlignment(SwingConstants.RIGHT);
        txtMetros.setMargin(new Insets(5, 5, 5, 5));
        getContentPane().add(txtMetros);

        txtYardas = new JTextField();
        txtYardas.setBounds(150, 230, 80, 30);
        txtYardas.setFocusable(false);
        txtYardas.setHorizontalAlignment(SwingConstants.RIGHT);
        txtYardas.setMargin(new Insets(5, 5, 5, 5));
        getContentPane().add(txtYardas);

        JButton btnCalcular = new JButton("Calcular");
        btnCalcular.setBounds(100, 150, 80, 30);
        getContentPane().add(btnCalcular);

        btnCalcular.addActionListener(e -> btnCalcular_actionPerformer());
    }

    protected void btnCalcular_actionPerformer() {
        double kilometros = Double.parseDouble(txtKilometros.getText());
        double pies = Double.parseDouble(txtPies.getText());
        double millas = Double.parseDouble(txtMillas.getText());

        double kilometrosMetros = kilometros * 1000;
        double piesMetros = pies / 3.2808;
        double millasMetros = millas * 1609;

        double totalMetros = kilometrosMetros + piesMetros + millasMetros;
        double totalYardas = totalMetros * 1.09361;

        DecimalFormat df = new DecimalFormat("##.00");
        txtMetros.setText(df.format(totalMetros));
        txtYardas.setText(df.format(totalYardas));
    }
}