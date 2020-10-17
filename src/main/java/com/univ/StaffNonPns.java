package com.univ;

import com.univ.Staff;

public class StaffNonPns extends Staff {

    public int getTotalGaji() {
        int TotalGaji = this.getGajiTetap()+ this.getTunjangan();
        return TotalGaji;
    }
}