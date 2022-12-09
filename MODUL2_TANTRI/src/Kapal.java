public class Kapal extends TransportasiAir {
    protected String mesin; // attribute
    
    
    //constructor 
    public Kapal (int jumlahKursi, int biaya, String mesin){
        super(jumlahKursi,biaya);
        this.mesin = mesin;
    }
     
    @Override 
    // method void informasi 
    public void informasi(){
        System.out.println("Transportasi Air jenis Kapal dengan kursi berjumlah"+ jumlahKursi + " ditetapkan dengan biaya sebesar Rp."+ biaya);
    }

    @Override
     // method void berlayar
    public void  berlayar(){
        System.out.println("Transportasi Air dengan jenis yang kapal sedang berlayar menggunakan"+ "mesin"+"dengan kecepatan yang tidak stabil");
    }

    // method void berlayar2
    public void berlayar(int kecepatan){
        System.out.println("Transportasi Air dengan jenis yang kapal sedang berlayar menggunakan"+"mesin dengan kecepatan stabil di kisaran"+ mesin + " knot");
    }

    @Override
    // method void berlabuh
    public void   berlabuh(){
        System.out.println("Transportasi Air jenis kapal berlabuh di pantai");
    }
}
