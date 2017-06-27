package com.test.environment.dto;

import java.util.Arrays;

public class WorkingHours {
	private String[] qua;

	private String[] sex;

	private String[] seg;

	private String[] sab;

	private String[] dom;

	private String[] qui;

	private String[] ter;

	public String[] getQua() {
		return qua;
	}

	public void setQua(String[] qua) {
		this.qua = qua;
	}

	public String[] getSex() {
		return sex;
	}

	public void setSex(String[] sex) {
		this.sex = sex;
	}

	public String[] getSeg() {
		return seg;
	}

	public void setSeg(String[] seg) {
		this.seg = seg;
	}

	public String[] getSab() {
		return sab;
	}

	public void setSab(String[] sab) {
		this.sab = sab;
	}

	public String[] getDom() {
		return dom;
	}

	public void setDom(String[] dom) {
		this.dom = dom;
	}

	public String[] getQui() {
		return qui;
	}

	public void setQui(String[] qui) {
		this.qui = qui;
	}

	public String[] getTer() {
		return ter;
	}

	public void setTer(String[] ter) {
		this.ter = ter;
	}
	
	public WorkingHours() {
	}
	
	public WorkingHours(String[] qua, String[] sex, String[] seg, String[] sab, String[] dom, String[] qui,
			String[] ter) {
		super();
		this.qua = qua;
		this.sex = sex;
		this.seg = seg;
		this.sab = sab;
		this.dom = dom;
		this.qui = qui;
		this.ter = ter;
	}

	@Override
	public String toString() {
		return "WorkingHours [qua=" + Arrays.toString(qua) + ", sex=" + Arrays.toString(sex) + ", seg="
				+ Arrays.toString(seg) + ", sab=" + Arrays.toString(sab) + ", dom=" + Arrays.toString(dom) + ", qui="
				+ Arrays.toString(qui) + ", ter=" + Arrays.toString(ter) + "]";
	}

}
