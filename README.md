emesananKomik
PemesananKomik adalah sebuah aplikasi Android sederhana yang dibangun menggunakan Kotlin. Aplikasi ini berfungsi sebagai platform purwarupa untuk melihat daftar komik dan mensimulasikan alur pemesanan.

Aplikasi ini mendemonstrasikan navigasi dasar, manajemen state sederhana, dan penggunaan RecyclerView dengan data yang bersumber dari resource XML.

🖼️ Tampilan Aplikasi (Alur Pengguna)
Berikut adalah alur utama dari aplikasi:

Welcome & Autentikasi: Pengguna disambut oleh WelcomeActivity dan diarahkan ke AuthActivity untuk memilih Login atau Register.

Home (Daftar Komik): Setelah login/register, pengguna masuk ke HomeActivity, yang menampilkan HomeFragment. Halaman ini berisi daftar komik yang dapat di-scroll.

Tambah ke Keranjang: Mengetuk item komik akan menambahkannya ke keranjang belanja (menggunakan CartViewModel) dan otomatis memindahkan pengguna ke tab Order.

Keranjang (Order): OrderFragment menampilkan daftar komik yang telah ditambahkan ke keranjang.

Checkout & Selesai: Pengguna dapat melanjutkan ke CheckoutActivity untuk mengisi alamat, dan diakhiri di ThankYouActivity setelah pesanan "diproses".

Profil: Tab profil (ProfileFragment) berisi informasi statis dan tombol untuk keluar (logout).

✨ Fitur Utama
Autentikasi Pengguna: Alur dasar untuk dummy Register dan Login.

Daftar Komik Dinamis (dari Resource): Menampilkan daftar komik menggunakan RecyclerView. Data komik (judul, deskripsi, dan gambar) dikelola secara terpusat di app/src/main/res/values/strings.xml, sehingga mudah untuk ditambah atau diubah.

Manajemen Keranjang (Cart): Menggunakan ViewModel (CartViewModel) dan LiveData untuk berbagi status keranjang antara HomeFragment dan OrderFragment.

Navigasi Modern: Menggunakan Jetpack Navigation Component dengan BottomNavigationView untuk navigasi antar tiga tab utama: Home, Order, dan Profil.

Alur Checkout: Simulasi alur checkout dari keranjang, pengisian alamat, hingga layar "Terima Kasih".

🚀 Teknologi yang Digunakan
Bahasa: Kotlin

UI:

Material Design Components

RecyclerView

ConstraintLayout

Arsitektur & Jetpack:

ViewModel

LiveData

Navigation Component

⚙️ Cara Menjalankan Proyek
Clone repositori ini:

Bash

git clone https://github.com/rhannalfa/pemesanankomik.git
Buka proyek menggunakan Android Studio.

Jalankan aplikasi pada emulator atau perangkat Android fisik.
