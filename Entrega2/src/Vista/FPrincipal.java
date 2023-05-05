package Vista;
import java.awt.BorderLayout;

import javax.swing.JFrame;


public class FPrincipal extends JFrame{

	private static final long serialVersionUID = 1L;
	private PFactura pFactura;
	private PHabitaciones pHabitaciones;
	private PReservas pReservas;
	private PServicios pServicios;
	private PUsuario pUsuario;
	
	public PFactura getpFactura() {
		return pFactura;
	}
	public PHabitaciones getpHabitaciones() {
		return pHabitaciones;
	}
	public PReservas getpReservas() {
		return pReservas;
	}

	public PServicios getpServicios() {
		return pServicios;
	}

	public PUsuario getpUsuario() {
		return pUsuario;
	}

	public FPrincipal() {
		this.setTitle("Property Managment System");
		this.setSize(1920,1080);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setLayout(new BorderLayout());
		
		this.pUsuario = new PUsuario();
		
		this.pHabitaciones = new PHabitaciones();
		
		this.pFactura = new PFactura();
		
		this.pReservas = new PReservas();
		
		this.pServicios = new PServicios();
	}
	
}
