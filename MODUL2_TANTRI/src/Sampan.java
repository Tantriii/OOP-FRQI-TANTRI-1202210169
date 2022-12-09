public class Sampan extends TransportasiAir {

    protected int layar; // attribute
    
    
    //constructor 
    public Sampan (int jumlahKursi, int biaya, int layar){
        super(jumlahKursi,biaya);
        this.layar = layar;
    }
     
    @Override 
    // method void informasi 
    public void informasi(){
        System.out.println("Transportasi Air jenis sampan dengan kursi berjumlah"+ jumlahKursi + " ditetapkan dengan biaya sebesar Rp."+ biaya );
    }

    @Override
     // method void berlayar
    public void  berlayar(){
        System.out.println("Transportasi Air dengan jenis yang sampan sedang berlayar menggunakan"+ layar + " "+ "layar");
    }

    @Override
    // method void berlabuh
    public void  berlabuh(){
        System.out.println("Transportasi Air dengan jenis yang sampan berlabuh dipantai tanpa jangkar");
    }

    // method void berlabuh
    public void berlabuh(int
    jangkar){
        System.out.println("Transportasi Air dengan jenis yang sampan berlabuh dipantai menggunakan" + jangkar + " "+"jangkar");
    }
}
