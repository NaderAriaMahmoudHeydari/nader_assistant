package com.nader.aria.nader_assistant.entities.financial;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import com.nader.aria.nader_assistant.entities.abstracts.Fund;

@Entity
@DiscriminatorValue("CURRENT")
public class CurrentFund extends Fund {
	
	private static final long serialVersionUID = 1L;
	
}
