public class SmartPhone extends SmartDevice{

    public SmartPhone() {

    }

    public SmartPhone(double pantalla, int memoriaInterna, int bateria, int memoriaRAM, String sistemaOperativo, boolean ranuraSD){
        this.pantalla = pantalla;
        this.memoriaInterna = memoriaInterna;
        this.bateria = bateria;
        this.memoriaRAM = memoriaRAM;
        this.sistemaOperativo = sistemaOperativo;
        this.ranuraSD = ranuraSD;
    }
}
