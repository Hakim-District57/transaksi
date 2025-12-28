package ui.ft.ccit.faculty.transaksi.jenisbarang.model;

import jakarta.persistence.*;

@Entity
@Table(name = "jenis_barang")
public class JenisBarang {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_jenis_brg")
    private Byte idJenisBarang;

    @Column(name = "nama_jenis_brg", length = 20, nullable = false)
    private String nama;

    protected JenisBarang() {
        // JPA
    }

    public Byte getIdJenisBarang() {
        return idJenisBarang;
    }

    public void setIdJenisBarang(Byte idJenisBarang) {
        this.idJenisBarang = idJenisBarang;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }
}
