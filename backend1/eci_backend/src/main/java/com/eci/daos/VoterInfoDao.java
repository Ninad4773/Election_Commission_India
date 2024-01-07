package com.eci.daos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.eci.entities.VoterInfo;

public interface VoterInfoDao extends JpaRepository<VoterInfo, Integer> {

}
