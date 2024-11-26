# **UAS PBO SOAL NOMOR 5**
___
## **Berikut Laporan Praktikum Ujian Akhir Pemrograman Berorientasi Objek Soal Nomor 5:**

1.	Membuat Database baru di aplikasi PostgreSQL dengan cara klik kanan pada icon database, klik create, klik Database.

     ![image](https://github.com/user-attachments/assets/79c68798-339e-4a51-a693-3b886b57bb7c)

2.	Beri Nama Database “UAS_PBO”

     ![image](https://github.com/user-attachments/assets/0a8e23e3-d699-4680-bf9b-e169281462b8)

3.	Membuat Tabel Mahasiswa beserta Atributnya

     ![image](https://github.com/user-attachments/assets/3b348031-d76b-4133-a371-6d12894e1808)

4.	Membuat Tabel PasswordLogin beserta Atributnya.

     ![image](https://github.com/user-attachments/assets/6de4a9e0-c735-4c15-b759-ba7bd3fe43f8)

5.	Membuat data Mahasiswa pada Microsoft Excel yang berisi NIM, Nama, Alamat, Asal SMA, dan Nama Orangtua kemudian menyimpannya dalam format CSV yang nantinya akan diupload di FrameMahasiswa menggunakan button Upload.

     ![image](https://github.com/user-attachments/assets/b5ea8a74-0695-4ec6-b2a7-58ae6a88d483)

6.	Buat Project baru dengan nama UAS_PBO, unchecklist pada create main class kemudian klik Finish.

     ![image](https://github.com/user-attachments/assets/4a1ede28-b604-4aa4-9f7a-82684d34b34c)

7.	Menambahkan Library PostgreSQL untuk koneksi dengan database dan library Jasperreport untuk cetak file.

     ![image](https://github.com/user-attachments/assets/0606fcde-029d-47e7-b9f5-a6cf28d6c027)

8.	Membuat kelas KoneksiDB sebagai koneksi untuk FrameMahasiswa dan mengisi code kelas KoneksiDB.

     ![image](https://github.com/user-attachments/assets/3618d0eb-6d14-4f08-a71f-a63c38b5cf6b)

9.	Membuat kelas Persistence Mahasiswa dan persistence PasswordLogin dengan cara klik kanan package uas_pbo kemudian klik New, klik Entity Classes from Database.

      ![image](https://github.com/user-attachments/assets/bb66fb51-1e22-4130-a28c-5fc9e7cd8ba0)

10.	Pada Database Connection pilih Database “UAS_PBO”.

      ![image](https://github.com/user-attachments/assets/6747ba4e-af19-431f-8371-baaf135d6694)

11.	Pindahkan tabel Mahasiswa dan Password Login ke sebelah kanan (Selected Tables) dengan cara klik Add All>>

      ![image](https://github.com/user-attachments/assets/aa2c493b-5471-4efe-b5c9-79baa92ca285)

    Setelah tabel dipindahkan kemudian klik Next.

      ![image](https://github.com/user-attachments/assets/cf95e81e-3dd4-4a0a-81d1-060604374481)

12.	Pada tampilan Entity Classes berikut klik Next.

      ![image](https://github.com/user-attachments/assets/d2a1f6e1-3846-41bc-82b5-1d83bc737ece)

13.	Pada Mapping Options klik Finish.

      ![image](https://github.com/user-attachments/assets/78d3eda0-194c-41e0-8a7b-e3241f75f5e4)

14.	Kelas persistence Mahasiswa dan persistence PasswordLogin berhasil dibuat.

      ![image](https://github.com/user-attachments/assets/de5ab395-8d44-47dd-91e9-fe197caaafad)

15.	Berikut isi dari Persistence.jrxml
    
      ![image](https://github.com/user-attachments/assets/8803638c-7d24-4e0e-bf82-24d81f7fd636)

16.	Berikut Library dari kelas persistence yang otomatis terbentuk.

      ![image](https://github.com/user-attachments/assets/cd3755ae-ee7b-4092-b84b-a96859df7d83)

17.	Membuat Tampilan FrameLogin. FrameLogin ini untuk masuk dan mengakses data pada FrameMahasiswa.

      ![image](https://github.com/user-attachments/assets/4af2e5e6-6848-4e36-b633-8ed130259ba5)

18.	Code FrameLogin. Terdapat dua import sebagai berikut yakni import javax.persistence.*; import javax.swing.*;

      ![image](https://github.com/user-attachments/assets/a41e177b-d4a3-49a8-8563-5b84a9ba5a10)

      ![image](https://github.com/user-attachments/assets/93f1667d-a70e-4d93-8723-eda4b082107d)

19. Membuat Tampilan Frame BuatAkun untuk membuat akun baru.
    
      ![image](https://github.com/user-attachments/assets/73a8990c-bee0-4d7c-80ac-a42dcd319fb1)

20.	Isi Code Frame BuatAkun.

      ![image](https://github.com/user-attachments/assets/3a99de5d-9853-4d4a-8507-66c909e87211)

      ![image](https://github.com/user-attachments/assets/cdf8578a-f3b5-4201-877e-93b61a795186)

      ![image](https://github.com/user-attachments/assets/1036234a-fee0-42ca-a735-e0137c08f87f)

      ![image](https://github.com/user-attachments/assets/38d1b84a-32b0-439b-b11b-4e6b6fb58c3e)

21.	Membuat report dengan cara klik kanan package uas_pbo kemudian klik new, klik Report Wizard.

      ![image](https://github.com/user-attachments/assets/8b900ca5-dbc5-4712-8b41-eda27ad5305f)

22. Membuat Tampilan Frame LupaPassword.

      ![image](https://github.com/user-attachments/assets/ff155ab5-0147-455d-8b39-630be4a4e03a)

23.	Isi code Frame LupaPassword.

      ![image](https://github.com/user-attachments/assets/4312a071-037e-4c17-bfce-f82f923d2d46)

      ![image](https://github.com/user-attachments/assets/f332f73a-6473-4868-b045-e49ae45e9464)

      ![image](https://github.com/user-attachments/assets/55d993be-66ff-4fb6-8170-ad9ec6c9ea84)

      ![image](https://github.com/user-attachments/assets/fc357f43-74c8-4602-80d8-9f4b50bb4295)

24.	Membuat Tampilan FrameMahasiswa yang berisi data NIM, Nama, Alamat, Asal SMA, dan Nama OrangTua. FrameMahasiswa berisi button Insert untuk menambah data, button Update untuk mengupdate data, button Delete untuk menghapus data, button Cetak untuk mencetak data, button Upload untuk mengupload data dalam bentuk csv, dan button Logout untuk Kembali ke FrameLogin.

      ![image](https://github.com/user-attachments/assets/f3cb6e40-e17b-483c-aa02-63acd75e852d)

25.	Berikut isi code FrameMahasiswa.

    Import yang digunakan.

      ![image](https://github.com/user-attachments/assets/84729a8f-31ab-465e-8cb4-d545081bc2da)

      ![image](https://github.com/user-attachments/assets/a3aedd2d-2e87-49e3-96cf-e02a73bc6643)

    Berikut code method tampil, peringatan, dan method clear.

      ![image](https://github.com/user-attachments/assets/6d15113c-4ca8-4dd9-a900-b8c037de34fa)

    Berikut code button Insert.

      ![image](https://github.com/user-attachments/assets/1f43e8ee-c29b-42b9-940b-492d13484c27)

    Berikut code button Update.

      ![image](https://github.com/user-attachments/assets/ae04208f-a073-4cb7-b5a4-c8f5f2e6fde4)

    Berikut code button Delete.

      ![image](https://github.com/user-attachments/assets/18516026-0d7b-4792-bf47-397cec0f2c7f)

    Berikut code button clear, button cetak, dan button Exit.

      ![image](https://github.com/user-attachments/assets/c022ac51-7f8d-49e1-bcea-1c539a647c1c)

    Berikut code tblMahasiswa

      ![image](https://github.com/user-attachments/assets/64c42a0b-8644-40ae-a461-4326d88bbbba)

    Berikut code button Upload

      ![image](https://github.com/user-attachments/assets/709d843e-25ab-40df-a815-eac4b9db43a6)

      ![image](https://github.com/user-attachments/assets/40371157-f1fb-4bc4-96e6-9132ec1573d1)

26.	Membuat report untuk menampilkan file yang dicetak dengan cara klik kanan pada package uas_pbo kemudian klik New, klik Report Wizard

      ![image](https://github.com/user-attachments/assets/7cd3d3b1-dc1e-4fe7-82c0-58186fe2eed3)

27.	Pilih layout blank A4 kemudian klik Next.

      ![image](https://github.com/user-attachments/assets/109b1501-eb28-4e50-8c14-62267c35869d)

28.	Beri nama reportmahasiswa1.jrxml

      ![image](https://github.com/user-attachments/assets/58654c58-aff7-4d03-a7af-44c9d4d5e199)

29.	Membuat koneksi database JDBC dari dengan database UAS_PBO

      ![image](https://github.com/user-attachments/assets/3d8397df-804e-4178-93bd-ba7e8323322f)

30.	Masukkan query “select*from Mahasiswa”

      ![image](https://github.com/user-attachments/assets/6497e814-7d06-40ee-9937-d82dc0b8be07)

31.	Pindahkan atribut kesebelah kanan lalu klik Next.

      ![image](https://github.com/user-attachments/assets/64c22dec-5833-47b1-a411-f8749c98bf4c)

      ![image](https://github.com/user-attachments/assets/fe2f2399-23af-40c5-a3ac-1a9350ec16c0)

32.	Pada groub by klik Next.

      ![image](https://github.com/user-attachments/assets/e93e71ab-2327-4e07-b0ac-fbe682965178)

33.	Report berhasil dibuat.

      ![image](https://github.com/user-attachments/assets/3bd9ea23-8d8d-42e4-80df-4a25a81347a4)

34.	Membuat Desain Jasperreport.

      ![image](https://github.com/user-attachments/assets/86caaa5d-d778-4a28-9995-6882b1e8111a)

35.	Eksekusi Insert data

      ![image](https://github.com/user-attachments/assets/651ec11a-d392-4a86-8689-7431d15e6513)

36.	Eksekusi Update Data

      ![image](https://github.com/user-attachments/assets/68fbdf17-17af-4e14-8ae6-523322201376)

37.	Eksekusi Delete Data

      ![image](https://github.com/user-attachments/assets/67fee32b-99a9-4d75-a131-ab17286b9a99)

      ![image](https://github.com/user-attachments/assets/4a824a3d-0431-4048-907a-2ee3730c114e)

38.	Pilih File Data_Mahasiswa.csv

      ![image](https://github.com/user-attachments/assets/be0d03f0-a8a6-426e-a27a-ffc44213e62a)

    Data berhasil di upload.

      ![image](https://github.com/user-attachments/assets/ea8ebc22-70e5-4636-ba40-0a964a363cc0)

39.	Eksekusi Cetak Data

      ![image](https://github.com/user-attachments/assets/f430b15b-addb-4238-bfc9-80aa5ff807d5)

40.	Eksekusi Login

      ![image](https://github.com/user-attachments/assets/9bd6125d-15a3-4a93-9da2-d7f6143524d3)

    FrameMahasiswa berhasil di buka

      ![image](https://github.com/user-attachments/assets/d97aad49-e096-43cc-a7ac-a4c165b80dc4)

41.	Eksekusi Create akun dengan password kurang dari 8 karakter.

      ![image](https://github.com/user-attachments/assets/cca648d8-7833-42a7-8baa-b22367b9134e)

42.	Eksekusi Create akun dengan password lebih dari 8 karakter.

      ![image](https://github.com/user-attachments/assets/cc63c50c-204a-4907-8126-62c96b1a199f)

43.	Eksekusi Delete akun

      ![image](https://github.com/user-attachments/assets/2359bbbe-42aa-4e69-9a54-ff9161b8b972)

      ![image](https://github.com/user-attachments/assets/dba3e131-01c7-4220-84d5-15325b2a6728)






























































   


