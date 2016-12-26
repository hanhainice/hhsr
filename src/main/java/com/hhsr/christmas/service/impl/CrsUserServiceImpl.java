package com.hhsr.christmas.service.impl;

import com.hhsr.christmas.entity.CrsUser;
import com.hhsr.christmas.service.UserService;
import org.springframework.stereotype.Service;


/**
 * @author liuzh_3nofxnp
 * @since 2015-09-19 17:17
 */
@Service("userService")
public class CrsUserServiceImpl extends BaseService<CrsUser> implements UserService {

    @Override
    public CrsUser selectByUser(CrsUser user) {
        return selectByKey(user.getId());
    }

}
