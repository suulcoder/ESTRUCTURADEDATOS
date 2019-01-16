/*

AparatoRadial.java

java version 1.8.0_191

18/01/2018

Saul Contreras Godoy 18409
Radio Hoja de trabajo 1
Algoritmos y estructura de datos
Clase aparato radial que implimenta la Interfaz Radio
*/

public class AparatoRadial implements Radio{

	private boolean estado;
	private boolean frequency;
	private double station;
	private double maxFM;
	private double minFM;
	private double maxAM;
	private double minAM;
	private double[] preferences;

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

	public void toggle(){//Permite cambiar el estado de encendido a apagado y viceversa
		
		if (this.estado==false){
			this.estado=true;
		}
		else if(this.estado==true){
			this.estado=false;
		}
	}

	public boolean getState(){//permite obtener el estado de la radio

		return(this.estado);

	}

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

	public boolean getFrequency(){//Devuelve la frecuencia actual del radio

		return(this.frequency);

	}

	public void saveStation(int numButton){//Permite guardar la estacion favorita

		preferences[numButton-1] = this.station;
		
	}

	public void changeStationButton(int numButton){//Permite seleccionar la estación de preferencia

		this.station = preferences[numButton-1];
		
	}
	
	public double getStation(){//Permite obtener la estación actual del radio

		return(this.station);

	}
}