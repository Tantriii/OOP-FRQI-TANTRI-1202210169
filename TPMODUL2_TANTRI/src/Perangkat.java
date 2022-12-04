
public class Perangkat {

    // attribute 
    protected String drive; 
    protected int ram; 
    protected float processor; 

    //constructor 
    public Perangkat (String drive, int ram, float processor){
        this.drive = drive;
        this.ram = ram; 
        this.processor = processor;
    }

    // method void informasi  
    public void informasi(){
        System.out.println("Perangkat tidak diketahui memiliki drive tipe" + " " + drive + " dengan ram sebesar" + " " + ram + " "+"GB dan processor secepat" + " " + processor + " " +"GHZ");
        
    }


}
