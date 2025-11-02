package com.ecnu.synlong.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

/**
 * 位置（状态）数据类
 */
@Data
public class Location {
    
    /**
     * 位置ID
     */
    @JsonProperty("id")
    private Integer id;
    
    /**
     * 位置名称（包含坐标的对象）
     */
    @JsonProperty("name")
    private NamedContent name;
    
    /**
     * 不变量（包含坐标的对象）
     */
    @JsonProperty("invariant")
    private NamedContent invariant;
    
    /**
     * 位置坐标
     */
    @JsonProperty("x")
    private Double x;
    
    @JsonProperty("y")
    private Double y;
    
    /**
     * 带坐标的内容对象
     */
    @Data
    public static class NamedContent {
        @JsonProperty("content")
        private String content;
        
        @JsonProperty("x")
        private Double x;
        
        @JsonProperty("y")
        private Double y;
    }
}
