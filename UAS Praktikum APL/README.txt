Nama  : Siti Balqis Humaira
NIM   : 1908107010001
Kelas : APL (A)

Studi Kasus : Ball
Deskripsi :
Planet Sport Shop merupakan sebuah Online Shop yang menjual perlengkapan olahraga, termasuk Bola.
Online Shop ini menawarkan 3 produk Bola terlaris yakni :
1. Bola Basket
2. Bola Tenis
3. Bola Voli
Setiap bola yang dijual memiliki info detail produk berupa berat bola yang tertera dalam satuan gram (g).
Setiap pelanggan dapat memilih jenis Bola yang ingin dipesan. Pelanggan juga dapat memilih jasa pengiriman
(Ekspedisi) yang diinginkan untuk mengirimkan Bola yang dipesan. Setiap Ekspedisi memiliki tarif pengiriman
yang berbeda-beda dan tarif pengiriman dihitung per kilogram (kg).
Jenis Ekspedisi yang ditawarkan yaitu :
1. JNE
2. JNT
3. SiCepat

Design Patterns :
1. Strategy Pattern
Design pattern ini diimplementasikan pada Strategi Pengiriman Bola (Shipping Strategy)
guna menyediakan pilihan ekspedisi bagi pelanggan yang ingin mengirimkan Bola yang dipesan
di Planet Sport Shop. Dengan demikian, pelanggan dapat memilih ekspedisi yang diinginkan
dengan tarif pengiriman yang berbeda-beda untuk setiap ekspedisi dengan menerapkan konsep
Strategy Pattern.

2. Adapter Pattern
Design pattern ini diimplementasikan pada berat bola. Dimana berat Bola yang tertera pada
detail produk adalah dalam satuan gram (g). Untuk melakukan pengiriman Bola dengan Eskpedisi, tarif
pengiriman Bola akan dihitung sesuai berat Bola dalam satuan kilogram (kg). Oleh karena itu, berat Bola
harus dikonversikan terlebih dahulu dari gram ke kilogram dengan menerapkan konsep Adapter Pattern.