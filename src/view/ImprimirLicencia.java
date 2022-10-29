package view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Panel;
import java.awt.Color;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JSeparator;

import javax.swing.UIManager;

public class ImprimirLicencia extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 4407739747413538507L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ImprimirLicencia frame = new ImprimirLicencia();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public ImprimirLicencia() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1000, 500);
		contentPane = new JPanel();
		contentPane.setBorder(UIManager.getBorder("Button.border"));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel tituloImpresion = new JLabel("Previsualizaci\u00F3n de Licencia", SwingConstants.CENTER);
		tituloImpresion.setFont(new Font("Tahoma", Font.PLAIN, 24));
		tituloImpresion.setBounds(10, 11, 964, 20);
		contentPane.add(tituloImpresion);
		
		JPanel licFrente = new JPanel();
		licFrente.setBackground(new Color(230, 255, 255));
		licFrente.setBorder(BorderFactory.createLineBorder(Color.black));
		licFrente.setBounds(10, 50, 400, 300);
		contentPane.add(licFrente);
		licFrente.setLayout(null);
		
		JLabel tituloLicencia = new JLabel("Licencia Nacional de Conducir");
		tituloLicencia.setForeground(new Color(4, 130, 255));
		tituloLicencia.setBackground(new Color(4, 130, 255));
		tituloLicencia.setFont(new Font("Tahoma", Font.PLAIN, 18));
		tituloLicencia.setHorizontalAlignment(SwingConstants.CENTER);
		tituloLicencia.setBounds(10, 3, 380, 14);
		licFrente.add(tituloLicencia);
		
		JLabel ubiLicencia = new JLabel("SANTA FE - SANTA FE");
		ubiLicencia.setForeground(new Color(4, 130, 255));
		ubiLicencia.setFont(new Font("Tahoma", Font.PLAIN, 14));
		ubiLicencia.setHorizontalAlignment(SwingConstants.CENTER);
		ubiLicencia.setBounds(0, 23, 400, 14);
		licFrente.add(ubiLicencia);
		
		JLabel lblNumLicencia = new JLabel("N\u00B0 Licencia / License N\u00B0");
		lblNumLicencia.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNumLicencia.setBounds(150, 60, 140, 14);
		licFrente.add(lblNumLicencia);
		
		JLabel fotoPersona = new JLabel("");
		fotoPersona.setHorizontalAlignment(SwingConstants.CENTER);
		fotoPersona.setIcon(new ImageIcon("C:\\Users\\mati9\\OneDrive - UTN - Santa Fe\\Facultad\\Metodos Agiles\\Proyecto MA\\Licencia - Metodos Agiles\\img\\oso.jpg"));
		fotoPersona.setBounds(10, 60, 132, 208);
		licFrente.add(fotoPersona);
		
		JLabel numLicenciaLabel = new JLabel("0000");
		numLicenciaLabel.setFont(new Font("Tahoma", Font.ITALIC, 11));
		numLicenciaLabel.setBounds(160, 80, 46, 14);
		licFrente.add(numLicenciaLabel);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(10, 39, 380, 10);
		licFrente.add(separator);
		
		JLabel lblApellido = new JLabel("Apellido / Last name");
		lblApellido.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblApellido.setBounds(150, 100, 140, 14);
		licFrente.add(lblApellido);
		
		JLabel apellidoLabel = new JLabel("aaaa");
		apellidoLabel.setFont(new Font("Tahoma", Font.ITALIC, 11));
		apellidoLabel.setBounds(160, 120, 46, 14);
		licFrente.add(apellidoLabel);
		
		JLabel lblNombre = new JLabel("Nombre / First name");
		lblNombre.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNombre.setBounds(150, 140, 140, 14);
		licFrente.add(lblNombre);
		
		JLabel nombreLabel = new JLabel("aaaa");
		nombreLabel.setFont(new Font("Tahoma", Font.ITALIC, 11));
		nombreLabel.setBounds(160, 160, 46, 14);
		licFrente.add(nombreLabel);
		
		JLabel lblDomicilio = new JLabel("Domicilio / address");
		lblDomicilio.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblDomicilio.setBounds(150, 180, 140, 14);
		licFrente.add(lblDomicilio);
		
		JLabel domicilioLabel = new JLabel("aaaa 000 ");
		domicilioLabel.setFont(new Font("Tahoma", Font.ITALIC, 11));
		domicilioLabel.setBounds(160, 200, 104, 14);
		licFrente.add(domicilioLabel);
		
		JLabel lblFechaNac = new JLabel("Fecha de Nac. / Date of Birth");
		lblFechaNac.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblFechaNac.setBounds(150, 220, 190, 14);
		licFrente.add(lblFechaNac);
		
		JLabel fechaNacLabel = new JLabel("23/07/2022");
		fechaNacLabel.setFont(new Font("Tahoma", Font.ITALIC, 11));
		fechaNacLabel.setBounds(160, 240, 104, 14);
		licFrente.add(fechaNacLabel);
		
		JLabel lblfechaVencim = new JLabel("Vencimiento / Expires");
		lblfechaVencim.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblfechaVencim.setBounds(150, 260, 140, 14);
		licFrente.add(lblfechaVencim);
		
		JLabel fechaVencimLabel = new JLabel("23/07/2023");
		fechaVencimLabel.setFont(new Font("Tahoma", Font.ITALIC, 11));
		fechaVencimLabel.setBounds(160, 280, 89, 14);
		licFrente.add(fechaVencimLabel);
		
		JPanel licDorso = new JPanel();
		licDorso.setBackground(new Color(230, 255, 255));
		licDorso.setBorder(BorderFactory.createLineBorder(Color.black));
		licDorso.setBounds(570, 50, 400, 300);
		contentPane.add(licDorso);
		licDorso.setLayout(null);
		
		JLabel lblTipoLic = new JLabel("Tipo de licencia / type of license");
		lblTipoLic.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblTipoLic.setBounds(10, 60, 197, 14);
		licDorso.add(lblTipoLic);
		
		JLabel tipoLicLabel = new JLabel("B1");
		tipoLicLabel.setFont(new Font("Tahoma", Font.ITALIC, 11));
		tipoLicLabel.setBounds(20, 80, 46, 14);
		licDorso.add(tipoLicLabel);
	}
}
