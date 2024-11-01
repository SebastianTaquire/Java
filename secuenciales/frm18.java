package secuenciales;

import java.awt.EventQueue;
import java.awt.Insets;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class frm18 extends JFrame {
    private static final long serialVersionUID = 1L;
    JTextField txtCantidad, txtPrecioUnitario, txtImporteCompra, txtDescuento, txtImporteFinal;

    public static void main(String[] args) {
        EventQueue.invokeLater(() -> {
            try {
                frm18 frame = new frm18();
                frame.setVisible(true);
            } catch (Exception e) {
                e.printStackTrace();
            }
        });
    }

    public frm18() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(0, 0, 400, 300);
        setLayout(null);
        setLocationRelativeTo(null);

        JLabel lblCantidad = new JLabel("Cantidad:");
        lblCantidad.setBounds(50, 30, 150, 30);
        getContentPane().add(lblCantidad);

        txtCantidad = new JTextField();
        txtCantidad.setBounds(220, 30, 100, 30);
        txtCantidad.setHorizontalAlignment(SwingConstants.RIGHT);
        txtCantidad.setMargin(new Insets(5, 5, 5, 5));
        getContentPane().add(txtCantidad);

        JLabel lblPrecioUnitario = new JLabel("Precio Unitario:");
        lblPrecioUnitario.setBounds(50, 70, 150, 30);
        getContentPane().add(lblPrecioUnitario);

        txtPrecioUnitario = new JTextField();
        txtPrecioUnitario.setBounds(220, 70, 100, 30);
        txtPrecioUnitario.setHorizontalAlignment(SwingConstants.RIGHT);
        txtPrecioUnitario.setMargin(new Insets(5, 5, 5, 5));
        getContentPane().add(txtPrecioUnitario);

        JLabel lblImporteCompra = new JLabel("Importe de Compra:");
        lblImporteCompra.setBounds(50, 110, 150, 30);
        getContentPane().add(lblImporteCompra);

        txtImporteCompra = new JTextField();
        txtImporteCompra.setBounds(220, 110, 100, 30);
        txtImporteCompra.setFocusable(false);
        txtImporteCompra.setHorizontalAlignment(SwingConstants.RIGHT);
        txtImporteCompra.setMargin(new Insets(5, 5, 5, 5));
        getContentPane().add(txtImporteCompra);

        JLabel lblDescuento = new JLabel("Descuento Total:");
        lblDescuento.setBounds(50, 150, 150, 30);
        getContentPane().add(lblDescuento);

        txtDescuento = new JTextField();
        txtDescuento.setBounds(220, 150, 100, 30);
        txtDescuento.setFocusable(false);
        txtDescuento.setHorizontalAlignment(SwingConstants.RIGHT);
        txtDescuento.setMargin(new Insets(5, 5, 5, 5));
        getContentPane().add(txtDescuento);

        JLabel lblImporteFinal = new JLabel("Importe a Pagar:");
        lblImporteFinal.setBounds(50, 190, 150, 30);
        getContentPane().add(lblImporteFinal);

        txtImporteFinal = new JTextField();
        txtImporteFinal.setBounds(220, 190, 100, 30);
        txtImporteFinal.setFocusable(false);
        txtImporteFinal.setHorizontalAlignment(SwingConstants.RIGHT);
        txtImporteFinal.setMargin(new Insets(5, 5, 5, 5));
        getContentPane().add(txtImporteFinal);

        JButton btnCalcular = new JButton("Calcular");
        btnCalcular.setBounds(150, 230, 100, 30);
        getContentPane().add(btnCalcular);

        btnCalcular.addActionListener(e -> btnCalcular_actionPerformer());
    }

    protected void btnCalcular_actionPerformer() {
        int cantidad = Integer.parseInt(txtCantidad.getText());
        int precioUnitario = Integer.parseInt(txtPrecioUnitario.getText());

        double importeCompra = cantidad * precioUnitario;

        double primerDescuento = importeCompra * 0.15;
        double importeDespuesPrimerDescuento = importeCompra - primerDescuento;

        double segundoDescuento = importeDespuesPrimerDescuento * 0.15;
        double descuentoTotal = primerDescuento + segundoDescuento;

        double importeFinal = importeCompra - descuentoTotal;

        txtImporteCompra.setText(String.format("%.2f", importeCompra));
        txtDescuento.setText(String.format("%.2f", descuentoTotal));
        txtImporteFinal.setText(String.format("%.2f", importeFinal));
    }
}