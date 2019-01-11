
//Saul Contreras Godoy 18409
//Radio Hoja de trabajo 1
//Algoritmos y estructura de datos
//Clase aparato radial que implimenta la Interfaz Radio


public class AparatoRadial implements Radio{

	private boolean estado = false;
	private boolean frequency = false;
	private double station = 87.9;
	private double maxFM = 107.9
	private double minFM = 87.9
	private double maxAM = 1610
	private double minAM = 530
	private double[] preferencesFM = new double[12]
	private double[] preferencesAM = new double[12]


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
		}
		else if(this.frequency==true){
			this.frequency=false;
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

		if(this.frequency==false){
			preferencesFM[numButton] = this.station;
		}
		else if(this.frequency==true){
			preferencesAM[numButton] = this.station;
		}
	}

	public void changeStationBUtton(int numButton){//Permite seleccionar la estación de preferencia

		if (this.frequency=false){
			this.station = preferencesFM[numButton];
		}
		else if(this.frequency=true){
			this.station = preferencesAM[numButton];
		}
	}
	
	public double getStation(){//Permite obtener la estación actual del radio

		return(this.station);

	}
}