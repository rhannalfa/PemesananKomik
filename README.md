# PemesananKomik

PemesananKomik adalah sebuah aplikasi Android sederhana yang dibangun menggunakan Kotlin. Aplikasi ini berfungsi sebagai platform purwarupa untuk melihat daftar komik dan mensimulasikan alur pemesanan.

Aplikasi ini mendemonstrasikan navigasi dasar, manajemen *state* sederhana, dan penggunaan `RecyclerView` dengan data yang bersumber dari *resource* XML.

## 🖼️ Tampilan Aplikasi (Alur Pengguna)

Berikut adalah alur utama dari aplikasi:

1.  **Welcome & Autentikasi**: Pengguna disambut oleh [WelcomeActivity](./assets/splash.jpg) dan diarahkan ke [AuthActivity](./assets/auth.jpg) untuk memilih [Login](./assets/login.jpg) atau [Register](./assets/register.jpg).
2.  **Home (Daftar Komik)**: Setelah login/register, pengguna masuk ke [HomeActivity](./assets/home.jpg), yang menampilkan `HomeFragment`. Halaman ini berisi daftar komik yang dapat di-scroll.
3.  **Tambah ke Keranjang**: Mengetuk item komik akan menambahkannya ke keranjang belanja (menggunakan `CartViewModel`) dan otomatis memindahkan pengguna ke tab Order.
4.  **Keranjang (Order)**: [OrderFragment](./assets/cart.jpg) menampilkan daftar komik yang telah ditambahkan ke keranjang.
5.  **Checkout & Selesai**: Pengguna dapat melanjutkan ke [CheckoutActivity](./assets/send.jpg) untuk mengisi alamat, dan diakhiri di [ThankYouActivity](./assets/thanks.jpg) setelah pesanan "diproses".
6.  **Profil**: Tab profil ([ProfileFragment](./assets/profile.jpg) berisi informasi statis dan tombol untuk keluar (logout).

## ✨ Fitur Utama

* **Autentikasi Pengguna**: Alur dasar untuk *dummy* Register dan Login.
* **Daftar Komik Dinamis (dari Resource)**: Menampilkan daftar komik menggunakan `RecyclerView`. Data komik (judul, deskripsi, dan gambar) dikelola secara terpusat di `app/src/main/res/values/strings.xml`, sehingga mudah untuk ditambah atau diubah.
* **Manajemen Keranjang (Cart)**: Menggunakan `ViewModel` (`CartViewModel`) dan `LiveData` untuk berbagi status keranjang antara `HomeFragment` dan `OrderFragment`.
* **Navigasi Modern**: Menggunakan Jetpack Navigation Component dengan `BottomNavigationView` untuk navigasi antar tiga tab utama: Home, Order, dan Profil.
* **Alur Checkout**: Simulasi alur checkout dari keranjang, pengisian alamat, hingga layar "Terima Kasih".

## 🚀 Teknologi yang Digunakan

* **Bahasa**: [Kotlin](https://kotlinlang.org/)
* **UI**:
    * Material Design Components
    * RecyclerView
    * ConstraintLayout
* **Arsitektur & Jetpack**:
    * [ViewModel](https://developer.android.com/topic/libraries/architecture/viewmodel)
    * [LiveData](https://developer.android.com/topic/libraries/architecture/livedata)
    * [Navigation Component](https://developer.android.com/guide/navigation)

## ⚙️ Cara Menjalankan Proyek

1.  **Clone** repositori ini:
    ```bash
    git clone [https://github.com/rhannalfa/pemesanankomik.git](https://github.com/rhannalfa/pemesanankomik.git)
    ```
2.  **Buka** proyek menggunakan Android Studio.
3.  **Jalankan** aplikasi pada emulator atau perangkat Android fisik.
