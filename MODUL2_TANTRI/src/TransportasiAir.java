public class TransportasiAir{

    // attribute 
    protected int jumlahKursi; 
    protected int biaya; 

    //constructor 
    public TransportasiAir(int jumlahKursi, int biaya){
        this.jumlahKursi = jumlahKursi;
        this.biaya = biaya; 
    }

    // method void informasi 
    public void informasi(){
        System.out.println("Transportasi Air jenis tidak diketahui dengan kursi berjumlah"+ jumlahKursi + " ditetapkan dengan biaya sebesar Rp."+ biaya);
    }

    // method void berlayar
    public void  berlayar(){
        System.out.println("Transportasi Air dengan jenis yang tidak diketahui sedang berlayar");
    }

    // method void berlabuh
    public void   berlabuh(){
        System.out.println("Transportasi Air dengan jenis yang tidak diketahui berlabuh dipantai" );
    }
}
