/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package service;

import java.util.ArrayList;
import model.Tiket;

/**
 *
 * @author Tuf Gaming
 */
public class TiketService {
    private final ArrayList<Tiket> daftarTiket = new ArrayList<>();

    // Create
    public void tambahTiket(Tiket t) {
        daftarTiket.add(t);
        System.out.println("✅ Tiket berhasil ditambahkan!");
    }

    // Read
    public void tampilkanTiket() {
        if (daftarTiket.isEmpty()) {
            System.out.println("❌ Belum ada tiket.");
        } else {
            for (int i = 0; i < daftarTiket.size(); i++) {
                System.out.println((i + 1) + ". " + daftarTiket.get(i).toString());
            }
        }
    }

    // Update
    public void updateTiket(int index, Tiket tiketBaru) {
        if (index >= 0 && index < daftarTiket.size()) {
            daftarTiket.set(index, tiketBaru);
            System.out.println("✅ Tiket berhasil diupdate!");
        } else {
            System.out.println("❌ Nomor tiket tidak valid.");
        }
    }

    // Delete
    public void hapusTiket(int index) {
        if (index >= 0 && index < daftarTiket.size()) {
            daftarTiket.remove(index);
            System.out.println("✅ Tiket berhasil dihapus!");
        } else {
            System.out.println("❌ Nomor tiket tidak valid.");
        }
    }

    // Search
    public void cariTiket(String keyword) {
        boolean ditemukan = false;
        for (Tiket t : daftarTiket) {
            if (t.getNamaKonser().toLowerCase().contains(keyword.toLowerCase())) {
                System.out.println("🔎 Ditemukan: " + t.toString());
                ditemukan = true;
            }
        }
        if (!ditemukan) {
            System.out.println("❌ Tiket dengan kata kunci '" + keyword + "' tidak ditemukan.");
        }
    }
}

    

