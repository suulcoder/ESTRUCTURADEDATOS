/*

AparatoRadial.java

java version 1.8.0_191

18/01/2018

Saul Contreras Godoy 18409
Radio Hoja de trabajo 1
Algoritmos y estructura de datos
Clase AparatoRadial que permite probar los metodos
*/
package com.company;

import static org.junit.Assert.*;

public class AparatoRadialTest {

    AparatoRadial radio = new AparatoRadial();

    @org.junit.Test
    public void getState() {
        radio.toggle();
        assertEquals(false,radio.getState());
    }

    @org.junit.Test
    public void getFrequency() {
        radio.changeFrequency();
        assertEquals(true,radio.getFrequency());
    }

   @org.junit.Test
    public void getStation() {
        radio.changeStation(true);
        assertEquals(88.1,radio.getStation(),radio.getStation());
    }
}
