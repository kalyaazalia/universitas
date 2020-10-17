package com.univ;

import com.univ.Dosen;

public class DosenNonPns extends Dosen {

    private int remunerasi = 1050000;

    public int getRemunerasi() {
        return remunerasi;
    }

    public void setRemunerasi(int remunerasi) {
        this.remunerasi = remunerasi;
    }

    public int getTotalGaji() {
        int TotalGaji = this.getGajiTetap() + this.getRemunerasi();
        return TotalGaji;
    }
}