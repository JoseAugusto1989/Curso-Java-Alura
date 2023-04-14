package com.prova1.joseAugusto.controllers;

import com.prova1.joseAugusto.entities.Equipment;
import com.prova1.joseAugusto.services.EquipmentService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/equipment")
public class EquipmentController {

    @Autowired
    private EquipmentService service;

    @PostMapping("")
    public ResponseEntity<Equipment> saveEquip(@RequestBody Equipment equip) {
        return ResponseEntity.status(HttpStatus.CREATED).body(service.save(equip));
    }

    @GetMapping("getAll")
    public ResponseEntity<List<Equipment>> getAll() {
        return ResponseEntity.status(HttpStatus.OK).body(service.findAll());
    }

    @GetMapping("/{id}")
    public ResponseEntity<Object> getById(@PathVariable(value = "id") Long id) {
        Optional<Equipment> optionalEquipment = service.findById(id);
        if (!optionalEquipment.isPresent()) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Equipment not Found!");
        }
        return ResponseEntity.status(HttpStatus.OK).body(optionalEquipment.get());
    }

    @PutMapping("/{id}")
    public ResponseEntity<Object> delete(@PathVariable(value = "id") Long id,
                                         @RequestBody @Valid Equipment equip) {
        Optional<Equipment> optionalEquip = service.findById(id);
        if (!optionalEquip.isPresent()) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Equipment not found");
        }
        service.delete(optionalEquip.get());
        return ResponseEntity.status(HttpStatus.OK).body("Equipment updated sucessfully");
    }

    // teste do git

    @DeleteMapping("/{id}")
    public ResponseEntity<Object> deleteEquip(@PathVariable(value = "id") Long id) {
        Optional<Equipment> newEquip = service.findById(id);
        if (!newEquip.isPresent()) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Equipment not found");
        }
        service.delete(newEquip.get());
        return ResponseEntity.status(HttpStatus.OK).body("Equipment deleted successfully");
    }
}
