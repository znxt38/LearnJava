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
public class Persegi {
    private int mLuas;
    private int mKeliling;
    public Persegi() {
        
    }
    
    public static Persegi getInstance() {
        Persegi instance = new Persegi();
        return instance;
    }
    
    public int hitungLuas(int sisi) {
        mLuas = sisi * sisi;
        return mLuas;
    }
    
    public int hitungKeliling(int sisi) {
        mKeliling = sisi * 4;
        return mKeliling;
    }
    
    public int getLuas() {
        return mLuas;
    }
    
    public int getKeliling() {
        return mKeliling;
    }
}
