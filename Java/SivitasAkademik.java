public class SivitasAkademik
{
    private String asal_univ;
    private String email_edu;

    public SivitasAkademik(){
        this.asal_univ = "";
        this.email_edu = "";
    }

    public String get_asal_univ(){
        return this.asal_univ;
    }
    public void set_asal_univ(String asal_univ){
        this.asal_univ = asal_univ; 
    }

    public String get_email_edu(){
        return this.email_edu;
    }
    public void set_email_edu(String email_edu){
        this.email_edu = email_edu;
    }
}