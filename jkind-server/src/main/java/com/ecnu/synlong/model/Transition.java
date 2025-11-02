package com.ecnu.synlong.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.util.List;

/**
 * 转换数据类
 */
@Data
public class Transition {
    
    /**
     * 转换ID
     */
    @JsonProperty("id")
    private Integer id;
    
    /**
     * 源状态ID
     */
    @JsonProperty("sourceId")
    private Integer sourceId;
    
    /**
     * 目标状态ID
     */
    @JsonProperty("targetId")
    private Integer targetId;
    
    /**
     * 转折点坐标
     */
    @JsonProperty("nails")
    private List<Nail> nails;
    
    /**
     * 选择条件（包含坐标的对象）
     */
    @JsonProperty("select")
    private ContentWithPosition select;
    
    /**
     * 守卫条件（包含坐标的对象）
     */
    @JsonProperty("guard")
    private ContentWithPosition guard;
    
    /**
     * 同步条件（包含坐标的对象）
     */
    @JsonProperty("sync")
    private ContentWithPosition sync;
    
    /**
     * 更新语句（包含坐标的对象）
     */
    @JsonProperty("update")
    private ContentWithPosition update;
    
    /**
     * 转折点坐标
     */
    @Data
    public static class Nail {
        @JsonProperty("x")
        private Double x;
        
        @JsonProperty("y")
        private Double y;
    }
    
    /**
     * 带坐标的内容对象
     */
    @Data
    public static class ContentWithPosition {
        @JsonProperty("content")
        private String content;
        
        @JsonProperty("x")
        private Double x;
        
        @JsonProperty("y")
        private Double y;
    }
}
