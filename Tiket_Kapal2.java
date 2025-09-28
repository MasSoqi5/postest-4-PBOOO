/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.tiket_kapal2;

import java.util.Scanner;
import service.TiketService;

public class Tiket_Kapal2 {

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            TiketService service = new TiketService();
            
            int pilihan;
            do {
                System.out.println("\n=== Menu Tiket Kapal ===");
                System.out.println("1. Tambah Tiket");
                System.out.println("2. Lihat Semua Tiket");
                System.out.println("3. Hapus Tiket");
                System.out.println("4. Cari Tiket");
                System.out.println("0. Keluar");
                System.out.print("Pilih menu: ");
                pilihan = scanner.nextInt(); scanner.nextLine();
                
                switch (pilihan) {
                    case 1 -> service.tambahTiket();
                    case 2 -> service.tampilkanTiket();
                    case 3 -> service.hapusTiket();
                    case 4 -> service.cariTiket();
                    case 0 -> System.out.println("Terima kasih!");
                    default -> System.out.println("Menu tidak valid.");
                }
            } while (pilihan != 0);
        }
    }
}