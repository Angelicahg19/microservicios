package com.huesca.camiones.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.huesca.camiones.models.Camion;

public interface ICamionesDao extends JpaRepository<Camion , Long> {


}
