package com.test.dto;

import java.util.Arrays;

public class WarmUps {
	private String[] seg;
	private String[] ter;
	private String[] qua;
	private String[] qui;
	private String[] sex;
	private String[] sab;
	private String[] dom;

	public String[] getSeg() {
		return seg;
	}

	public void setSeg(String[] seg) {
		this.seg = seg;
	}

	public String[] getTer() {
		return ter;
	}

	public void setTer(String[] ter) {
		this.ter = ter;
	}

	public String[] getQua() {
		return qua;
	}

	public void setQua(String[] qua) {
		this.qua = qua;
	}

	public String[] getQui() {
		return qui;
	}

	public void setQui(String[] qui) {
		this.qui = qui;
	}

	public String[] getSex() {
		return sex;
	}

	public void setSex(String[] sex) {
		this.sex = sex;
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
	
	public WarmUps() {
	}

	public WarmUps(String[] seg, String[] ter, String[] qua, String[] qui, String[] sex, String[] sab, String[] dom) {
		super();
		this.seg = seg;
		this.ter = ter;
		this.qua = qua;
		this.qui = qui;
		this.sex = sex;
		this.sab = sab;
		this.dom = dom;
	}

	@Override
	public String toString() {
		return "WarmUps [seg=" + Arrays.toString(seg) + ", ter=" + Arrays.toString(ter) + ", qua="
				+ Arrays.toString(qua) + ", qui=" + Arrays.toString(qui) + ", sex=" + Arrays.toString(sex) + ", sab="
				+ Arrays.toString(sab) + ", dom=" + Arrays.toString(dom) + "]";
	}

}
