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
    
    public Main(){
    	
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
        plus.addActionListener(this);
        minus.addActionListener(this);
     	estacion = new JTextField();
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
	    	for (int i=1;i<13;i++){
	    		String control = "save"+Integer.toString(i);
	    		System.out.println(Integer.toString(i));
	    		System.out.println(control);
	    		if(Integer.toString(i).equals(e.getActionCommand())){
	    			radio.changeStationButton(i);
	    			estacion.setText(String.format("%.1f",radio.getStation()));
	    		}
	    		else if(control.equals(e.getActionCommand())){
	    			radio.saveStation(i);
	    		}
	    	}	
    	}
    	else{
    		estacion.setText("Esta apagado");
    	}

    }
    
    public static void main(String[] arg){
    	
    	Main miAplicacion = new Main();
     	miAplicacion.setBounds(10,10,200,200);
    	miAplicacion.pack();
    	miAplicacion.setVisible(true);
    }
}