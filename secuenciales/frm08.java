package secuenciales;

import java.awt.EventQueue;
import java.awt.Insets;
import java.text.DecimalFormat;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class frm08 extends JFrame {
    private static final long serialVersionUID = 1L;
    JTextField txtRadio, txtAltura, txtAreaBase, txtAreaLateral, txtAreaTotal;

    public static void main(String[] args) {
        EventQueue.invokeLater(() -> {
            try {
                frm08 frame = new frm08();
                frame.setVisible(true);
            } catch (Exception e) {
                e.printStackTrace();
            }
        });
    }

    public frm08() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(0, 0, 350, 350);
        setLayout(null);
        setLocationRelativeTo(null);
        
        JLabel lblRadio = new JLabel("Radio:");
        lblRadio.setBounds(50, 50, 80, 30);
        getContentPane().add(lblRadio);

        JLabel lblAltura = new JLabel("Altura:");
        lblAltura.setBounds(50, 90, 80, 30);
        getContentPane().add(lblAltura);

        JLabel lblAreaBase = new JLabel("Área Base:");
        lblAreaBase.setBounds(50, 150, 80, 30);
        getContentPane().add(lblAreaBase);

        JLabel lblAreaLateral = new JLabel("Área Lateral:");
        lblAreaLateral.setBounds(50, 190, 80, 30);
        getContentPane().add(lblAreaLateral);

        JLabel lblAreaTotal = new JLabel("Área Total:");
        lblAreaTotal.setBounds(50, 230, 80, 30);
        getContentPane().add(lblAreaTotal);

        txtRadio = new JTextField();
        txtRadio.setBounds(150, 50, 100, 30);
        txtRadio.setHorizontalAlignment(SwingConstants.RIGHT);
        txtRadio.setMargin(new Insets(5, 5, 5, 5));
        getContentPane().add(txtRadio);

        txtAltura = new JTextField();
        txtAltura.setBounds(150, 90, 100, 30);
        txtAltura.setHorizontalAlignment(SwingConstants.RIGHT);
        txtAltura.setMargin(new Insets(5, 5, 5, 5));
        getContentPane().add(txtAltura);

        txtAreaBase = new JTextField();
        txtAreaBase.setBounds(150, 150, 100, 30);
        txtAreaBase.setFocusable(false);
        txtAreaBase.setHorizontalAlignment(SwingConstants.RIGHT);
        txtAreaBase.setMargin(new Insets(5, 5, 5, 5));
        getContentPane().add(txtAreaBase);

        txtAreaLateral = new JTextField();
        txtAreaLateral.setBounds(150, 190, 100, 30);
        txtAreaLateral.setFocusable(false);
        txtAreaLateral.setHorizontalAlignment(SwingConstants.RIGHT);
        txtAreaLateral.setMargin(new Insets(5, 5, 5, 5));
        getContentPane().add(txtAreaLateral);

        txtAreaTotal = new JTextField();
        txtAreaTotal.setBounds(150, 230, 100, 30);
        txtAreaTotal.setFocusable(false);
        txtAreaTotal.setHorizontalAlignment(SwingConstants.RIGHT);
        txtAreaTotal.setMargin(new Insets(5, 5, 5, 5));
        getContentPane().add(txtAreaTotal);

        JButton btnCalcular = new JButton("Calcular");
        btnCalcular.setBounds(120, 280, 100, 30);
        getContentPane().add(btnCalcular);

        btnCalcular.addActionListener(e -> btnCalcular_actionPerformer());
    }

    protected void btnCalcular_actionPerformer() {
        int radio = Integer.parseInt(txtRadio.getText());
        int altura = Integer.parseInt(txtAltura.getText());

        double areaBase = Math.PI * Math.pow(radio, 2);
        double areaLateral = 2 * Math.PI * radio * altura;
        double areaTotal = 2 * areaBase + areaLateral;

        DecimalFormat df = new DecimalFormat("##.00");
        txtAreaBase.setText(df.format(areaBase));
        txtAreaLateral.setText(df.format(areaLateral));
        txtAreaTotal.setText(df.format(areaTotal));
    }
}