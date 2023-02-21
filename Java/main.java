import java.util.Scanner;
import java.util.ArrayList;

public class Main
{
    public static void main(String[] args){
        Human Trian = new Human();
        Trian.setnama("Trian");
        Trian.setNIM("2001408");
        Trian.setNIK("000112333");
        Trian.setjenis_kelamin("Laki-Laki");
        Trian.setemail_edu("triannih@email.edu");
        Trian.setasal_univ("UPI");
        Trian.setfakultas("Depilkom");
        Trian.setprodi("Ilmu Komputer");

        System.out.println(">> Data Mahasiswa Cumlaude <<");
        System.out.println("Nama        :" + Trian.getnama());
        System.out.println("NIM         :" + Trian.getNIM());
        System.out.println("NIK         :" + Trian.getNIK());
        System.out.println("Kelamin     :" + Trian.getjenis_kelamin());
        System.out.println("E-Mail      :" + Trian.getjenis_kelamin());
        System.out.println("Universitas :" + Trian.getasal_univ());
        System.out.println("Fakultas    :" + Trian.getfakultas());
        System.out.println("Prodi       :" + Trian.getprodi());
    }
}