package com.finlabs.finexa.model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the pdfParserCount database table.
 * 
 */
@Entity
@Table(name="pdfParserCount")
@NamedQuery(name="PdfParserCount.findAll", query="SELECT p FROM PdfParserCount p")
public class PdfParserCount implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private PdfParserCountPK id;

	private Integer parseCount;

	public PdfParserCount() {
	}

	public PdfParserCountPK getId() {
		return this.id;
	}

	public void setId(PdfParserCountPK id) {
		this.id = id;
	}

	public Integer getParseCount() {
		return this.parseCount;
	}

	public void setParseCount(Integer parseCount) {
		this.parseCount = parseCount;
	}

}