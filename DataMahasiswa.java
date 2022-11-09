public class DataMahasiswa {
    private int nim;
    private String nama;
    private String alamat;
    private String universitas;

    public int get_nim(){
        return nim;
    }
    public void set_nim(int nim) {
        this.nim = nim;
    }

    public String get_nama() {
        return nama;
    }

    public void set_nama(String nama) {
        this.nama = nama;
    }

    public String get_alamat() {
        return alamat;
    }

    public void set_alamat(String alamat) {
        this.alamat = alamat;
    }

    public void set_univ(String universitas) {
        this.universitas = universitas;
    }

    public String get_univ() {
        return universitas;
    }
}
