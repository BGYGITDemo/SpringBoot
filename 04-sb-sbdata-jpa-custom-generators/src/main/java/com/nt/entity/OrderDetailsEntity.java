package com.nt.entity;



import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

import lombok.Data;

@Entity
@Data
@Table(name = "ORDER_DTLS")
public class OrderDetailsEntity {
 
	 @Id
	 @Column(name="ORDER_ID") //OD1,OD2
	 @GenericGenerator(name = "order_id_gen", strategy = "com.nt.generators.OrderIdGenerator")
	 @GeneratedValue(generator = "order_id_gen")
	 private String orderId;
	 
	 @Column(name="ORDER_BY")
	 private String orderBy;
	 
	 @Column(name="ORDER_PLACED_DT")
	 private Date orderPlaceDate;
}
