/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.github.mufidmb38.bangundatar;

/**
 *
 * @author znxt38
 */
public class SegitigaSamaSisi {
    
    private int mLuas;
    private int mKeliling;

    public SegitigaSamaSisi() {
        
    }
    
    public static SegitigaSamaSisi getInstance() {
        SegitigaSamaSisi instance = new SegitigaSamaSisi();
        return instance;
    }
    
    public int hitungLuas(int alas, int tinggi) {
        mLuas = alas * tinggi / 2;
        return mLuas;
    }
    
    public int hitungKeliling(int sisiA, int sisiB, int sisiC) {
        mKeliling = sisiA + sisiB + sisiC;
        return mKeliling;
    }
    
    public int getLuas() {
        return mLuas;
    }
    
    public int getKeliling() {
        return mKeliling;
    }
    
}
