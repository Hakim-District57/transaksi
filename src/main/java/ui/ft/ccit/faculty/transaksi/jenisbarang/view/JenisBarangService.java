package ui.ft.ccit.faculty.transaksi.jenisbarang.view;

import ui.ft.ccit.faculty.transaksi.DataNotFoundException;
import ui.ft.ccit.faculty.transaksi.jenisbarang.model.JenisBarang;
import ui.ft.ccit.faculty.transaksi.jenisbarang.model.JenisBarangRepository;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class JenisBarangService {

    private final JenisBarangRepository repository;

    public JenisBarangService(JenisBarangRepository repository) {
        this.repository = repository;
    }

    public List<JenisBarang> getAll() {
        return repository.findAll();
    }

    public JenisBarang getById(Byte id) {
        return repository.findById(id)
                .orElseThrow(() ->
                        new DataNotFoundException("JenisBarang", id.toString()));
    }

    // CREATE
    public JenisBarang save(JenisBarang jenisBarang) {
        // ID TIDAK BOLEH DIISI (AUTO_INCREMENT)
        jenisBarang.setIdJenisBarang(null);
        return repository.save(jenisBarang);
    }

    // UPDATE
    public JenisBarang update(Byte id, JenisBarang updated) {
        JenisBarang existing = getById(id);
        existing.setNama(updated.getNama());
        return repository.save(existing);
    }

    // DELETE
    public void delete(Byte id) {
        if (!repository.existsById(id)) {
            throw new DataNotFoundException("JenisBarang", id.toString());
        }
        repository.deleteById(id);
    }
}
