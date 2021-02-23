package com.nt.repository;

import java.io.Serializable;
import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.nt.entities.ContactDtlsEntity;

@Repository
public interface ContactDtlsRepository extends CrudRepository<ContactDtlsEntity, Serializable>{

	//select * from contact_dtls where c_name=?
	public ContactDtlsEntity findByContactName(String name); 
	
	//select * from contact_dtls where c_num=?
	public ContactDtlsEntity findByContactNumber(Long number); 
	
	//select * from contact_dtls where c_name=? and c_num=?
	public ContactDtlsEntity findByContactNameAndContactNumber(String name,Long number); 
	
	@Query("select contactName from ContactDtlsEntity where contactId=:cid")
	public String getContactNameByContactId(String cid);
	
	@Query("from ContactDtlsEntity where contactName like 'S%'")
	public List<ContactDtlsEntity> getAllContactStartsWithSChar();
    
	@Query("select contactName from ContactDtlsEntity")
	public List<String> getAllContactNames();
}

