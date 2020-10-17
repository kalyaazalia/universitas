package com.univ;

import com.univ.Staff;

public class StaffPns extends Staff {

    private int remunerasi = 1995000;

    public int getRemunerasi() {
        return remunerasi;
    }

    public void setRemunerasi(int remunerasi) {
        this.remunerasi = remunerasi;
    }
    public int getTotalGaji() {
        int TotalGaji = this.getGajiTetap()+ this.getRemunerasi() + this.getTunjangan();
        return TotalGaji;
    }
}