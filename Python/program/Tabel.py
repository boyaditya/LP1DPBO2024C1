# Saya Boy Aditya Rohmaulana NIM 2203488 mengerjakan
# soal Latihan Praktikum 1 dalam mata kuliah DPBO
# untuk keberkahanNya maka saya tidak melakukan kecurangan seperti yang telah dispesifikasikan. Aamiin

class Tabel:
    # attribute
    __baris = 0
    __kolom = 0
    
    # constructor
    def __init__(self, baris=0, kolom=0):
        self.__baris = baris
        self.__kolom = kolom

    # setter and getter
    def get_baris(self):
        return self.__baris
    
    def set_baris(self, baris):
        self.__baris = baris
        
    def get_kolom(self):
        return self.__kolom
    
    def set_kolom(self, kolom):
        self.__kolom = kolom

    # method untuk buat garis
    def buat_garis(self, max_len):
        for i in range(self.__kolom):
            print("+", end="")
            for j in range(max_len[i] + 2):
                print("-", end="")
        print("+")

    # method untuk mencari panjang maksimum dari setiap kolom
    def find_max_len(self, isi, max_len):
        for i in range(self.__kolom):
            max_len[i] = 0
            for j in range(self.__baris):
                if len(isi[j][i]) > max_len[i]:
                    max_len[i] = len(isi[j][i])

    # method untuk membuat tabel
    def buat_tabel(self, isi):
        max_len = [0] * self.__kolom

        self.find_max_len(isi, max_len)

        self.buat_garis(max_len)

        for j in range(self.__kolom):
            print("| " + isi[0][j], end="")
            for k in range(max_len[j] - len(isi[0][j])):
                print(" ", end="")
            print(" ", end="")
        print("|")

        self.buat_garis(max_len)

        for i in range(1, self.__baris):
            for j in range(4):
                print("| " + isi[i][j], end="")
                for k in range(max_len[j] - len(isi[i][j])):
                    print(" ", end="")
                print(" ", end="")
            print("|")

        self.buat_garis(max_len)
