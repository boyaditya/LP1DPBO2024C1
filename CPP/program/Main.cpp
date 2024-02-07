/*Saya Boy Aditya Rohmaulana NIM 2203488 mengerjakan
soal LP1 dalam mata kuliah DPBO
untuk keberkahanNya maka saya tidak melakukan kecurangan seperti yang telah dispesifikasikan. Aamiin.*/

#include "AnggotaDPR.cpp"
#include <bits/stdc++.h>
using namespace std;

int main() {
    int fitur = 0;
    int id;
    string nama, nama_bidang, nama_partai;
    list<AnggotaDPR> llist;

    while (fitur != 5) {
        cout << "========= Fitur =========" << endl;
        cout << "1. Tambah Data Anggota DPR" << endl;
        cout << "2. Ubah Data Anggota DPR" << endl;
        cout << "3. Hapus Data Anggota DPR" << endl;
        cout << "4. Tampilkan Daftar Anggota DPR" << endl;
        cout << "5. Keluar" << endl
             << endl;
        cin >> fitur;

        if (fitur == 1) { // tambah data
            cout << "== Tambah Data Anggota DPR ==" << endl;
            cout << "ID : ";
            cin >> id;
            cout << "Nama : ";
            cin >> nama;
            cout << "Nama Bidang : ";
            cin >> nama_bidang;
            cout << "Nama Partai : ";
            cin >> nama_partai;

            AnggotaDPR anggota(id, nama, nama_bidang, nama_partai);
            llist.push_back(anggota);
            cout << "Data berhasil ditambahkan" << endl
                 << endl;

        } else if (fitur == 2) { // ubah data
            cout << "== Ubah Data Anggota DPR ==" << endl;
            cout << "ID : ";
            cin >> id;

            for (list<AnggotaDPR>::iterator it = llist.begin(); it != llist.end(); it++) {
                if (it->get_id() == id) {

                    cout << "Nama : ";
                    cin >> nama;
                    cout << "Nama Bidang : ";
                    cin >> nama_bidang;
                    cout << "Nama Partai : ";
                    cin >> nama_partai;

                    it->set_nama(nama);
                    it->set_nama_bidang(nama_bidang);
                    it->set_nama_partai(nama_partai);
                }
            }

            cout << "Data berhasil diubah" << endl
                 << endl;
        } else if (fitur == 3) { // hapus data
            cout << "== Hapus Data Anggota DPR ==" << endl;
            cout << "ID : ";
            cin >> id;

            for (list<AnggotaDPR>::iterator it = llist.begin(); it != llist.end(); it++) {
                if (it->get_id() == id) {
                    llist.erase(it);
                    break;
                }
            }

            cout << "Data berhasil dihapus" << endl
                 << endl;
        } else if (fitur == 4) { // tampilkan data

            cout << "== Daftar Anggota DPR ==" << endl;
            int i = 0;
            for (list<AnggotaDPR>::iterator it = llist.begin(); it != llist.end(); it++) {
                cout << (i + 1) << ". " << it->get_id() << " | " << it->get_nama() << " | " << it->get_nama_bidang() << " | " << it->get_nama_partai() << endl;
                i++;
            }

            cout << endl
                 << endl;
        } else if (fitur == 5) { // keluar
            cout << "Keluar" << endl
                 << endl;
        } else {
            cout << "Fitur tidak tersedia" << endl
                 << endl;
        }
    }

    return 0;
}
