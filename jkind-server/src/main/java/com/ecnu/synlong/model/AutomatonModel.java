package com.ecnu.synlong.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.util.List;

/**
 * 自动机模型数据类
 */
@Data
public class AutomatonModel {
    
    /**
     * 声明部分
     */
    @JsonProperty("declaration")
    private String declaration;
    
    /**
     * 自动机列表
     */
    @JsonProperty("automatons")
    private List<Automaton> automatons;
    
    /**
     * 系统声明
     */
    @JsonProperty("system_declaration")
    private String systemDeclaration;
}
