package com.nt.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Data
@Table(name="CUSTOMER_DTLS")
public class CustomerDtlsEntity {

	 @Id
	 @SequenceGenerator(name = "abc", sequenceName = "CUSTOMER_ID_SEQ",allocationSize = 1)
	 @GeneratedValue(strategy = GenerationType.SEQUENCE,generator = "abc")
	 private Integer customerId;
	 private String customerName;
	 private String customerEmail;
}
