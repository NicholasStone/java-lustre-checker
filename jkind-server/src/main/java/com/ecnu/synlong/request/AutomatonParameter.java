package com.ecnu.synlong.request;

import lombok.Data;

import javax.validation.constraints.NotEmpty;

@Data
public class AutomatonParameter {
	@NotEmpty(message = "模型文件不能为空")
	private String file;
	
	public String getFile() {
		return file;
	}
}
