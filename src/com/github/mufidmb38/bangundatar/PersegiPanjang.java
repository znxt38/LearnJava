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
public class PersegiPanjang {
    private int mLuas;
    private int mKeliling;
    
    public PersegiPanjang() {
        
    }
    
    public static PersegiPanjang getInstance() {
        PersegiPanjang instance = new PersegiPanjang();
        return instance;
    }
    
    public int hitungLuas(int panjang, int lebar) {
        mLuas = panjang * lebar;
        return mLuas;
    }
    
    public int hitungKeliling(int panjang, int lebar) {
        mKeliling = 2 * (panjang + lebar);
        return mKeliling;
    }
    
    public int getLuas() {
        return mLuas;
    }
    
    public int getKeliling() {
        return mKeliling;
    }
    
}
