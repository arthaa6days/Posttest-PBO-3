/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author Tuf Gaming
 */
public class Tiketregular extends Tiket{
    public Tiketregular(String namaKonser, String tanggal, double harga, int stok) {
        super(namaKonser, tanggal, harga, stok);
    }

    @Override
    public String toString() {
        return "[Regular] " + super.toString();
    }
}


