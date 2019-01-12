import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Main extends JFrame implements ActionListener{
	
	private JButton encendido;//ON/OFF
	private JButton frecuencia;//AM/FM
	private JLabel nombre;//etiqueta
	private JLabel estado;//nos dice el estado de la radio
    private JTextField campo1;//Poner frecuencias
    private Panel panelEntrada, panelSalida;//Paneles para reagrupar
    private JPanel panelDeLaVentana;
    private Radio radio = new AparatoRadial();
    
    public Main(){
    	
    	encendido = new JButton("ON/OFF");
    	encendido.setActionCommand("encendido");//palabra clave para cambiar el estado

    	frecuencia = new JButton("AM/FM");
    	frecuencia.setActionCommand("frecuencia");//palabra clave para cambiar frecuencia

    	nombre = new JLabel(" Radio ");//etiqueta

        encendido.addActionListener(this);//Permite que sea editable
        frecuencia.addActionListener(this);
     	campo1 = new JTextField();
     	panelEntrada = new Panel();//nos permite poner orden
     	panelSalida = new Panel();
     	panelDeLaVentana = (JPanel)this.getContentPane();
     	panelEntrada.add(encendido,BoxLayout.X_AXIS);
     	panelEntrada.add(estado,BoxLayout.X_AXIS);
     	panelEntrada.add(frecuencia,BoxLayout.X_AXIS);
        panelDeLaVentana.add(panelEntrada,BorderLayout.NORTH);
    	panelDeLaVentana.add(campo1,BorderLayout.CENTER);
        panelDeLaVentana.add(panelSalida,BorderLayout.SOUTH);
    }
    

    public void actionPerformed(ActionEvent e){
    	
    	if("encendido".equals(e.getActionCommand())){
    		radio.toggle();
    	}
    }
    
    public static void main(String[] arg){
    	
    	Main miAplicacion = new Main();
     	miAplicacion.setBounds(10,10,200,200);
    	miAplicacion.pack();
    	miAplicacion.setVisible(true);
    }
}