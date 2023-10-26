package co.edu.udistrital.view;

import java.awt.BorderLayout;
import java.awt.Color;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.border.TitledBorder;

public class PanelResultados extends JPanel{

	private JTextArea resultados;
	
	public PanelResultados() {
		setLayout(new BorderLayout());
		setBackground(Color.GREEN);
		setBorder(new TitledBorder("Modulo de resultados "));
		
		inicializarComponentes();
		
		setVisible(true);
	}
	
	public void inicializarComponentes() {
		
		resultados = new JTextArea();
		resultados.setEditable(false);
		
		JScrollPane scroll = new JScrollPane(resultados, 
				JScrollPane.VERTICAL_SCROLLBAR_ALWAYS, 
				JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
		
		add( scroll, BorderLayout.CENTER);
	}

	public JTextArea getResultados() {
		return resultados;
	}

	public void setResultados(JTextArea resultados) {
		this.resultados = resultados;
	}
		
}








