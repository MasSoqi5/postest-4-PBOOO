/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

public class TiketEkonomi extends Tiket implements Diskonable {

    public TiketEkonomi(String kodeTiket, String namaPenumpang, double harga) {
        super(kodeTiket, namaPenumpang, harga);
    }

    // Override abstract method
    @Override
    public void tampilkanDetail() {
        System.out.println("=== Tiket Ekonomi ===");
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