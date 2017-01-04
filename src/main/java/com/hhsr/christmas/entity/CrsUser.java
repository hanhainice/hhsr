package com.hhsr.christmas.entity;

import java.util.Date;
import javax.persistence.*;

@Table(name = "crs_user")
public class CrsUser {
    /**
     * 用户id
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    /**
     * 游戏分数
     */
    private Integer score;

    /**
     * 创建时间
     */
    @Column(name = "create_time")
    private Date createTime;

    /**
     * 用户得分袜子编号，用|分隔
     */
    @Column(name = "score_detail")
    private String scoreDetail;

    /**
     * 用户类型（QQ：1，微信：2）
     */
    @Column(name = "user_type")
    private Integer userType;

    /**
     * 推广人员编号
     */
    @Column(name = "people_num")
    private String peopleNum;

    /**
     * 0:没有参加，1：已经参加过
     */
    @Column(name = "is_played")
    private Integer isPlayed;

    /**
     * 获取用户id
     *
     * @return id - 用户id
     */
    public Integer getId() {
        return id;
    }

    /**
     * 设置用户id
     *
     * @param id 用户id
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * 获取游戏分数
     *
     * @return score - 游戏分数
     */
    public Integer getScore() {
        return score;
    }

    /**
     * 设置游戏分数
     *
     * @param score 游戏分数
     */
    public void setScore(Integer score) {
        this.score = score;
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
     * 获取用户得分袜子编号，用|分隔
     *
     * @return score_detail - 用户得分袜子编号，用|分隔
     */
    public String getScoreDetail() {
        return scoreDetail;
    }

    /**
     * 设置用户得分袜子编号，用|分隔
     *
     * @param scoreDetail 用户得分袜子编号，用|分隔
     */
    public void setScoreDetail(String scoreDetail) {
        this.scoreDetail = scoreDetail;
    }

    /**
     * 获取用户类型（QQ：1，微信：2）
     *
     * @return user_type - 用户类型（QQ：1，微信：2）
     */
    public Integer getUserType() {
        return userType;
    }

    /**
     * 设置用户类型（QQ：1，微信：2）
     *
     * @param userType 用户类型（QQ：1，微信：2）
     */
    public void setUserType(Integer userType) {
        this.userType = userType;
    }

    /**
     * 获取推广人员编号
     *
     * @return people_num - 推广人员编号
     */
    public String getPeopleNum() {
        return peopleNum;
    }

    /**
     * 设置推广人员编号
     *
     * @param peopleNum 推广人员编号
     */
    public void setPeopleNum(String peopleNum) {
        this.peopleNum = peopleNum;
    }

    /**
     * 获取0:没有参加，1：已经参加过
     *
     * @return is_played - 0:没有参加，1：已经参加过
     */
    public Integer getIsPlayed() {
        return isPlayed;
    }

    /**
     * 设置0:没有参加，1：已经参加过
     *
     * @param isPlayed 0:没有参加，1：已经参加过
     */
    public void setIsPlayed(Integer isPlayed) {
        this.isPlayed = isPlayed;
    }
}