public class SmartWatch extends SmartDevice{

    public SmartWatch() {

    }

    public SmartWatch(double pantalla, int memoriaInterna, int bateria, int memoriaRAM, String sistemaOperativo, boolean ranuraSD){
        this.pantalla = pantalla;
        this.memoriaInterna = memoriaInterna;
        this.bateria = bateria;
        this.memoriaRAM = memoriaRAM;
        this.sistemaOperativo = sistemaOperativo;
        this.ranuraSD = ranuraSD;
    }
}
