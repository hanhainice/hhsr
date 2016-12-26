package com.hhsr.christmas.entity;

import org.apache.commons.lang.builder.ToStringBuilder;

import java.io.Serializable;

/**
 * 非动作类，不带响应参数
 *
 * @author Miner
 */
public class BaseEntity implements Serializable {

    private static final long serialVersionUID = 1951436960547420065L;

    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

}
