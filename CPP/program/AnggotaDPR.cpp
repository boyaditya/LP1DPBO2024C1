/*Saya Boy Aditya Rohmaulana NIM 2203488 mengerjakan
soal LP1 dalam mata kuliah DPBO
untuk keberkahanNya maka saya tidak melakukan kecurangan seperti yang telah dispesifikasikan. Aamiin.*/

#include <iostream>
#include <string>

using namespace std;

class AnggotaDPR {
    private:
        int id;
        string nama;
        string nama_bidang;
        string nama_partai;

    public:
        AnggotaDPR(){
            this->id = 0;
            this->nama = "";
            this->nama_partai = "";
            this->nama_bidang = "";
        }

        AnggotaDPR(int id, string nama, string nama_bidang, string nama_partai){
            this->id = id;
            this->nama = nama;
            this->nama_bidang = nama_bidang;
            this->nama_partai = nama_partai;
        }

        string get_nama(){
            return this->nama;
        }

        void set_nama(string nama){
            this->nama = nama;
        }

        string get_nama_partai(){
            return this->nama_partai;
        }

        void set_nama_partai(string nama_partai){
            this->nama_partai = nama_partai;
        }

        string get_nama_bidang(){
            return this->nama_bidang;
        }

        void set_nama_bidang(string nama_bidang){
            this->nama_bidang = nama_bidang;
        }

        int get_id(){
            return this->id;
        }

        void set_id(int id){
            this->id = id;
        }

        ~AnggotaDPR(){
        }
};