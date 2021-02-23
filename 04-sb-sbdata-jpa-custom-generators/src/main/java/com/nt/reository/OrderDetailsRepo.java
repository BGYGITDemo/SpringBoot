package com.nt.reository;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.nt.entity.OrderDetailsEntity;

@Repository
public interface OrderDetailsRepo extends JpaRepository<OrderDetailsEntity, Serializable> {

}
