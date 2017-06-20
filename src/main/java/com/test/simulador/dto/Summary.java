package com.test.simulador.dto;

import org.codehaus.jackson.annotate.JsonProperty;

public class Summary {

	private String question;

	@JsonProperty("additional_information")
	private String additionalInformation;

	public String getQuestion() {
		return question;
	}

	public void setQuestion(String question) {
		this.question = question;
	}

	public String getAdditionalInformation() {
		return additionalInformation;
	}

	public void setAdditionalInformation(String additionalInformation) {
		this.additionalInformation = additionalInformation;
	}

	@Override
	public String toString() {
		return "Summary [question=" + question + ", additionalInformation=" + additionalInformation + "]";
	}

}
