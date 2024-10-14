# MiniProject2-PBO
## Sistem Manajemen Koleksi Karya Seni Digital
# Profil
Nama: Muhammad Aidil Mirza

NIM: 2309116040
# Deskripsi
Program mengenai Koleksi Karya Seni Digital yang dimiliki user, sistemnya adalah seperti nft, dimana user memiliki koleksi karya seninya sendiri, jadi user dapat melakukan CRUD pada koleksi karya seninya.

# Cara kerja program
## Class
![image](https://github.com/user-attachments/assets/ff20f6ba-c294-4dfc-8d8a-b8a0fc7b7077)

- Main.java adalah file utama untuk menjalankan program yang berisi tampilan untuk user.
- KaryaSeni.java sebagai parent class yang bersifat abstract agar tidak bisa dibuat sebagai objek.
- KaryaSeniGif.java dan KaryaSeniIlustrasi.java merupakan child class dari KaryaSeni.java.
- CRUDKaryaSeni.java adalah interface untuk method CRUD yang akan diterapkan oleh user.
- User.java adalah file yang berisi koleksi karya seni dan juga method CRUD.

## Property
- Main.java

  Pada Main.java hanya ada local property yang dibuat untuk menyimpan inputan.

  ![image](https://github.com/user-attachments/assets/b060a326-0509-4678-9b3a-9b4fedc6f045)

- User.java
  
  Terdapat property untuk akun user dan ada juga ArrayList koleksi untuk menyimpan koleksi karya seni yang dimiliki user
  
  ![image](https://github.com/user-attachments/assets/b5d9e093-d76e-44df-8883-c0b0d746a23c)

- KaryaSeni.java

  ![image](https://github.com/user-attachments/assets/647ed418-f94d-4838-be04-67eaf377aa0b)

- KaryaSeniIlustrasi.java

  ![image](https://github.com/user-attachments/assets/9eb9a30d-81c6-4228-861f-290f3182f49e)

- KaryaSeniGif.java

  ![image](https://github.com/user-attachments/assets/5978148c-c2ea-40fd-b3fa-b6c18c13873d)

## Constructor
- User.java

  ![image](https://github.com/user-attachments/assets/89c45a4c-f9da-490e-9a55-99ddf5c8188b)

- KaryaSeni.java

  ![image](https://github.com/user-attachments/assets/cd25751a-7cfd-4315-980f-4b568dd6cc78)

- KaryaSeniIlustrasi.java
  
  ![image](https://github.com/user-attachments/assets/6ca69a20-fa34-478f-9a06-f79abf2a118a)

- KaryaSeniGif.java

  ![image](https://github.com/user-attachments/assets/d63d24bd-fc6d-4b86-ad4f-b58da190f7bf)




# Output Program
## Menu awal

![image](https://github.com/user-attachments/assets/87a5df35-d357-47a5-916c-5d177340f7b2)

Pada menu ini kita melakukan login ke akun kita terlebih dahulu.

## Login 

![image](https://github.com/user-attachments/assets/1be804d9-1564-4857-9dbb-3aad9a329d87)

Ini adalah tampilan jika kita melakukan login.

## Menu utama 

![image](https://github.com/user-attachments/assets/4bfa466e-8a3e-4574-9673-ab8683f21014)

Pada menu ini user dapat memilih beberapa pilihan untuk melakukan CRUD.

## Tambah karya seni
Pada tambah karya seni ada dua jenis karya seni, ilustrasi atau digital.

![image](https://github.com/user-attachments/assets/c76ffb6d-723c-414e-bc33-ae725992cf5a)

Tampilan jika memilih ilustrasi.

![image](https://github.com/user-attachments/assets/60564e70-87bc-4cf3-afc5-ce6c96791f8e)

Tampilan jika memilih GIF.

## Tampilkan koleksi

![image](https://github.com/user-attachments/assets/f1299391-5bd3-4357-9c1c-82a785253e86)

Tampilan jika memilih koleksi.

## Edit karya seni

![image](https://github.com/user-attachments/assets/31be2124-fe04-4c91-934e-97c9459633b2)

Tampilan jika memilih edit karya seni

Hasil dari edit.

![image](https://github.com/user-attachments/assets/bb309c66-3c9a-43eb-ae12-d9c9d89157d5)

## Hapus Karya Seni

![image](https://github.com/user-attachments/assets/8ac5153e-20a5-4eb8-adc4-a05130de2f7f)

Tampilan jika kita ingin menghapus karya seni.

## Memilih keluar program

![image](https://github.com/user-attachments/assets/f78d448d-1f09-41dd-87ed-09ef08814c9c)

Keluar dari menu user, lalu keluar dari program.
