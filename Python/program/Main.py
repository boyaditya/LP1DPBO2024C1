# Saya Boy Aditya Rohmaulana NIM 2203488 mengerjakan
# soal Latihan Praktikum 1 dalam mata kuliah DPBO
# untuk keberkahanNya maka saya tidak melakukan kecurangan seperti yang telah dispesifikasikan. Aamiin

from AnggotaDPR import AnggotaDPR
from Tabel import Tabel

list_anggota = [] # list untuk menyimpan data anggota
fitur = 0 # fitur yang dipilih

while fitur != 5:
    print("========= Fitur =========")
    print("1. Tambah Data Anggota DPR")
    print("2. Ubah Data Anggota DPR")
    print("3. Hapus Data Anggota DPR")
    print("4. Tampilkan Daftar Anggota DPR")
    print("5. Keluar\n\n")

    fitur = int(input("Pilih fitur: "))
    print("\n")

    if fitur == 1:  # tambah data
        print("== Tambah Data Anggota DPR ==")
        id = input("ID : ")

        flag = 0
        # cek apakah id sudah ada
        for a in list_anggota:
            if a.get_id() == id:
                print("ID sudah ada\n\n")
                flag = 1
                break

        # jika id belum ada
        if flag == 0:
            nama = input("Nama : ")
            nama_bidang = input("Nama Bidang : ")
            nama_partai = input("Nama Partai : ")

            anggota = AnggotaDPR(id, nama, nama_bidang, nama_partai)
            list_anggota.append(anggota)
            print("\nData berhasil ditambahkan\n\n")

    elif fitur == 2:  # ubah data
        print("== Ubah Data Anggota DPR ==")
        id = input("Masukkan ID yang akan diubah : ")

        flag = 0
        
        # cari data yang akan diubah
        for anggota in list_anggota:
            if anggota.get_id() == id:
                nama = input("Nama : ")
                nama_bidang = input("Nama Bidang : ")
                nama_partai = input("Nama Partai : ")

                anggota.set_nama(nama)
                anggota.set_nama_bidang(nama_bidang)
                anggota.set_nama_partai(nama_partai)
                flag = 1

        if flag == 0:
            print("\nID tidak ditemukan\n\n")
        else:
            print("\nData berhasil diubah\n\n")

    elif fitur == 3:  # hapus data
        print("== Hapus Data Anggota DPR ==")
        id = input("Masukkan ID yang akan dihapus : ")

        flag = 0
        # cari data yang akan dihapus
        for anggota in list_anggota:
            if anggota.get_id() == id:
                list_anggota.remove(anggota)
                flag = 1
                break

        if flag == 0:
            print("\nID tidak ditemukan\n\n")
        else:
            print("\nData berhasil dihapus\n\n")

    elif fitur == 4:  # tampilkan data
        print("== Daftar Anggota DPR ==")
        # nama kolom
        isi = [["ID", "Nama Anggota", "Nama Bidang", "Nama Partai"]]

        # isi tabel dari listAnggota
        for anggota in list_anggota:
            isi.append([anggota.get_id(), anggota.get_nama(), anggota.get_nama_bidang(), anggota.get_nama_partai()])

        tabel = Tabel(len(list_anggota) + 1, 4)
        tabel.buat_tabel(isi)
        print("\n\n")

    elif fitur == 5:  # keluar
        print("\nKeluar\n\n")

    else:  # memilih angka selain yang ada di fitur
        print("\nFitur tidak ada\n\n")
