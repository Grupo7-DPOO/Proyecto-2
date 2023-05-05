package Vista;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JPanel;

public class PBotones extends JPanel{
	private FPrincipal fPrincipal;
	private JButton bUsuario;
	private JButton bHabitaciones;
	private JButton bReservas;
	private JButton bFactura;
	private JButton bServicios;
	
	public PBotones(FPrincipal fPrincipal) {
		this.fPrincipal = fPrincipal;
		this.setLayout(new GridLayout(5,1,20,20));
		this.setBackground(Color.decode("#CCDAD1"));
		Font font = new Font("Tahoma", Font.BOLD, 30);
		
		this.bUsuario = new JButton("Usuario");
		bUsuario.setPreferredSize(new Dimension(300,2));
		bUsuario.setFont(font);
		bUsuario.setBackground(Color.decode("#9CAEA9"));
		this.bHabitaciones = new JButton("Habitaciones");
		bHabitaciones.setFont(font);
		bHabitaciones.setBackground(Color.decode("#9CAEA9"));
		this.bReservas = new JButton("Reservas");
		bReservas.setFont(font);
		bReservas.setBackground(Color.decode("#9CAEA9"));
		this.bServicios = new JButton("Servicios");
		bServicios.setFont(font);
		bServicios.setBackground(Color.decode("#9CAEA9"));
		this.bFactura = new JButton("Factura");
		bFactura.setFont(font);
		bFactura.setBackground(Color.decode("#9CAEA9"));
		
		this.add(this.bUsuario);
		this.add(this.bHabitaciones);
		this.add(this.bReservas);
		this.add(this.bServicios);
		this.add(this.bFactura);
		
		
		
	}
	
	
	
	

}