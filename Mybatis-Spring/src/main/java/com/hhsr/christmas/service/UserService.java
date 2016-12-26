package com.hhsr.christmas.service;

import com.hhsr.christmas.entity.CrsUser;


/**
 * @author liuzh_3nofxnp
 * @since 2015-09-19 17:17
 */
public interface UserService extends IService<CrsUser> {

    /**
     * 条件查询
     *
     * @param crsUser
     * @return
     */
    CrsUser selectByUser(CrsUser crsUser);

}
