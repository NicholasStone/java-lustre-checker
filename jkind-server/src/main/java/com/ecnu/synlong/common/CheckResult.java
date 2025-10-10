package com.ecnu.synlong.common;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;

@Data
public class CheckResult {
	/**
	 * 是否验证成功
	 */
	@JsonIgnore
	private CheckStatus status;

	/**
	 * 验证结果的具体信息
	 */
	private String result;


	private CheckResult(CheckStatus status, String result) {
		this.status = status;
		this.result = result;
	}

	public static CheckResult success(String result) {
		return new CheckResult(CheckStatus.SUCCESS, result);
	}

	public static CheckResult fail(String result) {
		return new CheckResult(CheckStatus.ERROR, result);
	}
	
	public CheckStatus getStatus() {
		return status;
	}
	
	public String getResult() {
		return result;
	}
}
