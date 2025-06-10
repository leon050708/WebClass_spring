package org.example.webclass.mapper;

import org.example.webclass.model.Class;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.example.webclass.model.ClassDto;
import org.example.webclass.model.Class_sc;
import org.example.webclass.model.Class_scDto;

import java.util.List;

@Mapper
public interface ClassMapper {
    List<Class> findByCriteria(ClassDto criteria);

    List<Class_sc> findByCriteria_sc(Class_scDto criteria);
}
