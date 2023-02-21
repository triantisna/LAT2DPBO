#include <iostream>
#include <string>

using namespace std;

class SivitasAkademik{
    
    private:
        string asal_univ;
        string email_edu;

    public:
        SivitasAkademik(){
            this->asal_univ = "";
            this->email_edu = "";
        }

        void set_asal_univ(string asal_univ){
            this->asal_univ = asal_univ;
        }

        string get_asal_univ(){
            return this->asal_univ;

        }

        void set_email_edu(string email_edu){
            this->email_edu = email_edu;
        }

        string get_email_edu(){
            return this->email_edu;
        }
};