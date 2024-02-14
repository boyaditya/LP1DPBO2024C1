<!--
Saya Boy Aditya Rohmaulana NIM 2203488 mengerjakan
soal Latihan Praktikum 1 dalam mata kuliah DPBO
untuk keberkahanNya maka saya tidak melakukan kecurangan seperti yang telah dispesifikasikan. Aamiin 
-->


<?php
require("AnggotaDPR.php");
require("Tabel.php");

// instansiasi objek anggota dpr
$anggota1 = new AnggotaDPR("1", "Boy", "Bidang 1", "Partai 1", "<img src = 'foto.png' width='40' height='40'>");
$anggota2 = new AnggotaDPR("2", "Budi", "Bidang 2", "Partai 2", "<img src = 'foto.png' width='40' height='40'>");
$anggota3 = new AnggotaDPR("3", "Adit", "Bidang 3", "Partai 3", "<img src = 'foto.png' width='40' height='40'>");
$anggota4 = new AnggotaDPR("4", "Bambang", "Bidang 4", "Partai 4", "<img src = 'foto.png' width='40' height='40'>");
$anggota5 = new AnggotaDPR("5", "Bang", "Bidang 5", "Partai 5", "<img src = 'foto.png' width='40' height='40'>");

// membuat array objek anggota dpr
$anggota = array($anggota1, $anggota2, $anggota3, $anggota4, $anggota5);

// membuat array isi
$isi = array();

// mengisi data header
$isi[0] = array("ID", "Nama", "Nama Bidang", "Nama Partai", "Foto");

// mengisi data anggota ke array
for ($i = 0; $i < count($anggota); $i++) {
    $isi[$i + 1] = array($anggota[$i]->getId(), $anggota[$i]->getNama(), $anggota[$i]->getNamaBidang(), $anggota[$i]->getNamaPartai(), $anggota[$i]->getFoto());
}

// instansiasi objek tabel
$tabel = new Tabel(count($anggota) + 1, 5);
// menampilkan isi tabel
$tabel->buatTabel($isi);

// ------------ UBAH DATA -------------
echo "<p>Mengubah data anggota DPR dengan id = 1</p>";
$flag = 0;
foreach ($anggota as $key => $value) {
    if ($value->getId() == "1") {
        $anggota[$key]->setNama("Boy Aditya");
        $anggota[$key]->setNamaBidang("Bidang Keren");
        $anggota[$key]->setNamaPartai("Partai Keren");
        $anggota[$key]->setFoto("<img src = 'hmz.png' width='40' height='40'>");
        $flag = 1;
    }
}

if ($flag == 0) {
    echo "ID tidak ditemukan\n\n";
} else {
    echo "Data berhasil diubah\n\n";
}

$flag = 0;

$isi = array();
$isi[0] = array("ID", "Nama", "Nama Bidang", "Nama Partai", "Foto");
for ($i = 0; $i < count($anggota); $i++) {
    $isi[$i + 1] = array($anggota[$i]->getId(), $anggota[$i]->getNama(), $anggota[$i]->getNamaBidang(), $anggota[$i]->getNamaPartai(), $anggota[$i]->getFoto());
}

$tabel = new Tabel(count($anggota) + 1, 5);
$tabel->buatTabel($isi);

// ------------ HAPUS DATA -------------
echo "<p>Menghapus data anggota DPR dengan id = 3</p>";
$flag = 0;
foreach ($anggota as $key => $value) {
    if ($value->getId() == "3") {
        unset($anggota[$key]);
        $flag = 1;
    }
}

if ($flag == 0) {
    echo "ID tidak ditemukan\n\n";
} else {
    echo "Data berhasil dihapus\n\n";
}

$flag = 0;

$isi = array();
$isi[0] = array("ID", "Nama", "Nama Bidang", "Nama Partai", "Foto");
foreach ($anggota as $value) {
    $isi[] = array($value->getId(), $value->getNama(), $value->getNamaBidang(), $value->getNamaPartai(), $value->getFoto());
}

$tabel = new Tabel(count($anggota) + 1, 5);
$tabel->buatTabel($isi);
