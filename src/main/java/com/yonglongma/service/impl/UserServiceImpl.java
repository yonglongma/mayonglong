package com.yonglongma.service.impl;

import com.yonglongma.core.AbstractService;
import com.yonglongma.dao.UserMapper;
import com.yonglongma.model.User;
import com.yonglongma.service.UserService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import javax.annotation.Resource;


/**
 * Created by CodeGenerator on 2018/08/18.
 */
@Service
@Transactional
public class UserServiceImpl extends AbstractService<User> implements UserService {
    @Resource
    private UserMapper userMapper;

}
