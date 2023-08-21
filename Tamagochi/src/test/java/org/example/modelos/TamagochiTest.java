package org.example.modelos;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class TamagochiTest {
    @Before
    public void inicializacion() {
        Tamagochi tamagochi = new Tamagochi("prueba");
        System.out.println("inicializanoo");
    }



    @Test
    public void comer() {
        Tamagochi tamagochi = new Tamagochi("prueba");
        tamagochi.jugar();
        assertEquals(2,tamagochi.getNivel());

    }

    @Test
    public void jugar() {
        assertEquals(2,1);
    }
}