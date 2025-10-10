package com.ecnu.synlong.request;

import lombok.Data;

import javax.validation.constraints.NotEmpty;

@Data
public class VerifyParameter {
	@NotEmpty(message = "模型id不能为空")
	private int id;

	@NotEmpty(message = "模型性质不能为空")
	private String property;
	
	public int getId() {
		return id;
	}
	
	public String getProperty() {
		return property;
	}
}
