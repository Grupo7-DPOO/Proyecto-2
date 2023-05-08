package Vista;

import javax.swing.*;

import Clases.Restaurante;
import Clases.Plato;

import java.awt.*;

public class PServicios extends JDialog{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private FPrincipal fPrincipal;
    private JButton AgregarPlato;
    private JButton AgregarMenu;

    private JButton HacerPedido;
    private JButton CrearPlato;
    private JButton ConsultarPlatos;
    
    private JTextField Id;
    private JTextField Nombre;
    private JTextField Ingredientes;
    private JTextField Cantidad_Ing;
    
    
    private JPanel pBotones;

    
   public PServicios(FPrincipal fPrincipal) {
        this.setfPrincipal(fPrincipal);
        this.setTitle("Servicios");
        this.setSize(400, 300);
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        this.setLayout(new BorderLayout());

        pBotones = new JPanel();
        
        pBotones.setLayout(new GridLayout(2, 2));
        pBotones.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));

        AgregarPlato = new JButton("Agregar Plato");
        AgregarMenu = new JButton("Agregar Menu");
        HacerPedido = new JButton("Hacer Pedido");
      
        HacerPedido.addActionListener(e -> {
            PAgregarPlato();
        });
        pBotones.add(AgregarPlato);
        pBotones.add(AgregarMenu);
        pBotones.add(HacerPedido);
        

        //this.add(pCampos, BorderLayout.CENTER);
        this.add(pBotones, BorderLayout.CENTER);
    }

   private void PAgregarPlato() {

       if (pBotones != null) {
           pBotones.removeAll();
           
           pBotones.setLayout(new GridLayout(5,2));

           pBotones.add(new JLabel("Id"));
           Id = (JTextField) pBotones.add(new JTextField());
           
           pBotones.add(new JLabel("Nombre"));
           Nombre = (JTextField) pBotones.add(new JTextField());
           
           pBotones.add(new JLabel("Ingredientes"));
           Ingredientes = (JTextField) pBotones.add(new JTextField());
           
           pBotones.add(new JLabel("Cantidad Ingredientes"));
           Cantidad_Ing = (JTextField) pBotones.add(new JTextField());
           
           CrearPlato = new JButton("Crear Plato");
           CrearPlato.addActionListener(e -> {
               crearPlato();
           });
           pBotones.add(CrearPlato);
           
           ConsultarPlatos = new JButton("Consultar Platos");
           ConsultarPlatos.addActionListener(e -> {
               consultarPlato();
           });
           pBotones.add(ConsultarPlatos);
           
           this.revalidate(); // se actualiza el contenedor PServicios
       } else {
           System.out.println("Error: pBotones es null");
       }
   }

     
    
	private void consultarPlato() {
		Restaurante restaurante = new Restaurante();
		System.out.println(restaurante.consultarPlatos());
}

	private void crearPlato() {
        int id = Integer.parseInt(Id.getText());
        System.out.println(id);
        String nombre = Nombre.getText();
        System.out.println(nombre);
        String ingredientes = Ingredientes.getText();
        System.out.println(ingredientes);
        int cantidad_ingredientes = Integer.parseInt(Cantidad_Ing.getText());
        System.out.println(cantidad_ingredientes);

        Restaurante restaurante = new Restaurante();
        restaurante.crearPlato(id, nombre, ingredientes, cantidad_ingredientes);
	}

	public FPrincipal getfPrincipal() {
		return fPrincipal;
	}

	public void setfPrincipal(FPrincipal fPrincipal) {
		this.fPrincipal = fPrincipal;
	}
}
