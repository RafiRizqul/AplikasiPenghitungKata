Rafi Rizkullah    
2210010288



![image](https://github.com/user-attachments/assets/d669984f-c23d-41e9-b14f-0005188d2da1)

![image](https://github.com/user-attachments/assets/a402d1a3-bfc7-4f55-8f8b-b73448b2ffc3)


![image](https://github.com/user-attachments/assets/513aef87-f641-4d3e-9493-44941f95ab03)


![image](https://github.com/user-attachments/assets/39c7ff82-99ca-46ad-b37e-06547e4a9b6c)


![image](https://github.com/user-attachments/assets/bab80627-adc0-435b-97a6-8d2726b0cdf3)


# Aplikasi Penghitung Kata dan Karakter

Aplikasi Java ini memungkinkan pengguna untuk memasukkan teks ke dalam area teks dan melakukan berbagai operasi penghitung kata dan karakter. Fitur-fitur yang disediakan antara lain menghitung jumlah kata, karakter, kalimat, dan paragraf, mencari kata tertentu, serta menyimpan hasilnya ke dalam file.

## Fitur

- **Jumlah Kata**: Menampilkan jumlah kata dalam teks yang dimasukkan.
- **Jumlah Karakter**: Menampilkan jumlah karakter dalam teks yang dimasukkan.
- **Jumlah Kalimat**: Menampilkan jumlah kalimat berdasarkan tanda baca seperti titik (`.`), tanda seru (`!`), dan tanda tanya (`?`).
- **Jumlah Paragraf**: Menampilkan jumlah paragraf berdasarkan pemisah baris.
- **Cari Kata**: Memungkinkan pengguna untuk mencari kata tertentu dalam teks dan menyorotnya.
- **Simpan Hasil**: Pengguna dapat menyimpan teks input beserta hasil penghitungan jumlah kata, karakter, kalimat, dan paragraf ke dalam file.

## Persyaratan

- **Java 8 atau lebih tinggi**: Aplikasi ini dibangun menggunakan Java Swing dan pustaka I/O Java.
- **IDE**: IDE seperti IntelliJ IDEA, Eclipse, atau NetBeans dapat digunakan untuk mengompilasi dan menjalankan aplikasi ini.

## Instalasi

1. Unduh atau kloning repositori ini.
2. Buka proyek ini di IDE Java pilihan Anda.
3. Bangun dan jalankan proyek.

## Penggunaan

1. **Input Teks**: Ketik atau salin teks ke dalam area input.
2. **Hitung**: Klik tombol "Hitung" untuk menghitung jumlah kata, karakter, kalimat, dan paragraf.
3. **Cari**: Masukkan kata yang ingin dicari di kolom "Cari" dan klik tombol "Cari" untuk mencari dan menyorot kata tersebut dalam teks.
4. **Simpan Hasil**: Setelah melakukan perhitungan, klik tombol "Simpan" untuk menyimpan teks input beserta hasil perhitungan ke dalam file.

## Penjelasan Fungsionalitas

- **Document Listener**: `DocumentListener` memantau perubahan pada area teks dan secara otomatis memperbarui jumlah kata, karakter, kalimat, dan paragraf.
- **Menyimpan Data**: Menggunakan `JFileChooser` untuk meminta pengguna memilih lokasi file dan menyimpan data ke dalam file `.txt`.
- **Fitur Cari**: Menyorot kata yang ditemukan pada teks berdasarkan pencarian kata.

## Contoh Penggunaan

1. Masukkan teks berikut:


2. Klik **Hitung** untuk menghitung jumlah kata, karakter, kalimat, dan paragraf.

3. Klik **Simpan** untuk menyimpan hasil perhitungan ke dalam file.

4. Gunakan **Cari** untuk mencari dan menyorot kata tertentu dalam teks.

## Teknologi yang Digunakan

- **Java Swing** untuk membangun antarmuka pengguna grafis (GUI).
- **Java I/O** untuk operasi file (menyimpan hasil).

## Lisensi

Proyek ini dilisensikan di bawah Lisensi MIT - lihat file [LICENSE](LICENSE) untuk rincian.
