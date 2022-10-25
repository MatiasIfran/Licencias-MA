package view;

import javax.swing.*;
import java.awt.Button;
import javax.swing.border.LineBorder;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Component;
import java.awt.GridLayout;
import java.awt.GridBagLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;
import com.jgoodies.forms.factories.DefaultComponentFactory;
import java.awt.Canvas;
import java.awt.Panel;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.Label;
import net.miginfocom.swing.MigLayout;
import java.awt.TextField;
import java.awt.Choice;
import com.toedter.calendar.JDateChooser;
import java.awt.SystemColor;

public class LicenciaView extends JFrame{
	private JTextField insertarNombreConductortxt;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;

	public LicenciaView() {
		setAlwaysOnTop(true);
		setTitle("Emitir Licencia");
		getContentPane().setBackground(UIManager.getColor("Button.disabledShadow"));
		getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Nombre Completo (*)");
		lblNewLabel.setBounds(32, 35, 112, 14);
		getContentPane().add(lblNewLabel);
		
		insertarNombreConductortxt = new JTextField();
		insertarNombreConductortxt.setBounds(154, 32, 131, 20);
		getContentPane().add(insertarNombreConductortxt);
		insertarNombreConductortxt.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("Apellido(s) (*)");
		lblNewLabel_1.setBounds(317, 35, 75, 14);
		getContentPane().add(lblNewLabel_1);
		
		Panel panel = new Panel();
		panel.setBounds(10, 55, 575, 77);
		getContentPane().add(panel);
		panel.setLayout(null);
		
		Label label = new Label("Documento");
		label.setBounds(10, 4, 59, 22);
		panel.add(label);
		
		Label label_1 = new Label("Tipo (*)");
		label_1.setBounds(59, 32, 49, 22);
		panel.add(label_1);
		
		JComboBox comboboxtipoDoc = new JComboBox();
		comboboxtipoDoc.setBackground(SystemColor.window);
		comboboxtipoDoc.setModel(new DefaultComboBoxModel(new String[] {"-Seleccione-", "DNI", "LE", "LC"}));
		comboboxtipoDoc.setBounds(114, 32, 161, 22);
		panel.add(comboboxtipoDoc);
		
		JLabel lblNewLabel_2 = new JLabel("Numero (*)");
		lblNewLabel_2.setBounds(308, 35, 59, 14);
		panel.add(lblNewLabel_2);
		
		textField_1 = new JTextField();
		textField_1.setBounds(394, 32, 137, 20);
		panel.add(textField_1);
		textField_1.setColumns(10);
		
		textField = new JTextField();
		textField.setBounds(402, 32, 141, 20);
		getContentPane().add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel_3 = new JLabel("Direccion (*)");
		lblNewLabel_3.setBounds(32, 154, 75, 14);
		getContentPane().add(lblNewLabel_3);
		
		textField_2 = new JTextField();
		textField_2.setBounds(125, 151, 160, 20);
		getContentPane().add(textField_2);
		textField_2.setColumns(10);
		
		JLabel lblNewLabel_4 = new JLabel("Fecha de Nacimiento (*)");
		lblNewLabel_4.setBounds(302, 154, 131, 14);
		getContentPane().add(lblNewLabel_4);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(SystemColor.window);
		panel_1.setBounds(10, 179, 275, 105);
		getContentPane().add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblNewLabel_5 = new JLabel("Grupo Sanguineo y Factor RH ");
		lblNewLabel_5.setBounds(10, 11, 155, 14);
		panel_1.add(lblNewLabel_5);
		
		JLabel lblNewLabel_6 = new JLabel("Grupo Sanguineo (*)");
		lblNewLabel_6.setBounds(36, 42, 105, 14);
		panel_1.add(lblNewLabel_6);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"-Seleccione-", "A", "B", "AB", "0"}));
		comboBox.setBounds(151, 38, 100, 22);
		panel_1.add(comboBox);
		
		JLabel lblNewLabel_7 = new JLabel("Factor RH (*)");
		lblNewLabel_7.setBounds(36, 69, 73, 14);
		panel_1.add(lblNewLabel_7);
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setModel(new DefaultComboBoxModel(new String[] {"-Seleccione-", "+", "-"}));
		comboBox_1.setBounds(151, 65, 100, 22);
		panel_1.add(comboBox_1);
		
		JDateChooser dateChooser = new JDateChooser();
		dateChooser.setBounds(431, 152, 112, 20);
		getContentPane().add(dateChooser);
		
		JLabel lblNewLabel_8 = new JLabel("Donador de Organos (*)");
		lblNewLabel_8.setBounds(302, 232, 131, 14);
		getContentPane().add(lblNewLabel_8);
		
		JComboBox comboBox_2 = new JComboBox();
		comboBox_2.setModel(new DefaultComboBoxModel(new String[] {"-Seleccione-", "Si", "No"}));
		comboBox_2.setBounds(431, 228, 112, 22);
		getContentPane().add(comboBox_2);
		
		JLabel lblNewLabel_9 = new JLabel("Clase (*)");
		lblNewLabel_9.setBounds(32, 309, 46, 14);
		getContentPane().add(lblNewLabel_9);
		
		JComboBox comboBox_3 = new JComboBox();
		comboBox_3.setModel(new DefaultComboBoxModel(new String[] {"-Seleccione-", "Clase A", "Clase B", "Clase C", "Clase D", "Clase E", "Clase F", "Clase G"}));
		comboBox_3.setBounds(125, 305, 160, 22);
		getContentPane().add(comboBox_3);
		
		JLabel lblNewLabel_10 = new JLabel("Observaciones (*)");
		lblNewLabel_10.setBounds(302, 309, 98, 14);
		getContentPane().add(lblNewLabel_10);
		
	}
	private static void addPopup(Component component, final JPopupMenu popup) {
		component.addMouseListener(new MouseAdapter() {
			public void mousePressed(MouseEvent e) {
				if (e.isPopupTrigger()) {
					showMenu(e);
				}
			}
			public void mouseReleased(MouseEvent e) {
				if (e.isPopupTrigger()) {
					showMenu(e);
				}
			}
			private void showMenu(MouseEvent e) {
				popup.show(e.getComponent(), e.getX(), e.getY());
			}
		});
	}
}