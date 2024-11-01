package secuenciales;

import java.awt.EventQueue;
import java.awt.Insets;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class frm17 extends JFrame {
    private static final long serialVersionUID = 1L;
    JTextField txtDonacion, txtSalud, txtComedor, txtEscuela, txtAsilo;

    public static void main(String[] args) {
        EventQueue.invokeLater(() -> {
            try {
                frm17 frame = new frm17();
                frame.setVisible(true);
            } catch (Exception e) {
                e.printStackTrace();
            }
        });
    }

    public frm17() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(0, 0, 400, 300);
        setLayout(null);
        setLocationRelativeTo(null);

        JLabel lblDonacion = new JLabel("Donación Anual:");
        lblDonacion.setBounds(50, 30, 150, 30);
        getContentPane().add(lblDonacion);

        txtDonacion = new JTextField();
        txtDonacion.setBounds(220, 30, 100, 30);
        txtDonacion.setHorizontalAlignment(SwingConstants.RIGHT);
        txtDonacion.setMargin(new Insets(5, 5, 5, 5));
        getContentPane().add(txtDonacion);

        JLabel lblCentroSalud = new JLabel("Centro de Salud:");
        lblCentroSalud.setBounds(50, 70, 150, 30);
        getContentPane().add(lblCentroSalud);

        txtSalud = new JTextField();
        txtSalud.setBounds(220, 70, 100, 30);
        txtSalud.setFocusable(false);
        txtSalud.setHorizontalAlignment(SwingConstants.RIGHT);
        txtSalud.setMargin(new Insets(5, 5, 5, 5));
        getContentPane().add(txtSalud);

        JLabel lblComedorInfantil = new JLabel("Comedor Infantil:");
        lblComedorInfantil.setBounds(50, 110, 150, 30);
        getContentPane().add(lblComedorInfantil);

        txtComedor= new JTextField();
        txtComedor.setBounds(220, 110, 100, 30);
        txtComedor.setFocusable(false);
        txtComedor.setHorizontalAlignment(SwingConstants.RIGHT);
        txtComedor.setMargin(new Insets(5, 5, 5, 5));
        getContentPane().add(txtComedor);

        JLabel lblEscuelaInfantil = new JLabel("Escuela Infantil:");
        lblEscuelaInfantil.setBounds(50, 150, 150, 30);
        getContentPane().add(lblEscuelaInfantil);

        txtEscuela = new JTextField();
        txtEscuela.setBounds(220, 150, 100, 30);
        txtEscuela.setFocusable(false);
        txtEscuela.setHorizontalAlignment(SwingConstants.RIGHT);
        txtEscuela.setMargin(new Insets(5, 5, 5, 5));
        getContentPane().add(txtEscuela);

        JLabel lblAsiloAncianos = new JLabel("Asilo de Ancianos:");
        lblAsiloAncianos.setBounds(50, 190, 150, 30);
        getContentPane().add(lblAsiloAncianos);

        txtAsilo = new JTextField();
        txtAsilo.setBounds(220, 190, 100, 30);
        txtAsilo.setFocusable(false);
        txtAsilo.setHorizontalAlignment(SwingConstants.RIGHT);
        txtAsilo.setMargin(new Insets(5, 5, 5, 5));
        getContentPane().add(txtAsilo);

        JButton btnCalcular = new JButton("Calcular");
        btnCalcular.setBounds(150, 230, 100, 30);
        getContentPane().add(btnCalcular);

        btnCalcular.addActionListener(e -> btnCalcular_actionPerformer());
    }

    protected void btnCalcular_actionPerformer() {
        int donacion = Integer.parseInt(txtDonacion.getText());

        double Salud = donacion * 0.25;
        double comedor = donacion * 0.35;
        double escuela = donacion * 0.25;
        double asilo = donacion - (Salud + comedor + escuela);

        txtSalud.setText(String.format("%.2f", Salud));
        txtComedor.setText(String.format("%.2f", comedor));
        txtEscuela.setText(String.format("%.2f", escuela));
        txtAsilo.setText(String.format("%.2f", asilo));
    }
}