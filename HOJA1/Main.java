/*

Main.java

java version 1.8.0_191

18/01/2018

Saul Contreras Godoy 18409
Radio Hoja de trabajo 1
Algoritmos y estructura de datos
Main con GUI
*/


import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Main extends JFrame implements ActionListener{
	
	private JButton encendido;//ON/OFF
	private JButton frecuencia;//AM/FM
	private JButton plus;//boton que permite cambiar de frecuencia
	private JButton minus;//boton que permite cambiar de frecuencia
	private JButton b1 = new JButton(" 01 ");
	private JButton b2 = new JButton(" 02 ");
	private JButton b3 = new JButton(" 03 ");
	private JButton b4 = new JButton(" 04 ");
	private JButton b5 = new JButton(" 05 ");
	private JButton b6 = new JButton(" 06 ");
	private JButton b7 = new JButton(" 07 ");
	private JButton b8 = new JButton(" 08 ");
	private JButton b9 = new JButton(" 09 ");
	private JButton b10 = new JButton(" 10 ");
	private JButton b11 = new JButton(" 11 ");
	private JButton b12 = new JButton(" 12 ");
	private JButton save1 = new JButton("save1");
	private JButton save2 = new JButton("save2");
	private JButton save3 = new JButton("save3");
	private JButton save4 = new JButton("save4");
	private JButton save5 = new JButton("save5");
	private JButton save6 = new JButton("save6");
	private JButton save7 = new JButton("save7");
	private JButton save8 = new JButton("save8");
	private JButton save9 = new JButton("save9");
	private JButton save10 = new JButton("save10");
	private JButton save11 = new JButton("save11");
	private JButton save12 = new JButton("save12");
	private JLabel nombre;//etiqueta
	private JTextField estado;//nos dice el estado de la radio
	private JTextField nFrecuencia;
    private JTextField estacion;//Poner frecuencias
    private Panel panelEntrada, panelCentro, panelSalida;//Paneles para reagrupar
    private JPanel panelDeLaVentana;
    private Radio radio = new AparatoRadial();

	/**
	 * Permite correr una interfaz gráfica para un Radio.
	 */
    public Main(){
    	
    	/*Las siguientes lineas de codigo permiten que se pueda trabajar con 
    	interfaz Grafica, aca se le da nombres a los botones y nombres claves
    	para comandos*/

    	super("Radio");
    	encendido = new JButton("ON/OFF");
    	encendido.setActionCommand("encendido");//palabra clave para cambiar el estado
    	frecuencia = new JButton("AM/FM");
    	frecuencia.setActionCommand("frecuencia");//palabra clave para cambiar frecuencia
       	plus = new JButton("+");
    	plus.setActionCommand("plus");
    	minus = new JButton("-");
    	minus.setActionCommand("minus");
		b1.setActionCommand("1");
    	b2.setActionCommand("2");
    	b3.setActionCommand("3");
    	b4.setActionCommand("4");
    	b5.setActionCommand("5");
    	b6.setActionCommand("6");
    	b7.setActionCommand("7");
    	b8.setActionCommand("8");
    	b9.setActionCommand("9");
    	b10.setActionCommand("10");
    	b11.setActionCommand("11");
    	b12.setActionCommand("12");
    	save1.setActionCommand("save1");
    	save2.setActionCommand("save2");
    	save3.setActionCommand("save3");
    	save4.setActionCommand("save4");
    	save5.setActionCommand("save5");
    	save6.setActionCommand("save6");
    	save7.setActionCommand("save7");
    	save8.setActionCommand("save8");
    	save9.setActionCommand("save9");
    	save10.setActionCommand("save10");
    	save11.setActionCommand("save11");
    	save12.setActionCommand("save12");
    	nFrecuencia = new JTextField();
    	nombre = new JLabel(" Radio ");//etiqueta
    	estado = new JTextField();//Imprime y evalua el estado del radio

    	if (radio.getState()==true){
    		estado.setText("ON");
    	}

    	else{
    		estado.setText("OFF");
    	}

		if (radio.getFrequency()==true){
    		nFrecuencia.setText("AM");
    	}   	

    	else{
    		nFrecuencia.setText("FM");
    	}

		encendido.addActionListener(this);//Permite que sea editable
        frecuencia.addActionListener(this);
        plus.addActionListener(this);
        minus.addActionListener(this);
        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        b4.addActionListener(this);
        b5.addActionListener(this);
        b6.addActionListener(this);
        b7.addActionListener(this);
        b8.addActionListener(this);
        b9.addActionListener(this);
        b10.addActionListener(this);
        b11.addActionListener(this);
        b12.addActionListener(this);
        save1.addActionListener(this);
        save2.addActionListener(this);
        save3.addActionListener(this);
        save4.addActionListener(this);
        save5.addActionListener(this);
        save6.addActionListener(this);
        save7.addActionListener(this);
        save8.addActionListener(this);
        save9.addActionListener(this);
        save10.addActionListener(this);
        save11.addActionListener(this);
        save12.addActionListener(this);
     	estacion = new JTextField(20);
     	estacion.setText(String.format("%.1f", radio.getStation()));
     	panelEntrada = new Panel();//los siguientes paneles son para poner orden y estetica
     	panelCentro = new Panel();
     	panelSalida = new Panel();
     	panelDeLaVentana = (JPanel)this.getContentPane();
     	panelEntrada.add(encendido,BoxLayout.X_AXIS);
     	panelEntrada.add(estado,BoxLayout.X_AXIS);
     	panelEntrada.add(plus,BoxLayout.X_AXIS);
     	panelEntrada.add(estacion,BoxLayout.X_AXIS);
     	panelEntrada.add(minus,BoxLayout.X_AXIS);
     	panelEntrada.add(nFrecuencia,BoxLayout.X_AXIS);
     	panelEntrada.add(frecuencia,BoxLayout.X_AXIS);
     	panelCentro.add(b12,BoxLayout.X_AXIS);
     	panelCentro.add(b11,BoxLayout.X_AXIS);
     	panelCentro.add(b10,BoxLayout.X_AXIS);
     	panelCentro.add(b9,BoxLayout.X_AXIS);
     	panelCentro.add(b8,BoxLayout.X_AXIS);
     	panelCentro.add(b7,BoxLayout.X_AXIS);
     	panelCentro.add(b6,BoxLayout.X_AXIS);
     	panelCentro.add(b5,BoxLayout.X_AXIS);
     	panelCentro.add(b4,BoxLayout.X_AXIS);
     	panelCentro.add(b3,BoxLayout.X_AXIS);
     	panelCentro.add(b2,BoxLayout.X_AXIS);
     	panelCentro.add(b1,BoxLayout.X_AXIS);
     	panelSalida.add(save12,BoxLayout.X_AXIS);
     	panelSalida.add(save11,BoxLayout.X_AXIS);
     	panelSalida.add(save10,BoxLayout.X_AXIS);
     	panelSalida.add(save9,BoxLayout.X_AXIS);
     	panelSalida.add(save8,BoxLayout.X_AXIS);
     	panelSalida.add(save7,BoxLayout.X_AXIS);
     	panelSalida.add(save6,BoxLayout.X_AXIS);
     	panelSalida.add(save5,BoxLayout.X_AXIS);
     	panelSalida.add(save4,BoxLayout.X_AXIS);
     	panelSalida.add(save3,BoxLayout.X_AXIS);
     	panelSalida.add(save2,BoxLayout.X_AXIS);
     	panelSalida.add(save1,BoxLayout.X_AXIS);
        panelDeLaVentana.add(panelEntrada,BorderLayout.NORTH);
    	panelDeLaVentana.add(panelCentro,BorderLayout.CENTER);
        panelDeLaVentana.add(panelSalida,BorderLayout.SOUTH);
    }


	/**
	 * Da acciones a los botones de la interfaz gráfica
	 * @param e Evento obtenido por la acción del usuario
	 */
    public void actionPerformed(ActionEvent e){
    	
    	/*Definimos acciones para cada uno de los botones anteriormente nombrados*/

    	if("encendido".equals(e.getActionCommand())){
    		radio.toggle();

    		if (radio.getState()==true){
    			estado.setText("ON");
	    	}

	    	else{
	    		estado.setText("OFF");
	    	}
    	}

    	if(radio.getState()){
    		if("frecuencia".equals(e.getActionCommand())){
	    		radio.changeFrequency();
	    		if (radio.getFrequency()==true){
		    		nFrecuencia.setText("AM");
		    	}   	
		    	else{
		    		nFrecuencia.setText("FM");
		    	}
	    	}

	    	else if("plus".equals(e.getActionCommand())){

	    		radio.changeStation(true);
				estacion.setText(String.format("%.1f", radio.getStation()));   		
	    	}

	    	else if("minus".equals(e.getActionCommand())){
	    		radio.changeStation(false);
	    		estacion.setText(String.format("%.1f", radio.getStation()));
	    	}
	    	//Un for para las 12 botones save. 
	    	for(int i=1;i<13;i++){
	    		String str = "save"+String.valueOf(i);
	    		if(String.valueOf(i).equals(e.getActionCommand())){
		    		radio.changeStationButton(i);
		    		if(radio.getStation()==0){
		    			radio.changeFrequency();
		    		}
		    		estacion.setText(String.format("%.1f",radio.getStation()));
		    	}

		    	else if(str.equals(e.getActionCommand())){
		    		radio.saveStation(i);
	    		}	
	    	}	
    	}

    	else{
    		estacion.setText("POR FAVOR ENCIENDA SU RADIO");
    	}

    }

    public static void main(String[] arg){
    	
    	/*Imprimimos la ventana en la pantalla*/
    	
    	Main miAplicacion = new Main();
     	miAplicacion.setBounds(10,10,200,200);
    	miAplicacion.pack();
    	miAplicacion.setVisible(true);
    }
}