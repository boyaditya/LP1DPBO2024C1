<!--
Saya Boy Aditya Rohmaulana NIM 2203488 mengerjakan
soal Latihan Praktikum 1 dalam mata kuliah DPBO
untuk keberkahanNya maka saya tidak melakukan kecurangan seperti yang telah dispesifikasikan. Aamiin 
-->

<?php
class Tabel
{   
    // attribute
    private $baris;
    private $kolom;

    // constructor
    public function __construct($baris = 0, $kolom = 0)
    {
        $this->baris = $baris;
        $this->kolom = $kolom;
    }

    // getter and setter
    public function getBaris()
    {
        return $this->baris;
    }

    public function setBaris($baris)
    {
        $this->baris = $baris;
    }

    public function getKolom()
    {
        return $this->kolom;
    }

    public function setKolom($kolom)
    {
        $this->kolom = $kolom;
    }

    // method untuk membuat tabel
    public function buatTabel($isi)
    {
        echo "<style>
        table {
                font-family: arial, sans-serif;
                border-collapse: collapse;
        }

        td, th {
            border: 1px solid black;
            padding: 8px;
        }

        </style>";
        echo "<h2>Daftar Anggota DPR</h2>";

        echo "<table>";
        for ($i = 0; $i < $this->getBaris(); $i++) {
            echo "<tr>";
            for ($j = 0; $j < $this->getKolom(); $j++) {
                if ($i == 0) {
                    echo "<th>";
                    echo $isi[$i][$j];
                    echo "</th>";
                } else {
                    echo "<td>";
                    echo $isi[$i][$j];
                    echo "</td>";
                }
            }
            echo "</tr>";
        }
        echo "</table>";
        echo "<br>";
    }
}
