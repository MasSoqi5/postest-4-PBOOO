/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

// Abstract Class
public abstract class Tiket {
    private String kodeTiket;
    private String namaPenumpang;
    private double harga;

    // Constructor
    public Tiket(String kodeTiket, String namaPenumpang, double harga) {
        this.kodeTiket = kodeTiket;
        this.namaPenumpang = namaPenumpang;
        this.harga = harga;
    }

    // Getter & Setter
    public String getKodeTiket() {
        return kodeTiket;
    }

    public void setKodeTiket(String kodeTiket) {
        this.kodeTiket = kodeTiket;
    }

    public String getNamaPenumpang() {
        return namaPenumpang;
    }

    public void setNamaPenumpang(String namaPenumpang) {
        this.namaPenumpang = namaPenumpang;
    }

    public double getHarga() {
        return harga;
    }

    public void setHarga(double harga) {
        this.harga = harga;
    }

    // Abstract Method → harus di-override di subclass
    public abstract void tampilkanDetail();

    // Polymorphism → Overloading
    public void cetakTiket() {
        System.out.println("Tiket dengan kode " + kodeTiket + " atas nama " + namaPenumpang);
    }

    public void cetakTiket(boolean lengkap) {
        if (lengkap) {
            tampilkanDetail();
        } else {
            System.out.println("Kode Tiket: " + kodeTiket);
        }
    }
}