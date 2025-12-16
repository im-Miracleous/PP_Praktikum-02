package TimeConverterApp;/*
 * PRAKTIKUM 02 "IN234 Paradigma Pemrograman" - SOAL 1
 * Nama Program : TimeConverterApp.TimeConverter
 * Deskripsi    : Program mengonversi input detik menjadi format HH:MM:SS
 * Penulis      : Miracle Steven Gerrald
 * NRP          : 2472019
*/

public class TimeConverter {
    private int second;

    public TimeConverter() {
    }

    public TimeConverter(int second) {
        this.second = second;
    }

    public int getSecond() {
        return second;
    }

    public void setSecond(int second) {
        this.second = Math.abs(second);
    }

    public String showTime() {
        int hh = this.second / 3600;
        int mm = this.second % 3600 / 60;
        int ss = this.second % 60;
        String timestamp = String.format("%02d:%02d:%02d", hh, mm, ss);
        return timestamp;
    }
}
