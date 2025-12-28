# 🛒 API Transaksi Jual Beli – Spring Boot

Selamat datang di repositori GitHub saya! 👋  
Ini adalah aplikasi **Transaksi Jual Beli Supermarket** berbasis **Java Spring Boot**.  
Project ini dibuat sebagai media pembelajaran pembuatan **REST API** menggunakan Java dan MySQL.

Aplikasi ini **belum sepenuhnya selesai**, sehingga sangat cocok untuk metode **ATM (Amati, Tiru, Modifikasi)** bagi yang ingin belajar atau membangun portofolio backend.

---

## 🎯 Tech Stack

- Java **JDK 25**
- Spring Boot **4.0.0**
- Maven Project
- Packaging **JAR**
- Database **MySQL**
- Configuration **YAML**
- OpenAPI **Swagger**

---

## 📘 API Documentation (Swagger)

Project ini telah dilengkapi dengan dokumentasi API menggunakan **Swagger OpenAPI** untuk memudahkan eksplorasi dan pengujian endpoint.

### 🔎 Swagger UI

```

[http://localhost:8080/swagger-ui/index.html](http://localhost:8080/swagger-ui/index.html)

````

Swagger digunakan untuk:
- Melihat seluruh daftar endpoint API
- Menguji endpoint secara langsung (GET, POST, PUT, DELETE)
- Melihat format request dan response berbasis JSON

---

## 🧪 API Testing (Postman)

API dapat diuji menggunakan **Postman** maupun Swagger.

Contoh endpoint:
- `GET    /api/jenis-barang`
- `POST   /api/jenis-barang`
- `PUT    /api/jenis-barang/{id}`
- `DELETE /api/jenis-barang/{id}`

Contoh request body:

```json
{
  "idJenisBarang": 100,
  "nama": "Snack"
}
````

---

## 🚀 Cara Menjalankan Aplikasi

1. Pastikan **JDK 25** terinstall
2. Pastikan **MySQL** sudah berjalan
3. Atur konfigurasi database di `application.yaml`
4. Jalankan aplikasi:

```
mvn spring-boot:run
```

---

## 📝 License

Project ini menggunakan **MIT License**
Bebas digunakan untuk keperluan belajar.

---

Happy Coding! 🚀✨
Made with ❤️ for CCIT Students 
