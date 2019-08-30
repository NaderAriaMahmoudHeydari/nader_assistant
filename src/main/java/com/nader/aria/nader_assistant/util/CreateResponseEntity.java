package com.nader.aria.nader_assistant.util;

import org.springframework.http.ResponseEntity;
import java.io.Serializable;

public interface CreateResponseEntity  extends Serializable {

    public ResponseEntity<?> getResponseEntity();

    public ResponseEntity<?> getResponseEntity(Object o);
}
