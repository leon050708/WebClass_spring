package org.example.webclass.controller;

import org.example.webclass.mapper.ClassMapper;
import org.example.webclass.model.Class;
import org.example.webclass.model.ClassDto;
import org.example.webclass.model.Class_sc;
import org.example.webclass.model.Class_scDto;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
public class ClassController {
    private final ClassMapper classMapper;

    public ClassController(ClassMapper classMapper) {
        this.classMapper = classMapper;
    }

    @PostMapping("/searchClasses")
    public ResponseEntity<List<Class>> searchClasses(@RequestBody ClassDto criteria) {

        List<Class> classes = classMapper.findByCriteria(criteria);
        System.out.println("classes size: " + classes.size());
        return ResponseEntity.ok(classes);
    }

    @PostMapping("/searchscClasses")
    public ResponseEntity<List<Class_sc>> searchscClasses(@RequestBody Class_scDto criteria_sc) {

        List<Class_sc> classes = classMapper.findByCriteria_sc(criteria_sc);
        System.out.println("classes size: " + classes.size());
        return ResponseEntity.ok(classes);
    }
}