/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

public class TiketVIP extends Tiket implements Diskonable {

    public TiketVIP(String kodeTiket, String namaPenumpang, double harga) {
        super(kodeTiket, namaPenumpang, harga);
    }

    // Override abstract method
    @Override
    public void tampilkanDetail() {
        System.out.println("=== Tiket VIP ===");
        System.out.println("Kode: " + getKodeTiket());
        System.out.println("Nama: " + getNamaPenumpang());
        System.out.println("Harga: Rp" + getHarga());
    }

    // Implementasi interface
    @Override
    public double hitungDiskon(double persen) {
        return getHarga() - (getHarga() * persen / 100);
    }
}