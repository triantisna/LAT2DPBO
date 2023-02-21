class Mahasiswa extends SivitasAkademik
{
    private String NIM;
    private String nama;
    private String jenis_kelamin;
    private String fakultas;
    private String prodi;

    public Mahasiswa()
    {
        this.NIM = "";
        this.nama = "";
        this.jenis_kelamin = "";
        this.fakultas = "";
        this.prodi = "";
    }

    public String getNIM(){
        return this.NIM;
    }
    public void setNIM(String NIM){
        this.NIM = NIM; 
    }

    public String getnama(){
        return this.nama;
    }
    public void setnama(String nama){
        this.nama = nama; 
    }

    public String getfakultas(){
        return this.fakultas;
    }
    public void setfakultas(String fakultas){
        this.fakultas = fakultas; 
    }

     public String getprodi(){
        return this.prodi;
    }
    public void setprodi(String prodi){
        this.prodi = prodi; 
    }

    public String getjenis_kelamin(){
        return this.jenis_kelamin;
    }
    public void setjenis_kelamin(String jenis_kelamin){
        this.jenis_kelamin = jenis_kelamin;
    }

}