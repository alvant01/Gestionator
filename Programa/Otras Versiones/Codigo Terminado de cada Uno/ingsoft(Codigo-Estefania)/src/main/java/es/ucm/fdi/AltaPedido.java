package es.ucm.fdi;

import es.ucm.fdi.datos.MetodoDePago;
import es.ucm.fdi.integracion.*;

public class AltaPedido
{
	
	
	
	
    public static void main( String[] args )
 
    {
       /* // Inicializar datos
    	es.ucm.fdi.datos.BDMemoria<es.ucm.fdi.integracion.TPedido> BDPedidos = new es.ucm.fdi.datos.BDMemoria<es.ucm.fdi.integracion.TPedido>();
    	// Esto es un ejemplo
    	es.ucm.fdi.datos.BDMemoria<String> tablaCadena=new es.ucm.fdi.datos.BDMemoria<String>();
    	tablaCadena.insert("dato1","1");
    	tablaCadena.insert("dato2", "2");    	
    	System.out.println(tablaCadena);
    	
    	// Inicializar integración
    	
    	//es.ucm.fdi.datos.DAOPedido DAOAltaPedido = new es.ucm.fdi.datos.DAOPedidoImp();
        // TODO
    	*/
    	// Inicializar negocio
    	es.ucm.fdi.aplicationservice.GestionPedidos ASAltaPedido =  new es.ucm.fdi.aplicationservice.GestionPedidos();
        // TODO
    	//es.ucm.fdi.datos.ASGestionPedidoImp ASGestionPedido = es.ucm.fdi.datos.ASGestionPedidoImp.
    	// Inicializar presentacion
    	
        // TODO    	
    	ASAltaPedido.obtencionDeDatos();
    	
    	if (ASAltaPedido.ValidarDatos())
    	{
    		
    		//llamar a la creacion del codigo; 
    		ASAltaPedido.CalculoDeTarifas();
    		ASAltaPedido.buscarSucursal();
    		ASAltaPedido.crearPuntoControl();
    		//Comprobar que el pago se ha realizado correctamente(if (correcto) insetro el pedido en la base de datos)
    		ASAltaPedido.crearPuntoControl();
    	}
    	else
    	{
    		System.out.println("Datos invalidos");
    	}
        
    }
    
}

