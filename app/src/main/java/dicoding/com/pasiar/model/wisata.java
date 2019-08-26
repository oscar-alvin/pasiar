package dicoding.com.pasiar.model;

public class wisata {
    private int id_t4w;
    private String nama_t4w;
    private String keterangan;
    private String lokasi;
    private int jarak;
    private int gambar;
    private String fasilitas;
    private int[] allImg;

    public int getId_t4w() {
        return id_t4w;
    }

    public void setId_t4w(int id_t4w) {
        this.id_t4w = id_t4w;
    }

    public String getNama_t4w() {
        return nama_t4w;
    }

    public void setNama_t4w(String nama_t4w) {
        this.nama_t4w = nama_t4w;
    }

    public String getKeterangan() {
        return keterangan;
    }

    public void setKeterangan(String keterangan) {
        this.keterangan = keterangan;
    }

    public String getLokasi() {
        return lokasi;
    }

    public void setLokasi(String lokasi) {
        this.lokasi = lokasi;
    }

    public int getJarak() {
        return jarak;
    }

    public void setJarak(int jarak) {
        this.jarak = jarak;
    }

    public int getGambar() {
        return gambar;
    }

    public void setGambar(int gambar) {
        this.gambar = gambar;
    }

    public String getFasilitas() {
        return fasilitas;
    }

    public void setFasilitas(String fasilitas) {
        this.fasilitas = fasilitas;
    }

    public int[] getAllImg() {
        return allImg;
    }

    public void setAllImg(int[] allImg) {
        this.allImg = allImg;
    }
}
