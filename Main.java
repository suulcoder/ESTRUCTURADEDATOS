import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Main extends JFrame implements ActionListener{
	
	private JButton encendido;//ON/OFF
	private JButton frecuencia;//AM/FM
	private JButton plus;//boton que permite cambiar de frecuencia
	private JButton minus;//boton que permite cambiar de frecuencia
	private JButton save;
	private JButton fm1 = new JButton("FM1");
	private JButton fm2 = new JButton("FM2");
	private JButton fm3 = new JButton("FM3");
	private JButton fm4 = new JButton("FM4");
	private JButton fm5 = new JButton("FM5");
	private JButton fm6 = new JButton("FM6");
	private JButton fm7 = new JButton("FM7");
	private JButton fm8 = new JButton("FM8");
	private JButton fm9 = new JButton("FM9");
	private JButton fm10 = new JButton("FM10");
	private JButton fm11 = new JButton("FM11");
	private JButton fm12 = new JButton("FM12");
	private JButton am1 = new JButton("AM1");
	private JButton am2 = new JButton("AM2");
	private JButton am3 = new JButton("AM3");
	private JButton am4 = new JButton("AM4");
	private JButton am5 = new JButton("AM5");
	private JButton am6 = new JButton("AM6");
	private JButton am7 = new JButton("AM7");
	private JButton am8 = new JButton("AM8");
	private JButton am9 = new JButton("AM9");
	private JButton am10 = new JButton("AM10");
	private JButton am11 = new JButton("AM11");
	private JButton am12 = new JButton("AM12");
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

    	save = new JButton("Guardar");
    	save.setActionCommand("save");
    	plus = new JButton("+");
    	plus.setActionCommand("plus");
    	minus = new JButton("-");
    	minus.setActionCommand("minus");
    	fm1.setActionCommand("fm1");
    	fm2.setActionCommand("fm2");
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
     	panelEntrada.add(nombre,BoxLayout.X_AXIS);
     	panelEntrada.add(nFrecuencia,BoxLayout.X_AXIS);
     	panelEntrada.add(frecuencia,BoxLayout.X_AXIS);

     	panelCentro.add(save,BoxLayout.X_AXIS);
     	panelCentro.add(plus,BoxLayout.X_AXIS);
     	panelCentro.add(estacion,BoxLayout.X_AXIS);
     	panelCentro.add(minus,BoxLayout.X_AXIS);

     	panelSalida.add(fm12,BoxLayout.X_AXIS);
     	panelSalida.add(fm11,BoxLayout.X_AXIS);
     	panelSalida.add(fm10,BoxLayout.X_AXIS);
     	panelSalida.add(fm9,BoxLayout.X_AXIS);
     	panelSalida.add(fm8,BoxLayout.X_AXIS);
     	panelSalida.add(fm7,BoxLayout.X_AXIS);
     	panelSalida.add(fm6,BoxLayout.X_AXIS);
     	panelSalida.add(fm5,BoxLayout.X_AXIS);
     	panelSalida.add(fm4,BoxLayout.X_AXIS);
     	panelSalida.add(fm3,BoxLayout.X_AXIS);
     	panelSalida.add(fm2,BoxLayout.X_AXIS);
     	panelSalida.add(fm1,BoxLayout.X_AXIS);
     	panelSalida.add(am12,BoxLayout.X_AXIS);
     	panelSalida.add(am11,BoxLayout.X_AXIS);
     	panelSalida.add(am10,BoxLayout.X_AXIS);
     	panelSalida.add(am9,BoxLayout.X_AXIS);
     	panelSalida.add(am8,BoxLayout.X_AXIS);
     	panelSalida.add(am7,BoxLayout.X_AXIS);
     	panelSalida.add(am6,BoxLayout.X_AXIS);
     	panelSalida.add(am5,BoxLayout.X_AXIS);
     	panelSalida.add(am4,BoxLayout.X_AXIS);
     	panelSalida.add(am3,BoxLayout.X_AXIS);
     	panelSalida.add(am2,BoxLayout.X_AXIS);
     	panelSalida.add(am1,BoxLayout.X_AXIS);


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

    	else if("frecuencia".equals(e.getActionCommand())){
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


    }
    
    public static void main(String[] arg){
    	
    	Main miAplicacion = new Main();
     	miAplicacion.setBounds(10,10,200,200);
    	miAplicacion.pack();
    	miAplicacion.setVisible(true);
    }
}