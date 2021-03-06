package com.nt.repository;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.nt.entities.CustomerDtlsEntity;

@Repository
public interface CustomerDtlsRepo extends JpaRepository<CustomerDtlsEntity, Serializable>{

}
