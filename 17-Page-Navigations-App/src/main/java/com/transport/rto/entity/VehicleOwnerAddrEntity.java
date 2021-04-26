package com.transport.rto.entity;


import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import lombok.Data;
/**
 * this entity is used to set data from  VehicleOwnerAddr UI store in that class with help of BeanUtils
 * and send data to VehicleOwnerAddrRepository 
 * 
 * @author Rituraj
 *
 */

@Data
@Entity
@Table(name="vhcl_Owner_addr")
public class VehicleOwnerAddrEntity {
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "ownerId_generator")
	@SequenceGenerator(name="ownerId_generator", sequenceName = "ADRR_ID_SEQ")
	private Integer addressId;
	@Column(name="House_No",length =40)
	private String houseNo;
	@Column(name="Street_Name",length =40)
	private String streetName;	
	@Column(name="city",length =30)
	private String city;
	private Integer  zip;
	
	@Temporal(TemporalType.TIMESTAMP)
	@CreationTimestamp
	private Date create_Dt;
	@Temporal(TemporalType.TIMESTAMP)
	@UpdateTimestamp
	private Date update_Dt;
	
	@OneToOne(cascade = CascadeType.ALL,orphanRemoval=true)
	@JoinColumn(name="vehicle_Owner_Id")
	private VehicleOwnerDtlsEntity dtlsEntity;
	
}
