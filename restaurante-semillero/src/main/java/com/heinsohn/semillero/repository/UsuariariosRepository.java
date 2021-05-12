package com.heinsohn.semillero.repository;

import org.springframework.stereotype.Repository;


import org.springframework.data.repository.CrudRepository;

import com.heinsohn.semillero.dto.*;


@Repository
public interface UsuariariosRepository extends CrudRepository<UsuarioDTO, Integer> {

}
