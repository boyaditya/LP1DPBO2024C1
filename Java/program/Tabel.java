/*Saya Boy Aditya Rohmaulana NIM 2203488 mengerjakan
soal Latihan Praktikum 1 dalam mata kuliah DPBO
untuk keberkahanNya maka saya tidak melakukan kecurangan seperti yang telah dispesifikasikan. Aamiin.*/

package praktikum.lp1.Java.program;

public class Tabel {
    private int baris;
    private int kolom;

    /* constructor */
    Tabel() {
    }

    Tabel(int baris, int kolom) {
        this.baris = baris;
        this.kolom = kolom;
    }

    /* getter and setter */
    public int getBaris() {
        return this.baris;
    }

    public void setBaris(int baris) {
        this.baris = baris;
    }

    public int getKolom() {
        return this.kolom;
    }

    public void setKolom(int kolom) {
        this.kolom = kolom;
    }

    // method untuk membuat garis
    private void buatGaris(int maxLen[]) {
        for (int i = 0; i < getKolom(); i++) {
            System.out.print("+");
            for (int j = 0; j < maxLen[i] + 2; j++) {
                System.out.print("-");
            }
        }
        System.out.println("+");
    }

    // method untuk mencari panjang maksimum dari setiap kolom
    private void findMaxLen(String[][] isi, int maxLen[]) {
        for (int i = 0; i < getKolom(); i++) {
            maxLen[i] = 0;
            for (int j = 0; j < getBaris(); j++) {
                if (isi[j][i].length() > maxLen[i]) {
                    maxLen[i] = isi[j][i].length();
                }
            }
        }
    }

    // method untuk membuat tabel
    public void buatTabel(String[][] isi) {
        int maxLen[] = new int[getKolom()];

        // cari panjang maksimum dari setiap kolom
        findMaxLen(isi, maxLen);
        
        buatGaris(maxLen);
        
        // tampilkan nama kolom
        for (int j = 0; j < getKolom(); j++) {
            System.out.print("| " + isi[0][j]);
            for (int k = 0; k < maxLen[j] - isi[0][j].length(); k++) {
                System.out.print(" ");
            }
            System.out.print(" ");
        }
        System.out.println("|");

        buatGaris(maxLen);

        // tampilkan anggota DPR
        for (int i = 1; i < getBaris(); i++) {

            for (int j = 0; j < 4; j++) {
                System.out.print("| " + isi[i][j]);
                for (int k = 0; k < maxLen[j] - isi[i][j].length(); k++) {
                    System.out.print(" ");
                }
                System.out.print(" ");
            }
            System.out.println("|");
        }

        buatGaris(maxLen);
    }

}
