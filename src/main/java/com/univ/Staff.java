package com.univ;

import com.univ.Pegawai;

public class Staff extends Pegawai {

    private int tunjangan = 1750000;

    public int getTunjangan() {
        return tunjangan;
    }

    /**
     * @param gajiTetap the gajiTetap to set
     */
    public void setTunjangan(int tunjangan) {
        this.tunjangan = tunjangan;
    }
}

