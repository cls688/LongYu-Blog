package com.longyu.common.domain.vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class HotArticleVo implements Serializable {
    private static final long serialVersionUID = 1L;
    private Long id;
    //标题
    private String title;
    //访问量
    private Long viewCount;
}