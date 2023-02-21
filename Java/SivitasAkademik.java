class SivitasAkademik
{
    private String asal_univ;
    private String email_edu;

    public SivitasAkademik()
    {
        this.asal_univ = "";
        this.email_edu = "";
    }

    public String getasal_univ(){
        return this.asal_univ;
    }
    public void setasal_univ(String asal_univ){
        this.asal_univ = asal_univ; 
    }

    public String getemail_edu(){
        return this.email_edu;
    }
    public void setemail_edu(String email_edu){
        this.email_edu = email_edu;
    }
}