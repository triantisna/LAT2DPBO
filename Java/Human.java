class Human extends Mahasiswa
{
    private String NIK;
    private String nama;
    private String jenis_kelamin;

    public Human()
    {
        this.NIK = "";
        this.nama = "";
        this.jenis_kelamin = "";
    }

    public String getNIK(){
        return this.NIK;
    }
    public void setNIK(String NIK){
        this.NIK = NIK; 
    }

    public String getnama(){
        return this.nama;
    }
    public void setnama(String nama){
        this.nama = nama; 
    }

    public String getjenis_kelamin(){
        return this.jenis_kelamin;
    }
    public void setjenis_kelamin(String jenis_kelamin){
        this.jenis_kelamin = jenis_kelamin;
    }
}