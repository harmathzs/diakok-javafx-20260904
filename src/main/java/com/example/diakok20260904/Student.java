package com.example.diakok20260904;

public class Student {
    private int az;

    public void setAz(int az) {
        this.az = az;
    }

    public int getAz() {
        return az;
    }

    private String vnev;

    public String getVnev() {
        return vnev;
    }

    public void setVnev(String vnev) {
        this.vnev = vnev;
    }

    private String knev;

    public String getKnev() {
        return knev;
    }

    public void setKnev(String knev) {
        this.knev = knev;
    }

    private char nem;

    public char getNem() {
        return nem;
    }

    public void setNem(char nem) {
        this.nem = nem;
    }

    private String osztaly;

    public String getOsztaly() {
        return osztaly;
    }

    public void setOsztaly(String osztaly) {
        this.osztaly = osztaly;
    }

    private String datum;

    public String getDatum() {
        return datum;
    }

    public void setDatum(String datum) {
        this.datum = datum;
    }

    private String lakhely;

    public String getLakhely() {
        return lakhely;
    }

    public void setLakhely(String lakhely) {
        this.lakhely = lakhely;
    }
    private int magas;

    public int getMagas() {
        return magas;
    }

    public void setMagas(int magas) {
        this.magas = magas;
    }



    public Student(String line) {
        String[] split = line.split(";");
        setAz(Integer.parseInt(split[0]));
        setVnev(split[1]);
        setKnev(split[2]);
        setNem(split[3].charAt(0));
        setOsztaly(split[4]);
        setDatum(split[5]);
        setLakhely(split[6]);
        setMagas(Integer.parseInt(split[7]));
    }
}
