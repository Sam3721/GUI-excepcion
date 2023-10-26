package co.edu.udistrital.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

import co.edu.udistrital.model.Operaciones;
import co.edu.udistrital.view.VentanaPrincipal;

public class Controller implements ActionListener{

	private VentanaPrincipal vista;
	
	
	public Controller() {
		vista = new VentanaPrincipal();
		asignarOyentes();
	}
	
	public void asignarOyentes() {
		vista.getPd().getBsumar().addActionListener(this);
		vista.getPd().getBrestar().addActionListener(this);
		vista.getPd().getBmultiplicar().addActionListener(this);
		vista.getPd().getBdividir().addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		String comando = e.getActionCommand();
		try {
			int x = leerPrimerNumero();
			int y = leerSegundoNumero();
			String acum = vista.getPr().getResultados().getText();
			if(comando.equals("SUMAR")) {
				vista.getPr().getResultados().setText(acum  + x + " + " + y + " = " + Operaciones.sumar(x, y) + "\n");
			}else if(comando.equals("RESTAR")) {
				vista.getPr().getResultados().setText(acum  + x + " - " + y + " = " + Operaciones.restar(x, y) + "\n");
			}else if(comando.equals("MULTIPLICAR")) {
				vista.getPr().getResultados().setText(acum  + x + " * " + y + " = " + Operaciones.multiplicar(x, y) + "\n");
			}else if(comando.equals("DIVIDIR")) {
				DivisionCero.Validar(x, y);
				vista.getPr().getResultados().setText(acum  + x + " / " + y + " = " + Operaciones.dividir(x, y) + "\n");
			}
		}catch(NumberFormatException a) {
			vista.getPd().getCnum1().setText("");
			vista.getPd().getCnum2().setText("");
			JOptionPane.showMessageDialog(vista, "ERROR: Este numero no es valido"+ "\nIntentelo nuevamente", "ERROR", JOptionPane.ERROR_MESSAGE);
		}
		catch(ExcepcionCero a) {
			vista.getPd().getCnum1().setText("");
			vista.getPd().getCnum2().setText("");
			JOptionPane.showMessageDialog(vista, "ERROR: No se puede dividir por cero"+ "\nIntentelo nuevamente", "ERROR", JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public int leerPrimerNumero() {
		String aux = vista.getPd().getCnum1().getText();
		int n = Integer.parseInt(aux);
		return n;
	}
	
	public int leerSegundoNumero() {
		String aux = vista.getPd().getCnum2().getText();
		int n = Integer.parseInt(aux);
		return n;
	}
	
}





