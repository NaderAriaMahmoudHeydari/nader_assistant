package com.nader.aria.nader_assistant.entities.abstracts;

import java.io.Serializable;
import javax.persistence.*;

@MappedSuperclass
public abstract class BaseEntity implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name = "ID",unique=true, nullable = false)
	private Long id;

	@Version
	@Column(name = "VERSION",unique = true,nullable = false)
	private Long version;


	public Long getId() { return id; }
	public void setId(Long id) { this.id = id; }


	public Long getVersion(){ return version; }
	public void setVersion(Long version){ this.version = version; }

}
