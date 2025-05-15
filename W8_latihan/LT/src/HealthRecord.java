public class HealthRecord {
    private String nomorRekam;
    private String tanggalBuat;

    public HealthRecord(String nomorRekam) {
        this.nomorRekam = nomorRekam;
        this.tanggalBuat = "Hari ini";
    }

    public String getNomorRekam() {
        return nomorRekam;
    }

    public String getTanggalBuat() {
        return tanggalBuat;
    }

    public String toString() {
        return "Nomor Rekam: " + nomorRekam + ", Dibuat pada: " + tanggalBuat;
    }
}