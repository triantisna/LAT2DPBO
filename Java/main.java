import java.util.Scanner;
import java.util.ArrayList;

public class main
{
    public static void main(String[] args){
        Human Trian = new Human();
        Trian.set_nama("Trian");
        Trian.set_NIM("2001408");
        Trian.set_NIK("000112333");
        Trian.set_jenis_kelamin("Laki-Laki");
        Trian.set_email_edu("triannih@email.edu");
        Trian.set_asal_univ("UPI");
        Trian.set_fakultas("Depilkom");
        Trian.set_prodi("Ilmu Komputer");

        System.out.printIn(">> Data Mahasiswa Cumlaude <<");
        System.out.printIn("Nama        :" + Trian.get_nama());
        System.out.printIn("NIM         :" + Trian.get_NIM());
        System.out.printIn("NIK         :" + Trian.get_NIK());
        System.out.printIn("Kelamin     :" + Trian.get_jenis_kelamin());
        System.out.printIn("E-Mail      :" + Trian.get_jenis_kelamin());
        System.out.printIn("Universitas :" + Trian.get_asal_univ());
        System.out.printIn("Fakultas    :" + Trian.get_fakultas());
        System.out.printIn("Prodi       :" + Trian.get_prodi());
    }
}