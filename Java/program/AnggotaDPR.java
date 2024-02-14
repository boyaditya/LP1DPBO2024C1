/*Saya Boy Aditya Rohmaulana NIM 2203488 mengerjakan
soal Latihan Praktikum 1 dalam mata kuliah DPBO
untuk keberkahanNya maka saya tidak melakukan kecurangan seperti yang telah dispesifikasikan. Aamiin.*/

package praktikum.lp1.Java.program;

public class AnggotaDPR {
    private String id;
    private String nama;
    private String namaBidang;
    private String namaPartai;

    // constructor
    public AnggotaDPR() {
        this.id = "";
        this.nama = "";
        this.namaBidang = "";
        this.namaPartai = "";
    }

    public AnggotaDPR(String id, String nama, String namaBidang, String namaPartai) {
        this.id = id;
        this.nama = nama;
        this.namaBidang = namaBidang;
        this.namaPartai = namaPartai;
    }

    // getter and setter
    public String getNama() {
        return this.nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getNamaPartai() {
        return this.namaPartai;
    }

    public void setNamaPartai(String namaPartai) {
        this.namaPartai = namaPartai;
    }

    public String getNamaBidang() {
        return this.namaBidang;
    }

    public void setNamaBidang(String namaBidang) {
        this.namaBidang = namaBidang;
    }

    public String getId() {
        return this.id;
    }

    public void setId(String id) {
        this.id = id;
    }
}