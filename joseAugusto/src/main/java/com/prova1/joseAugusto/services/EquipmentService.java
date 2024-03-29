package com.prova1.joseAugusto.services;


import com.prova1.joseAugusto.entities.Equipment;
import com.prova1.joseAugusto.repositories.EquipmentRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EquipmentService {

    @Autowired
    private EquipmentRepository repo;

    public Equipment save(Equipment equip) {
        return repo.saveAndFlush(equip);
    }

    public List<Equipment> findAll() {
        return repo.findAll();
    }

    public Equipment update(Equipment equip) {
        return repo.saveAndFlush(equip);
    }

    public Optional<Equipment> findById(Long id) {
        return repo.findById(id);
    }

    @Transactional
    public void delete(Equipment equip) {
        repo.delete(equip);
    }
}
