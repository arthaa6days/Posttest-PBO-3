/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author Tuf Gaming
 */
public class Tiketvip extends Tiket{
    private String fasilitas;

    public Tiketvip(String namaKonser, String tanggal, double harga, int stok, String fasilitas) {
        super(namaKonser, tanggal, harga, stok);
        this.fasilitas = fasilitas;
    }

    public String getFasilitas() {
        return fasilitas;
    }

    public void setFasilitas(String fasilitas) {
        this.fasilitas = fasilitas;
    }

    @Override
    public String toString() {
        return "[VIP] " + super.toString() + " | Fasilitas: " + fasilitas;
    }
}
    

