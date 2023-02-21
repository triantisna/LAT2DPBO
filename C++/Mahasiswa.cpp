#include <bits/stdc++.h>
#include "SivitasAkademik.cpp"

using namespace std;

class Mahasiswa : public SivitasAkademik{
    
    private:
        string NIM;
        string nama;
        string jenis_kelamin;
        string fakultas;
        string prodi;

    public:
        Mahasiswa(){
            this->NIM = "";
            this->nama = "";
            this->jenis_kelamin = "";
            this->fakultas = "";
            this->prodi = "";
        }

        void set_NIM(string NIM){
            this->NIM = NIM;
        }

        string get_NIM(){
            return this->NIM;
        }

        void set_nama(string nama){
            this->nama = nama;
        }

        string get_nama(){
            return this->nama;
        }

        void set_jenis_kelamin(string jenis_kelamin){
            this->jenis_kelamin = jenis_kelamin;
        }

        string get_jenis_kelamin(){
            return this->jenis_kelamin;
        }

        void set_fakultas(string fakultas){
            this->fakultas = fakultas;
        }

        string get_fakultas(){
            return this->fakultas;
        }

        void set_prodi(string prodi){
            this->prodi = prodi;
        }

        string get_prodi(){
            return this->prodi;
        }
};