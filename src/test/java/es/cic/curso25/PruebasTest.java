package es.cic.curso25;

import org.junit.jupiter.api.Test;

public class PruebasTest {

    @Test
    public void lanzame(){
        boolean valor = true;
        char letra = 'a';
        char letra2 = "b".charAt(0);

        Coche miCoche2 = new Coche();
        Object miChoche = miCoche2;

        Camion miCamion = new Camion();
        miCamion.meterCarga(0);
        
        GruaDelPuerto miGrua = new GruaDelPuerto();
        miGrua.meterCarga(0);

        Object referencia = miGrua;
        referencia.toString();
        referencia = miCamion;
        referencia.toString();
        //Casteo
        ((GruaDelPuerto) referencia).meterCarga(0);

    }
     public void acelerarRemotamente(Coche coche, int incremento) {
            coche.acelerar(incremento);
        }

        public void acelerarRemotamente(Camion camion, int incremento) {
            camion.acelerar(incremento);
        }
}
