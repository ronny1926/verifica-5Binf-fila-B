
// TODO Inserire il package corretto
// nota: potete usare il suggerimento della lampadina a sinistra (scegliete l'unica opzione sensata). 
package it.marconicivitavecchia.as2018_19.c5Binf.verifica;

import javax.swing.*;

public class Main extends JFrame {
	
	public Main() {
		super("Formula 1 Passion");
		super.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		
		// TODO Inserire la size in accordo con il wireframe (valori approssimati)
		super.setSize(800,600);
		
		// TODO Usare StringBuilder per costruire la stringa HTML
		StringBuilder sb = new StringBuilder();
		
		// TODO Creare la stringa HTML per il wireframe
		
		sb.append("<html>");
		
		sb.append("<h1>Live the Company<h1>");
		
		sb.append("<table>");
		
		sb.append("<tr>");
		
		sb.append("<td>");
		sb.append("<h1>Evento<h1>");
		sb.append("</td>");
		
		sb.append("<td>");
		sb.append("<h1>Data<h1>");
		sb.append("</td>");
		
		sb.append("<td>");
		sb.append("<h1>Vado?<h1>");
		sb.append("</td>");
		
		sb.append("</tr>");
		
		
		sb.append("<tr>");
		
		sb.append("<td>");
		sb.append("Cocktail party");
		sb.append("</td>");
		
		sb.append("<td>");
		sb.append("7 dic");
		sb.append("</td>");
		
		sb.append("<td>");
		sb.append("Si");
		sb.append("</td>");
		
		sb.append("</tr>");
		
		
		sb.append("<tr>");
		
		sb.append("<td>");
		sb.append("Colazione sciale");
		sb.append("</td>");
		
		sb.append("<td>");
		sb.append("12 dic");
		sb.append("</td>");
		
		sb.append("<td>");
		sb.append("Si");
		sb.append("</td>");
		
		sb.append("</tr>");
		
		
		sb.append("<tr>");
		
		sb.append("<td>");
		sb.append("Saluti di Natale");
		sb.append("</td>");
		
		sb.append("<td>");
		sb.append("23 dic");
		sb.append("</td>");
		
		sb.append("<td>");
		sb.append("No");
		sb.append("</td>");
		
		sb.append("</tr>");
		
		sb.append("</table>");
		
		sb.append("</html>");
		
		
		// TODO Convertire lo StringBuilder in String
		String htmlText = sb.toString();
		
		// TODO Assegnare correttamente la stringa create a JLabel
		super.add(new JLabel(htmlText));
		super.setVisible(true);
		 
		System.out.println("Verifica Swing-GitHub");
		
		
	}
	
	
	public static void main (String[] args) {
		new Main();
	}
}

