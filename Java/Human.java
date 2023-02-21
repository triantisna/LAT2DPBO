public class Human
{
    private String NIK;
    private String nama;
    private String jenis_kelamin;

    public Human(){
        this.NIK = "";
        this.nama = "";
        this.jenis_kelamin = "";
    }

    public String get_NIK(){
        return this.NIK;
    }
    public void set_NIK(String NIK){
        this.NIK = NIK; 
    }

    public String get_nama(){
        return this.nama;
    }
    public void set_nama(String nama){
        this.nama = nama; 
    }

    public String get_jenis_kelamin(){
        return this.jenis_kelamin;
    }
    public void set_jenis_kelamin(String jenis_kelamin){
        this.jenis_kelamin = jenis_kelamin;
    }
}