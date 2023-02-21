#include <bits/stdc++.h>
#include "Mahasiswa.cpp"

using namespace std;

class Human : public Mahasiswa{
    
    private:
        string NIK;
        string nama;
        string jenis_kelamin;

    public:
        Human(){
            this->NIK = "";
            this->nama = "";
            this->jenis_kelamin = "";
        }

        void set_NIK(string NIK){
            this->NIK = NIK;
        }

        string get_NIK(){
            return this->NIK;

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
};