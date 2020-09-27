package com.shop.commerce.catalog.model;

import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.annotation.*;

@Document(collection = "database_sequence")
public class DatabaseSequence {

	@Id
	private String Id;
	private long seq;
	
	public DatabaseSequence() {}

	public String getId() {
		return Id;
	}

	public void setId(String id) {
		Id = id;
	}

	public long getSeq() {
		return seq;
	}

	public void setSeq(long seq) {
		this.seq = seq;
	}

}
