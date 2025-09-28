/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package service;

import java.util.ArrayList;
import java.util.Scanner;
import model.*;

public class TiketService {
    private final ArrayList<Tiket> daftarTiket = new ArrayList<>();
    private final Scanner scanner = new Scanner(System.in);

    public void tambahTiket() {
        System.out.println("Pilih jenis tiket: 1. Ekonomi  2. VIP");
        int pilihan = scanner.nextInt(); scanner.nextLine();

        System.out.print("Masukkan Kode Tiket: ");
        String kode = scanner.nextLine();
        System.out.print("Masukkan Nama Penumpang: ");
        String nama = scanner.nextLine();
        System.out.print("Masukkan Harga: ");
        double harga = scanner.nextDouble(); scanner.nextLine();

        Tiket tiket;
        if (pilihan == 1) {
            tiket = new TiketEkonomi(kode, nama, harga);
        } else {
            tiket = new TiketVIP(kode, nama, harga);
        }
        daftarTiket.add(tiket);
        System.out.println("Tiket berhasil ditambahkan!");
    }

    public void tampilkanTiket() {
        if (daftarTiket.isEmpty()) {
            System.out.println("Belum ada tiket.");
        } else {
            for (Tiket t : daftarTiket) {
                t.tampilkanDetail(); // polymorphism overriding
                System.out.println("----------------------");
            }
        }
    }

    public void hapusTiket() {
        System.out.print("Masukkan kode tiket yang akan dihapus: ");
        String kode = scanner.nextLine();
        daftarTiket.removeIf(t -> t.getKodeTiket().equalsIgnoreCase(kode));
        System.out.println("Tiket berhasil dihapus (jika ada).");
    }

    public void cariTiket() {
        System.out.print("Masukkan kode tiket yang dicari: ");
        String kode = scanner.nextLine();
        for (Tiket t : daftarTiket) {
            if (t.getKodeTiket().equalsIgnoreCase(kode)) {
                t.tampilkanDetail();
                return;
            }
        }
        System.out.println("Tiket tidak ditemukan.");
    }
}