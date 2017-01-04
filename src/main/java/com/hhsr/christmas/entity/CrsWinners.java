package com.hhsr.christmas.entity;

import java.util.Date;
import javax.persistence.*;

@Table(name = "crs_winners")
public class CrsWinners {
    /**
     * 中奖者ID
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    /**
     * 中奖手机号码
     */
    private String phone;

    /**
     * 创建时间
     */
    @Column(name = "create_time")
    private Date createTime;

    @Column(name = "win_type")
    private Integer winType;

    /**
     * 获取中奖者ID
     *
     * @return id - 中奖者ID
     */
    public Integer getId() {
        return id;
    }

    /**
     * 设置中奖者ID
     *
     * @param id 中奖者ID
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * 获取中奖手机号码
     *
     * @return phone - 中奖手机号码
     */
    public String getPhone() {
        return phone;
    }

    /**
     * 设置中奖手机号码
     *
     * @param phone 中奖手机号码
     */
    public void setPhone(String phone) {
        this.phone = phone;
    }

    /**
     * 获取创建时间
     *
     * @return create_time - 创建时间
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * 设置创建时间
     *
     * @param createTime 创建时间
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * @return win_type
     */
    public Integer getWinType() {
        return winType;
    }

    /**
     * @param winType
     */
    public void setWinType(Integer winType) {
        this.winType = winType;
    }
}