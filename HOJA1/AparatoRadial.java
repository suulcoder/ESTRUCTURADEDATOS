/*

AparatoRadial.java

java version 1.8.0_191

18/01/2018

Saul Contreras Godoy 18409
Radio Hoja de trabajo 1
Algoritmos y estructura de datos
Clase aparato radial que implimenta la Interfaz Radio
*/

/**
 * Esta clase implementa la interfaz Radio.
 */
public class AparatoRadial implements Radio{

	/**
	 * El estado de la radio. ON/OFF
	 */
	private boolean estado;
	/**
	 * El tipo de frecuencia en el que se encuentra AM/FM
	 */
	private boolean frequency;
	/**
	 * La estacion en la que se encuentra
	 */
	private double station;
	/**
	 * Es la estación máxima que puede alcanzar el FM
	 */
	private double maxFM;
	/**
	 * Es la estación minima que puede alcanzar el FM
	 */
	private double minFM;
	/**
	 * Es la estación máxima que puede alcanzar el AM
	 */
	private double maxAM;
	/**
	 * Es la estación minima que puede alcanzar el AM
	 */
	private double minAM;
	/**
	 * Array que guarda las estaciones en los botones de referencia
	 */
	private double[] preferences;

	/**
	 * Constructor, define los valores de las variables de instancia
	 */
	public AparatoRadial(){
		this.estado = false;
		this.frequency = false;
		this.station = 87.9;
		this.maxFM = 107.9;
		this.minFM = 87.9;
		this.maxAM = 1610;
		this.minAM = 530;
		this.preferences = new double[12];
	}

	/**
	 * Cambia el estado en el que se encuentra la radio ON=true, OFF=false
	 */
	public void toggle(){//Permite cambiar el estado de encendido a apagado y viceversa
		
		if (this.estado==false){
			this.estado=true;
		}
		else if(this.estado==true){
			this.estado=false;
		}
	}

	/**
	 * Obtener el estado de la radio
	 * @return el estado de la radio
	 */
	public boolean getState(){//permite obtener el estado de la radio

		return(this.estado);

	}

	/**
	 * Cambia la frecuencia AM=true, FM=false
	 */
	public void changeFrequency(){//Permite cambiar la frecuencia de AM A FM
		
		if (this.frequency==false){
			this.frequency=true;
			this.station=minAM;
		}
		else if(this.frequency==true){
			this.frequency=false;
			this.station=minFM;
		}

	}

	/**
	 * Cambia la estacion en la que e encuentra
	 * @param up true=para subir false=para bajar
	 */
	public void changeStation(boolean up){//Permite cambiar la estacion de la radio

		if (up==true && this.frequency==true){
			this.station=this.station+10;
			if(this.station>maxAM){
				this.station=minAM;
			}
		}
		else if(up==true && this.frequency==false){
			this.station=this.station+0.2;
			if(this.station>maxFM){
				this.station=minFM;
			}
		}
		else if(up==false && this.frequency==true){
			this.station=this.station-10;
			if(this.station<minAM){
				this.station=maxAM;
			}
		}
		else if(up==false && this.frequency==false){
			this.station=station-0.2;
			if(this.station<minFM){
				this.station=maxFM;
			}
		}
	}

	/**
	 * Obtener la frecuencia de la radio
	 * @return la frecuencia de la radio AM/FM
	 */
	public boolean getFrequency(){//Devuelve la frecuencia actual del radio

		return(this.frequency);

	}

	/**
	 * Guarda la estacion de un boton de preferencia
	 * @param numButton Numero de boton
	 */
	public void saveStation(int numButton){//Permite guardar la estacion favorita

		preferences[numButton-1] = this.station;
		
	}

	/**
	 * Cambia la estacion, a la estaición de preferencia
	 * @param numButton Numero de botón
	 */
	public void changeStationButton(int numButton){//Permite seleccionar la estación de preferencia

		this.station = preferences[numButton-1];
		
	}

	/**
	 * Obtiene la estación
	 * @return la estación actual
	 */
	public double getStation(){//Permite obtener la estación actual del radio

		return(this.station);

	}
}