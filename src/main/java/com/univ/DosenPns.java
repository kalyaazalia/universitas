package com.univ;

import com.univ.Dosen;

public class DosenPns extends Dosen {

    private int remunerasi = 1425000;

    public int getRemunerasi() {
        return remunerasi;
    }

    public void setRemunerasi(int remunerasi) {
        this.remunerasi = remunerasi;
    }
    public int getTotalGaji() {
        int TotalGaji = this.getGajiTetap() + this.getRemunerasi() + this.getTunjangan();
        return TotalGaji;
    }
}