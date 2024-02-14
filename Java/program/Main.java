/*Saya Boy Aditya Rohmaulana NIM 2203488 mengerjakan
soal Latihan Praktikum 1 dalam mata kuliah DPBO
untuk keberkahanNya maka saya tidak melakukan kecurangan seperti yang telah dispesifikasikan. Aamiin.*/

package praktikum.lp1.Java.program;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<AnggotaDPR> listAnggota = new ArrayList<>(); // list untuk menyimpan data anggota
        int fitur = 0, flag;
        String id, nama, namaBidang, namaPartai;

        while (fitur != 5) {
            System.out.println("========= Fitur =========");
            System.out.println("1. Tambah Data Anggota DPR");
            System.out.println("2. Ubah Data Anggota DPR");
            System.out.println("3. Hapus Data Anggota DPR");
            System.out.println("4. Tampilkan Daftar Anggota DPR");
            System.out.println("5. Keluar\n");
            
            System.out.print("Pilih fitur : ");
            fitur = scanner.nextInt();

            if (fitur == 1) { // tambah data
                System.out.println("== Tambah Data Anggota DPR ==");
                System.out.print("ID : ");
                id = scanner.next();

                flag = 0;
                // cek apakah id sudah ada
                for (AnggotaDPR anggota : listAnggota) {
                    if (anggota.getId().equals(id)) {
                        System.out.println("ID sudah ada\n");
                        flag = 1;
                        break;
                    }
                }

                // jika id belum ada
                if (flag == 0) {
                    System.out.print("Nama : ");
                    nama = scanner.next();
                    System.out.print("Nama Bidang : ");
                    namaBidang = scanner.next();
                    System.out.print("Nama Partai : ");
                    namaPartai = scanner.next();

                    AnggotaDPR anggota = new AnggotaDPR(id, nama, namaBidang, namaPartai);
                    listAnggota.add(anggota);
                    System.out.println("Data berhasil ditambahkan\n");
                }

            } else if (fitur == 2) { // ubah data
                System.out.println("== Ubah Data Anggota DPR ==");
                // masukkan id yang akan diubah
                System.out.print("Masukkan ID yang akan diubah : ");
                id = scanner.next();

                flag = 0;

                // cari data yang akan diubah
                for (AnggotaDPR anggota : listAnggota) {
                    if (anggota.getId().equals(id)) {

                        System.out.print("Nama : ");
                        nama = scanner.next();
                        System.out.print("Nama Bidang : ");
                        namaBidang = scanner.next();
                        System.out.print("Nama Partai : ");
                        namaPartai = scanner.next();

                        anggota.setNama(nama);
                        anggota.setNamaBidang(namaBidang);
                        anggota.setNamaPartai(namaPartai);
                        flag = 1;
                    }
                }

                if (flag == 0) {
                    System.out.println("ID tidak ditemukan\n");
                } else {
                    System.out.println("Data berhasil diubah\n");
                }

            } else if (fitur == 3) { // hapus data
                System.out.println("== Hapus Data Anggota DPR ==");
                System.out.print("Masukkan ID yang akan dihapus : ");
                id = scanner.next();

                flag = 0;
                // cari data yang akan dihapus
                for (Iterator<AnggotaDPR> iterator = listAnggota.iterator(); iterator.hasNext();) {
                    AnggotaDPR anggota = iterator.next();
                    if (anggota.getId().equals(id)) {
                        iterator.remove();
                        flag = 1;
                        break;
                    }
                }

                if (flag == 0) {
                    System.out.println("ID tidak ditemukan\n");
                } else {
                    System.out.println("Data berhasil dihapus\n");
                }

            } else if (fitur == 4) { // tampilkan data
                // buat array untuk isi tabel
                String[][] isi = new String[listAnggota.size() + 1][4];

                System.out.println("== Daftar Anggota DPR ==");

                // nama kolom
                isi[0][0] = "ID";
                isi[0][1] = "Nama Anggota";
                isi[0][2] = "Nama Bidang";
                isi[0][3] = "Nama Partai";
                
                // isi tabel dari listAnggota
                int i = 1;
                for (AnggotaDPR anggota : listAnggota) {
                    isi[i][0] = anggota.getId();
                    isi[i][1] = anggota.getNama();
                    isi[i][2] = anggota.getNamaBidang();
                    isi[i][3] = anggota.getNamaPartai();
                    i++;
                }
                
                Tabel tabel = new Tabel();
                tabel.setBaris(listAnggota.size() + 1);
                tabel.setKolom(4);
                tabel.buatTabel(isi);

                System.out.println("\n");

            } else if (fitur == 5) { // keluar
                System.out.println("Keluar\n");
            } else { // memilih angka selain yang ada di fitur
                System.out.println("Fitur tidak ada\n");
            }
        }

        scanner.close();
    }
}