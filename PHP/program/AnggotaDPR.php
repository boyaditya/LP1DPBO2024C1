<!--
Saya Boy Aditya Rohmaulana NIM 2203488 mengerjakan
soal Latihan Praktikum 1 dalam mata kuliah DPBO
untuk keberkahanNya maka saya tidak melakukan kecurangan seperti yang telah dispesifikasikan. Aamiin 
-->

<?php
class AnggotaDPR
{   
    // attribute
    private $id;
    private $nama;
    private $namaBidang;
    private $namaPartai;
    private $foto;

    // constructor
    public function __construct($id = "", $nama = "", $namaBidang = "", $namaPartai = "", $foto = "")
    {
        $this->id = $id;
        $this->nama = $nama;
        $this->namaBidang = $namaBidang;
        $this->namaPartai = $namaPartai;
        $this->foto = $foto;
    }

    // getter and setter
    public function getId()
    {
        return $this->id;
    }

    public function setId($id)
    {
        $this->id = $id;
    }
    public function getNama()
    {
        return $this->nama;
    }

    public function setNama($nama)
    {
        $this->nama = $nama;
    }

    public function getNamaBidang()
    {
        return $this->namaBidang;
    }

    public function setNamaBidang($namaBidang)
    {
        $this->namaBidang = $namaBidang;
    }

    public function getNamaPartai()
    {
        return $this->namaPartai;
    }

    public function setNamaPartai($namaPartai)
    {
        $this->namaPartai = $namaPartai;
    }

    public function getFoto()
    {
        return $this->foto;
    }

    public function setFoto($foto)
    {
        $this->foto = $foto;
    }

    // destructor
    function __destruct()
    {
    }
}
