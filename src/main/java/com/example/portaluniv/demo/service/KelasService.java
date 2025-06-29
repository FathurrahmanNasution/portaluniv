package com.example.portaluniv.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.portaluniv.demo.entity.Kelas;
import com.example.portaluniv.demo.repository.KelasRepository;

@Service
@Transactional
public class KelasService {
    
    @Autowired
    private KelasRepository kelasRepository;
    
    public List<Kelas> findAll() {
        return kelasRepository.findAll();
    }
    
    public Optional<Kelas> findById(Long id) {
        return kelasRepository.findById(id);
    }
    
    public List<Kelas> findByKodeMataKuliah(String kodeMk) {
        return kelasRepository.findByMataKuliahKodeMk(kodeMk);
    }
    
    public Optional<Kelas> findByKodeMataKuliahAndKelas(String kodeMk, String kelas) {
        return kelasRepository.findByMataKuliahKodeMkAndKelas(kodeMk, kelas);
    }
    
    public List<Kelas> findByMataKuliahId(Long mataKuliahId) {
        return kelasRepository.findByMataKuliahId(mataKuliahId);
    }
    
    public List<Kelas> findByDosenId(Long dosenId) {
        return kelasRepository.findByDosenId(dosenId);
    }
    
    public List<Kelas> findByKelasContaining(String kelas) {
        return kelasRepository.findByKelasContaining(kelas);
    }
    
    public List<Kelas> findByJadwalContaining(String jadwal) {
        return kelasRepository.findByJadwalContaining(jadwal);
    }
    
    public List<Kelas> findByRuangan(String ruangan) {
        return kelasRepository.findByRuangan(ruangan);
    }
    
    public List<Kelas> findByProdi(String prodi) {
        return kelasRepository.findByMataKuliahProgramStudi(prodi);
    }
    
    public List<Kelas> findBySemester(int semester) {
        return kelasRepository.findByMataKuliahSemester(semester);
    }
    
    public List<Kelas> findByProdiAndSemester(String prodi, int semester) {
        return kelasRepository.findByMataKuliahProgramStudiAndMataKuliahSemester(prodi, semester);
    }
    
    public Kelas save(Kelas kelas) {
        return kelasRepository.save(kelas);
    }
    
    public void deleteById(Long id) {
        kelasRepository.deleteById(id);
    }
    
    public boolean existsByKodeMataKuliah(String kodeMk) {
        return kelasRepository.existsByMataKuliahKodeMk(kodeMk);
    }
}