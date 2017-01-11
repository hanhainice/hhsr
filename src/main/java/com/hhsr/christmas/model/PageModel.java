package com.hhsr.christmas.model;

import lombok.Data;

/**
 * 分页信息
 */
@Data
public class PageModel {
    private Integer pageNum;
    private Integer pageSize;
    private String orderBy;
    private Boolean countSql;
    private Boolean pageSizeZero;
    private Boolean reasonable;
}
