public class Main {
    public static void main(String[] args) {
        SmartPhone xiaomiRedmiNote7 = new SmartPhone(6.24, 64, 5000, 4, "Android 12", true);
        SmartWatch xiaomiWatch = new SmartWatch(2.1, 32, 2350, 32, "Android SM 5", true);
        System.out.println("Xiaomi Redmi 7:\nPantalla: " + xiaomiRedmiNote7.pantalla + "\nMemoria interna: " + xiaomiRedmiNote7.memoriaInterna);
        System.out.println("\nXiaomi Watch:\nPantalla: " + xiaomiWatch.pantalla + "\nMemoria interna: " + xiaomiWatch.memoriaInterna);
    }
}