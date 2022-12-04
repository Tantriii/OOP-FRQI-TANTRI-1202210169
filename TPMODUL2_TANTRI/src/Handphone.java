
public class Handphone extends Perangkat {
    protected boolean fingerprint; // attribute

    //constructor 
    public Handphone (String drive, int ram, float processor,
    boolean fingerprint){
        super(drive, ram, processor);
        this.fingerprint = fingerprint; 
 
    }
    //overriding method informasi dari class Perangkat
    @Override
    public void informasi() {
    
        System.out.println("Handphone ini memiliki drive tipe" + " "+ drive + " "+ "dengan ram sebesar" +" "+ ram + " "+"GB dan processor secepat" +" " +processor + " "+ "GHZ. Selain itu handphone ini" + " "+
        (fingerprint == false ? "Tidak memiliki " : "memiliki ") + "fingeprint");
    }

    // method void telfon
    public void telfon(int no_hp){
        System.out.println("Handphone berhasil menyambungkan telfon ke no" +" "+ no_hp);
    }

    // method void kirimSMS
    public void kirimSMS(int no_hp){
        System.out.println("Handphone berhasil mengirim SMS ke no" +" "+ no_hp);

    }
    // method void kirimSMS
    public void kirimSMS(int no_hp1, int no_hp2){
        System.out.println("Handphone berhasil mengirim SMS ke no" +" " + no_hp1 + " dan ke no" + " " + no_hp2);
    }

}
