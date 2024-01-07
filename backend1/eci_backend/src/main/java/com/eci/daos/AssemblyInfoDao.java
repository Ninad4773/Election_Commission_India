package com.eci.daos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.eci.entities.AssemblyInfo;

public interface AssemblyInfoDao extends JpaRepository<AssemblyInfo, Integer> {

}
