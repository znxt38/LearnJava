/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.github.mufidmb38.bangundatar;

import java.util.Scanner;

/**
 *
 * @author znxt38
 */
public class BangunDatar {
    private static final int PERSEGI = 1;
    private static final int PERSEGI_PANJANG = 2;
    private static final int SEGITIGA_SAMA_SISI = 3;
    private static final int MENU_LUAS = 1;
    private static final int MENU_KELILING = 2;
    
    private static final String PROGRAM_DESC =
            "==================================\n"
            + "         SELAMAT DATANG          \n"
            + "==================================";
    private static final String MENU_MAIN_DESC = 
            "Hal apa yang akan kamu lakukan?\n"
            + "1. Menghitung luas bangun datar.\n"
            + "2. Menghitung keliling bangun datar\n"
            + "0. Keluar";
    private static final String MENU_LUAS_DESC =
            "Jenis bangun datar apa yang akan kamu hitung?\n"
            + "1. Persegi\n"
            + "2. Persegi Panjang\n"
            + "3. Segitiga sama sisi\n"
            + "0. Kembali";
    private static final String MENU_KELILING_DESC = MENU_LUAS_DESC;
    
    private final Scanner mScanner = new Scanner(System.in);
    private int mMenuMain;
    private int mMenuLuas;
    private int mMenuKeliling;
    private Persegi mPersegi;
    private PersegiPanjang mPersegiPanjang;
    private SegitigaSamaSisi mSegitigaSamaSisi;
    private int mK;
    private int mL, mP;
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        BangunDatar.getInstance();
    }
    
    public BangunDatar() {
     System.out.println(PROGRAM_DESC);
     mPersegi = Persegi.getInstance();
     mPersegiPanjang = PersegiPanjang.getInstance();
     mSegitigaSamaSisi = SegitigaSamaSisi.getInstance();
     menuMain();
    }
    
    public static BangunDatar getInstance() {
        BangunDatar instance = new BangunDatar();
        return instance;
    }
    
    
    private void menuMain() {
        System.out.println(MENU_MAIN_DESC);
        System.out.print("Pilihan:");
        mMenuMain = mScanner.nextInt();
        switch (mMenuMain) {
            case 0:
                exit();
                return;
            case MENU_LUAS:
                menuLuas();
                return;
            case MENU_KELILING:
                menuKeliling();
                return;
            default:
                menuMain();  
        }
    }
    private void exit() {
        System.exit(0);
    }
    private void clearScreen() {
        try {
            final String os = System.getProperty("os.name");
            if (os.contains("Windows")) {
                // clear screen untuk windows
                new ProcessBuilder("cmd", "/c", "cls")
                        .inheritIO()
                        .start()
                        .waitFor();
            } else {
                // clear screen untuk Linux, Unix, Mac
                Runtime.getRuntime().exec("clear");
                System.out.print("\033[H\033[2J");
                System.out.flush();
            }
        } catch (final Exception e) {
            System.out.println("Error karena: " + e.getMessage());
        }
    }
    
    private void menuLuas() {
        clearScreen();
        System.out.println(MENU_LUAS_DESC);
        System.out.print("Pilihan: ");
        mMenuLuas = mScanner.nextInt();
        switch (mMenuLuas) {
            case 0:
                menuMain();
                return;
            case PERSEGI:
                System.out.print("Masukan nilai sisi: ");
                mL = mScanner.nextInt();
                mPersegi.hitungLuas(mL);
                System.out.println("Luas persegi = " + mPersegi.getLuas());
                return;
            case PERSEGI_PANJANG:
                System.out.print("Masukan nilai panjang: ");
                mP = mScanner.nextInt();
                System.out.print("Masukan nilai lebar: ");
                mL = mScanner.nextInt();
                mPersegiPanjang.hitungLuas(mP, mL);
                System.out.println("Luas persegi panjang = " + mPersegiPanjang.getLuas());
                return;
            case SEGITIGA_SAMA_SISI:
                System.out.print("Masukan nilai alas: ");
                int alas = mScanner.nextInt();
                System.out.print("Masukan nilai tinggi: ");
                int tinggi = mScanner.nextInt();
                mSegitigaSamaSisi.hitungLuas(alas, tinggi);
                System.out.println("Luas segitiga sama sisi =" + mSegitigaSamaSisi.getLuas());
                return;
            default:
                menuLuas();
        }
    }
    
    private void menuKeliling() {
        clearScreen();
        System.out.print("Pilihan:");
        System.out.println(MENU_KELILING_DESC);
        mMenuKeliling = mScanner.nextInt();
        switch (mMenuKeliling) {
            case 0:
                menuMain();
                return;
            case PERSEGI:
                System.out.print("Masukan nilai sisi: ");
                mL = mScanner.nextInt();
                mPersegi.hitungKeliling(mL);
                System.out.println("Keliling persegi = " + mPersegi.getKeliling());
                return;
            case PERSEGI_PANJANG:
                System.out.print("Masukan nilai panjang: ");
                mP = mScanner.nextInt();
                System.out.print("Masukan nilai lebar: ");
                mL = mScanner.nextInt();
                mPersegiPanjang.hitungKeliling(mP, mL);
                System.out.println("Keliling persegi panjang = " + mPersegiPanjang.getKeliling());
                return;
            case SEGITIGA_SAMA_SISI:
                System.out.print("Masukan nilai sisi A: ");
                int sisiA = mScanner.nextInt();
                System.out.print("Masukan nilai sisi B: ");
                int sisiB = mScanner.nextInt();
                System.out.print("Masukan nilai sisi C: ");
                int sisiC = mScanner.nextInt();
                mSegitigaSamaSisi.hitungKeliling(sisiA, sisiB, sisiC);
                System.out.println("Keliling segitiga sama sisi =" + mSegitigaSamaSisi.getKeliling());
                return;
            default:
                menuKeliling();
        }
    }
}
