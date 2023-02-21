public class Mahasiswa
{
    private String NIM;
    private String nama;
    private String jenis_kelamin;
    private String fakultas;
    private String prodi;

    public Mahasiswa(){
        this.NIM = "";
        this.nama = "";
        this.jenis_kelamin = "";
        this.fakultas = "";
        this.prodi = "";
    }

    public String get_NIM(){
        return this.NIM;
    }
    public void set_NIM(String NIM){
        this.NIM = NIM; 
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

    public String get_fakultas(){
        return this.fakultas;
    }
    public void set_fakultas(String fakultas){
        this.fakultas = fakultas; 
    }

     public String get_prodi(){
        return this.prodi;
    }
    public void set_prodi(String prodi){
        this.prodi = prodi; 
    }

}