DESKRIPSI PROJECT
Proyek ini adalah Web automation framework Selenium yang dirancang mengikuti design pattern Page Object Model (POM) dan diintegrasikan dengan library Cucumber guna mengimplementasikan dan menguji sistem login pada sebuah aplikasi. Sistem login mencakup fitur autentikasi pengguna menggunakan kombinasi username dan password. Pengujian dilakukan untuk memastikan bahwa pengguna dapat mengakses aplikasi dengan kredensial yang valid, serta mendapatkan pesan kesalahan yang sesuai jika kredensial tidak valid.


FITUR UTAMA
Halaman Login:
Menyediakan antarmuka untuk pengguna memasukkan email dan password.
Memiliki tombol login untuk memproses autentikasi.
Autentikasi Pengguna:
Memvalidasi kombinasi email dan password.
Mengarahkan pengguna ke halaman utama jika kredensial benar.
Menampilkan pesan kesalahan jika kredensial salah.


PENGUJIAN
Pengujian dilakukan menggunakan framework Cucumber untuk memastikan fungsionalitas sistem login bekerja sesuai dengan spesifikasi. Berikut adalah skenario pengujian yang telah diimplementasikan:
LOGIN DENGAN KREDENSIAL VALID
Pengujian Login dengan Kredensial Valid
Tujuan: Memastikan bahwa sistem login berfungsi dengan benar ketika pengguna memasukkan kredensial yang sesuai.
Langkah:
Pengguna membuka halaman login.
Memasukkan email "standard_user".
Memasukkan password "secret_sauce".
Menekan tombol login.
Hasil yang Diharapkan:
Pengguna berhasil diarahkan ke halaman utama.


LOGIN DENGAN KREDENSIAL TIDAK VALID
Pengujian Login dengan Kredensial Tidak Valid
Tujuan: Memastikan sistem login memberikan pesan kesalahan yang sesuai ketika pengguna memasukkan kredensial yang salah.
Langkah:
Pengguna membuka halaman login.
Memasukkan email "standard_sauce".
Memasukkan password "invalid".
Menekan tombol login.
Hasil yang Diharapkan:
Pesan kesalahan ditampilkan: "Epic sadface: Username and password do not match any user in this service."


RUN PROJECT
Proyek ini bisa dijalankan melalui terminal karena konfigurasi di Gradle telah mengatur tugas pengujian khusus (cucumber) yang memanggil Cucumber dengan dependensi dan classpath yang tepat. Konfigurasi ini juga memperluas testImplementation untuk menyertakan runtime Cucumber dan menggunakan platform JUnit untuk menjalankan tes. Untuk menjalankan proyek ini, pastikan JDK dan Gradle telah diinstal, lalu navigasikan ke direktori proyek yang berisi file build.gradle menggunakan terminal. Jalankan perintah gradle build untuk mengompilasi kode dan mengunduh dependensi, lalu jalankan tes dengan perintah gradle cucumber untuk semua skenario atau tambahkan -Ptags="@tag" untuk tes dengan tag tertentu, misalnya @valid-login. Hasil tes ditampilkan di terminal, dan laporan dalam format HTML serta JSON akan dihasilkan di direktori reports/. Jika terjadi kesalahan, periksa log error di terminal dan pastikan dependensi diunduh dengan benar.

LANGKAH MENJALANKAN PROJECT
1. Buka Terminal
2. Navigasi ke direktori proyek: Gunakan perintah cd untuk berpindah ke direktori proyek Anda. Misalnya, jika proyek berada di desktop, gunakan perintah: 
3. cd Desktop/nama_proyek
4. Jalankan Tugas Cucumber: Ketik perintah berikut di terminal untuk menjalankan tugas pengujian sesuai tags yang ada dan sudah didefinisikan: 
./gradlew cucumber -Ptags="@valid-login”
Atau
./gradlew cucumber -Ptags="@invalid-login”

Output: Setelah menjalankan perintah ini, Gradle akan mengkompilasi proyek, menjalankan tes Cucumber, dan menghasilkan laporan dalam format HTML di direktori reports/cucumber.html.
![HWjay21](https://github.com/user-attachments/assets/d35bd9d5-4ac4-4e54-9f78-838af60fdee1)
