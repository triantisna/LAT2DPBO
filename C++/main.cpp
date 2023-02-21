#include <bits/stdc++.h>
#include "Human.cpp"

using namespace std;

int main(){
    Human Trian;
    Trian.set_nama("Trian");
    Trian.set_NIM("2001408");
    Trian.set_NIK("000112333");
    Trian.set_jenis_kelamin("Laki-Laki");
    Trian.set_email_edu("triannih@email.edu");
    Trian.set_asal_univ("UPI");
    Trian.set_fakultas("Depilkom");
    Trian.set_prodi("Ilmu Komputer");

    cout << '\n' << ">> Data Mahasiswa Cumlaude <<" << '\n';
    cout << "Nama        : " << Trian.get_nama() << "\n";
    cout << "NIM         : " << Trian.get_NIM() << "\n";
    cout << "NIK         : " << Trian.get_NIK() << "\n";
    cout << "Kelamin     : " << Trian.get_jenis_kelamin() << "\n";
    cout << "E-Mail      : " << Trian.get_email_edu() << "\n";
    cout << "Universitas : " << Trian.get_asal_univ() << "\n";
    cout << "Fakultas    : " << Trian.get_fakultas() << "\n";
    cout << "Prodi       : " << Trian.get_prodi() << "\n";

    return 0;
}