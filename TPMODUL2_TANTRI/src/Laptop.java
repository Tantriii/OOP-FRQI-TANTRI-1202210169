
public class Laptop extends Perangkat {
    protected boolean webcam ; // attribute

    //constructor 
    public Laptop (String drive, int ram, float processor,
    boolean webcam){
        super(drive, ram, processor);
        this.webcam = webcam; 
    }

    //overriding method informasi dari class Perangkat
    @Override 
    public void informasi(){
        System.out.println("Laptop ini memiliki drive tipe" + " "+ drive + " "+ "dengan ram sebesar" + " "+ ram + "GB dan processor secepat" + " " + processor + " "+"GHZ. Selain itu Laptop ini" + (webcam == false ? "memiliki " : " juga memiliki ") + "webcam");
    }
    
    // method void bukaGame
    public void bukaGame(String nama_game){
        System.out.println("Laptop berhasil membuka" +" "+ nama_game);
    }
     // method void kirimEmail
     public void kirimEmail(String email){
        System.out.println("Laptop berhasil mengirim email ke" +" " + email);
    }

    // method void kirimEmail
    public void kirimEmail(String email1, String email2){
        System.out.println("Laptop berhasil mengirim email ke" + " " + email1 + "dan ke" +" "+ email2 );
    }
}
