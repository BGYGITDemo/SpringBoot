package com.nt.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Data
@Table(name="CONTACT_DTLS")
public class ContactDtlsEntity {

	@Id
	@Column(name= "C_ID")
	private String contactId;
	
	@Column(name= "C_NAME")
	private String contactName;
	
	@Column(name= "C_NUM")
	private Long contactNumber;
}
