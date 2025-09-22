# Posttest-PBO-3
Nama : Muhammad Rifqi Jastiartha Nim:2409116117

# 🎟️ Sistem Manajemen Penjualan Tiket Konser

Aplikasi sederhana berbasis **Java** untuk mengelola penjualan tiket konser.  
Menerapkan konsep **OOP (Encapsulation, Inheritance, Overriding)** dalam pengembangan program.

---

## ✨ Fitur Utama
- ➕ Tambah tiket **Regular** atau **VIP**  
- 📋 Lihat semua tiket yang tersedia  
- ✏️ Update data tiket  
- ❌ Hapus tiket  
- 🔎 Cari tiket berdasarkan nama konser  
- 🔙 Menu kembali ke menu utama saat menambah tiket  
- 🛒 Stok tiket (tersedia di setiap tiket)  

---

---

## 🛠️ Konsep OOP yang Diterapkan
1. **Encapsulation** → setiap atribut di `Tiket` dilindungi dengan **getter & setter**.  
2. **Inheritance** → `Tiketregular` dan `Tiketvip` mewarisi superclass `Tiket`.  
3. **Overriding** → method `tampilkanInfo()` di-override di subclass untuk menampilkan info sesuai jenis tiket.  

---

---
=== Sistem Manajemen Penjualan Tiket Konser ===
1. Tambah Tiket
2. Lihat Tiket
3. Update Tiket
4. Hapus Tiket
5. Cari Tiket
6. Keluar
---

---
=== Tambah Tiket ===
Pilih jenis tiket:
1. Regular
2. VIP
3. Kembali

Masukkan nama konser: Konser Rock
Masukkan tanggal konser (dd-mm-yyyy): 20-10-2025
Masukkan harga tiket: 250000
Masukkan stok tiket: 100

----

---
=== Lihat Tiket ===
Daftar Tiket:
1. [Regular] Konser Rock - 20-10-2025 | Harga: 250000 | Stok: 100
2. [VIP] Konser Jazz - 21-11-2025 | Harga: 500000 | Stok: 50 | Fasilitas: Meet & Greet

---

---
===  Update tiket ===
Daftar Tiket:
1. [Regular] Konser Rock - 20-10-2025 | Harga: 250000 | Stok: 100
2. [VIP] Konser Jazz - 21-11-2025 | Harga: 500000 | Stok: 50 | Fasilitas: Meet & Greet

Pilih nomor tiket yang ingin diupdate: 1
Masukkan nama konser baru: Konser Rock Legend
Masukkan tanggal konser baru: 25-10-2025
Masukkan harga tiket baru: 300000
Masukkan stok tiket baru: 120
---

---
=== Hapus Tiket ===
Daftar Tiket:
1. [Regular] Konser Rock Legend - 25-10-2025 | Harga: 300000 | Stok: 120
2. [VIP] Konser Jazz - 21-11-2025 | Harga: 500000 | Stok: 50 | Fasilitas: Meet & Greet

Pilih nomor tiket yang ingin dihapus: 2
✅ Tiket berhasil dihapus.
---

---
=== Cari Tiket ===
Daftar Tiket:
1. [Regular] Konser Rock Legend - 25-10-2025 | Harga: 300000 | Stok: 120
2. [VIP] Konser Jazz - 21-11-2025 | Harga: 500000 | Stok: 50 | Fasilitas: Meet & Greet
---

---


=== Keluar ===
Terima kasih telah menggunakan sistem!
