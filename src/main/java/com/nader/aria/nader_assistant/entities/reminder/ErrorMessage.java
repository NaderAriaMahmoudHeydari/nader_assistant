package com.nader.aria.nader_assistant.entities.reminder;

import com.nader.aria.nader_assistant.entities.abstracts.Message;
import javax.persistence.Entity;
import javax.persistence.DiscriminatorValue;

@Entity
@DiscriminatorValue("ERROR_MESSAGE")
public class ErrorMessage extends Message {

	private static final long serialVersionUID = 1L;

}
