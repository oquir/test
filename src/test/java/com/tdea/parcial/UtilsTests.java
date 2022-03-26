package com.tdea.parcial;

import io.cucumber.java.en.Given;
import org.junit.jupiter.api.Test;

import javax.rmi.CORBA.Util;

public class UtilsTests {

    @Test
    public void blankTest() {
       String invalido = Utils.getTimeOfDay(29);
       String mediaNoche = Utils.getTimeOfDay(4);
       String mañana = Utils.getTimeOfDay(7);
       String tarde = Utils.getTimeOfDay(16);
       String noche = Utils.getTimeOfDay(20);
    }


}
