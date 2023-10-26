package co.edu.udistrital.view;

import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.TitledBorder;

public class PanelDatos extends JPanel{

	private JLabel enum1;
	private JLabel enum2;
	private JTextField cnum1;
	private JTextField cnum2;
	private JButton bsumar;
	private JButton brestar;
	private JButton bmultiplicar;
	private JButton bdividir;
	
	
	
	public PanelDatos() {
		setLayout(new GridLayout(4, 2));
		setBackground(Color.LIGHT_GRAY);
		setBorder(new TitledBorder("Modulo de datos "));
		
		inicializarComponentes();
		
		setVisible(true);
	}
	
	public void inicializarComponentes() {
		
		enum1 = new JLabel("N1:");
		add(enum1);
		
		cnum1 = new JTextField();
		add(cnum1);
		
		enum2 = new JLabel("N2:");
		add(enum2);
		
		cnum2 = new JTextField();
		add(cnum2);
		
		bsumar = new JButton("Sumar");
		bsumar.setActionCommand("SUMAR");
		add(bsumar);
		
		brestar = new JButton("Restar");
		brestar.setActionCommand("RESTAR");
		add(brestar);
		
		bmultiplicar = new JButton("Multiplicar");
		bmultiplicar.setActionCommand("MULTIPLICAR");
		add(bmultiplicar);
		
		bdividir = new JButton("Dividir");
		bdividir.setActionCommand("DIVIDIR");
		add(bdividir);
		
	}

	public JLabel getEnum1() {
		return enum1;
	}

	public void setEnum1(JLabel enum1) {
		this.enum1 = enum1;
	}

	public JLabel getEnum2() {
		return enum2;
	}

	public void setEnum2(JLabel enum2) {
		this.enum2 = enum2;
	}

	public JTextField getCnum1() {
		return cnum1;
	}

	public void setCnum1(JTextField cnum1) {
		this.cnum1 = cnum1;
	}

	public JTextField getCnum2() {
		return cnum2;
	}

	public void setCnum2(JTextField cnum2) {
		this.cnum2 = cnum2;
	}

	public JButton getBsumar() {
		return bsumar;
	}

	public void setBsumar(JButton bsumar) {
		this.bsumar = bsumar;
	}

	public JButton getBrestar() {
		return brestar;
	}

	public void setBrestar(JButton brestar) {
		this.brestar = brestar;
	}

	public JButton getBmultiplicar() {
		return bmultiplicar;
	}

	public void setBmultiplicar(JButton bmultiplicar) {
		this.bmultiplicar = bmultiplicar;
	}

	public JButton getBdividir() {
		return bdividir;
	}

	public void setBdividir(JButton bdividir) {
		this.bdividir = bdividir;
	}

}







