

public class MainApp {
    public static void main(String [] args) {
        Perangkat perangkat = new Perangkat("lowvie", 10, 1.80f);
        perangkat.informasi();

        System.out.println();

    
        Laptop laptop = new Laptop("PJH", 8, 2.40f, true);
        laptop.informasi();
        laptop.bukaGame("Game Treasure");
        laptop.kirimEmail("teume@gmail.com");
        laptop.kirimEmail("teume@gmail.com", "teumeina@mail.com");

        System.out.println();

        Handphone hp = new Handphone("Watanabe", 3, 2.20f, false);
        hp.informasi();
        hp.telfon(62180402);
        hp.kirimSMS(62373821);
        hp.kirimSMS(62567812, 62899123);
    }
}