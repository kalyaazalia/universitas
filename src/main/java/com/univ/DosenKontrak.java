package com.univ;

import com.univ.Dosen;

public class DosenKontrak extends Dosen {

    private int gajiSks = 6750000;
    private int remunerasi = 1500000;

    public int getGajiSks() {
        return gajiSks;
    }

    public void setGajiSks() {
        this.gajiSks = gajiSks;
    }

    public int getRemunerasi() {
        return remunerasi;
    }

    public void setRemunerasi(int remunerasi) {
        this.remunerasi = remunerasi;
    }

    public int getTotalGaji() {
        int TotalGaji = this.getGajiSks() + this.getRemunerasi();
        return TotalGaji;
    }
}