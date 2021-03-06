/*

AparatoRadial.java

java version 1.8.0_191

18/01/2018

Saul Contreras Godoy 18409
Radio Hoja de trabajo 1
Algoritmos y estructura de datos
INTERFAZ DE RADIO
*/

/**
 * Interfaz para implementar un objeto tipo radio
 */
public interface Radio{//interfaz radio: Permite ser utilizada.

	public void toggle();//Permite cambiar el estado de encendido a apagado y viceversa

	public boolean getState();//permite obtener el estado de la radio

	public void changeFrequency();//Permite cambiar la frecuencia de AM A FM

	public void changeStation(boolean up);//Permite cambiar la estacion de la radio

	public boolean getFrequency();//Devuelve la frecuencia actual del radio

	public void saveStation(int numButton);//Permite guardar la estacion favorita

	public void changeStationButton(int numButton);//Permite seleccionar la estación de preferencia

	public double getStation();//Permite obtener la estación actual del radio

}