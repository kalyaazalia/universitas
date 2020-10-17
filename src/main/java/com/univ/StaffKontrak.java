package com.univ;

import com.univ.Staff;

public class StaffKontrak extends Staff {
    
    private int remunerasi = 1300000;

    public int getRemunerasi() {
        return remunerasi;
    }

    public void setRemunerasi (int remunerasi){
        this.remunerasi = remunerasi;
    }

    public int getTotalGaji(){
        int TotalGaji = this.getGajiTetap() + this.getRemunerasi();
        return TotalGaji;
    }
}
