package com.ecnu.synlong.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.util.List;

/**
 * 自动机数据类
 */
@Data
public class Automaton {
    
    /**
     * 自动机名称
     */
    @JsonProperty("name")
    private String name;
    
    /**
     * 参数列表
     */
    @JsonProperty("parameters")
    private String parameters;
    
    /**
     * 初始状态ID
     */
    @JsonProperty("init")
    private Integer init;
    
    /**
     * 声明部分
     */
    @JsonProperty("declaration")
    private String declaration;
    
    /**
     * 位置（状态）列表
     */
    @JsonProperty("locations")
    private List<Location> locations;
    
    /**
     * 转换列表
     */
    @JsonProperty("transitions")
    private List<Transition> transitions;
}
