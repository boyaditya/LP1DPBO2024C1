# Saya Boy Aditya Rohmaulana NIM 2203488 mengerjakan
# soal Latihan Praktikum 1 dalam mata kuliah DPBO
# untuk keberkahanNya maka saya tidak melakukan kecurangan seperti yang telah dispesifikasikan. Aamiin

class AnggotaDPR:
    # attributes
    __id = ""
    __nama = ""
    __nama_bidang = ""
    __nama_partai = ""
    
    # constructor
    def __init__(self, id="", nama="", nama_bidang="", nama_partai=""):
        self.__id = id
        self.__nama = nama
        self.__nama_bidang = nama_bidang
        self.__nama_partai = nama_partai

    # getter and setter 
    def get_nama(self):
        return self.__nama

    def set_nama(self, nama):
        self.__nama = nama

    def get_nama_partai(self):
        return self.__nama_partai

    def set_nama_partai(self, nama_partai):
        self.__nama_partai = nama_partai

    def get_nama_bidang(self):
        return self.__nama_bidang

    def set_nama_bidang(self, nama_bidang):
        self.__nama_bidang = nama_bidang

    def get_id(self):
        return self.__id

    def set_id(self, id):
        self.__id = id
