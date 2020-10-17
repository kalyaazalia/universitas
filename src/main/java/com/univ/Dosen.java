
package com.univ;

import com.univ.Pegawai;

public class Dosen extends Pegawai {

    private int tunjangan = 2613000;

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

