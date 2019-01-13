import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Main extends JFrame implements ActionListener{
	
	private JButton encendido;//ON/OFF
	private JButton frecuencia;//AM/FM
	private JLabel nombre;//etiqueta
	private JTextField estado;//nos dice el estado de la radio
	private JTextField nFrecuencia;
    private JTextField estacion;//Poner frecuencias
    private Panel panelEntrada, panelSalida;//Paneles para reagrupar
    private JPanel panelDeLaVentana;
    private Radio radio = new AparatoRadial();
    
    public Main(){
    	
    	encendido = new JButton("ON/OFF");
    	encendido.setActionCommand("encendido");//palabra clave para cambiar el estado

    	frecuencia = new JButton("AM/FM");
    	frecuencia.setActionCommand("frecuencia");//palabra clave para cambiar frecuencia

    	nombre = new JLabel(" Radio ");//etiqueta
    	estado = new JTextField();//Imprime y evalua el estado del radio

    	if (radio.getState()==true){
    		estado.setText("ON");
    	}
    	else{
    		estado.setText("OFF");
    	}

    	nFrecuencia = new JTextField();

    	if (radio.getFrequency()==true){
    		nFrecuencia.setText("AM");
    	}   	
    	else{
    		nFrecuencia.setText("FM");
    	}


        encendido.addActionListener(this);//Permite que sea editable
        frecuencia.addActionListener(this);
     	estacion = new JTextField();
     	panelEntrada = new Panel();//nos permite poner orden
     	panelSalida = new Panel();
     	panelDeLaVentana = (JPanel)this.getContentPane();
     	panelEntrada.add(encendido,BoxLayout.X_AXIS);
     	panelEntrada.add(estado,BoxLayout.X_AXIS);
     	panelEntrada.add(nFrecuencia,BoxLayout.X_AXIS);
     	panelEntrada.add(frecuencia,BoxLayout.X_AXIS);
        panelDeLaVentana.add(panelEntrada,BorderLayout.NORTH);
    	panelDeLaVentana.add(estacion,BorderLayout.CENTER);
        panelDeLaVentana.add(panelSalida,BorderLayout.SOUTH);
    }
    

    public void actionPerformed(ActionEvent e){
    	
    	if("encendido".equals(e.getActionCommand())){
    		radio.toggle();
    		if (radio.getState()==true){
    			estado.setText("ON");
	    	}
	    	else{
	    		estado.setText("OFF");
	    	}
    	}

    	else if("frecuencia".equals(e.getActionCommand())){
    		radio.changeFrequency();
    		if (radio.getFrequency()==true){
	    		nFrecuencia.setText("AM");
	    	}   	
	    	else{
	    		nFrecuencia.setText("FM");
	    	}
    	}
    }
    
    public static void main(String[] arg){
    	
    	Main miAplicacion = new Main();
     	miAplicacion.setBounds(10,10,200,200);
    	miAplicacion.pack();
    	miAplicacion.setVisible(true);
    }
}