public class AppQueUsaTv {
    public static void main(String args[]){
        Televisao tv = new Televisao("Samsung", 60, 110, "4k");

        tv.ligar();
        tv.escolherCanal(32);
        tv.aumentarVolume();
        tv.aumentarVolume();
        tv.aumentarVolume();
    }
}