package com.huesca.choferes.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.huesca.choferes.models.Chofer;

public interface IChoferesDao extends JpaRepository<Chofer, Long> {

}
