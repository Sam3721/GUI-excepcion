package co.edu.udistrital.view;

import java.awt.BorderLayout;
import java.awt.Color;

import javax.swing.JFrame;

public class VentanaPrincipal extends JFrame{

	private PanelDatos pd;
	private PanelResultados pr;
	
	public VentanaPrincipal() {
		setTitle("Mi primera calculadora");
		setSize(600,200);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		getContentPane().setBackground(Color.ORANGE);
		getContentPane().setLayout(new BorderLayout(10,10));
		
		inicializarComponentes();
		
		setResizable(true);
		setLocationRelativeTo(null);
		setVisible(true);
	}
	
	public void inicializarComponentes() {
		pd = new PanelDatos();
		getContentPane().add(pd, BorderLayout.WEST);
		
		pr = new PanelResultados();
		getContentPane().add(pr, BorderLayout.CENTER);
	}

	public PanelDatos getPd() {
		return pd;
	}

	public void setPd(PanelDatos pd) {
		this.pd = pd;
	}

	public PanelResultados getPr() {
		return pr;
	}

	public void setPr(PanelResultados pr) {
		this.pr = pr;
	}
	
}









