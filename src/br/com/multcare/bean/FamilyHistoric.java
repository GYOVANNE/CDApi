package br.com.multcare.bean;

import java.util.ArrayList;

public class FamilyHistoric extends LaboratoryExams {
        @Override
    	public void setContent(ArrayList <String> content) {
		this.content = content;
	}
        @Override
	public ArrayList <String> getContent() {
		return content;
	}
}