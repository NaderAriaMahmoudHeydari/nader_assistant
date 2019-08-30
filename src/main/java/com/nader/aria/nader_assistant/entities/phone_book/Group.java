package com.nader.aria.nader_assistant.entities.phone_book;

import com.nader.aria.nader_assistant.entities.abstracts.BaseEntity;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Column;


@Entity
@Table(name="GROUPS" )
public class Group extends BaseEntity {

	private static final long serialVersionUID = 1L;
	
	@Column(name="NAME")
	private String name;
	
	@Column(name="DESCRIPTION"  )
	private String description;
	
	public String getName() { return name; }
	public void setName(String name) { this.name = name; }
	
	public String getDescription() { return description; }
	public void setDescription(String description) { this.description = description;}


}
