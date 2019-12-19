package com.proj.shirodemo.service.impl;

import com.proj.shirodemo.dao.UserMapper;
import com.proj.shirodemo.service.UserService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;

/**
 * 用户服务实现类
 * @author wuge
 * @date 2019/12/19
 */
@Service
@Transactional(rollbackFor = Exception.class)
public class UserServiceImpl implements UserService {

    /**
     * 注入UserMapper
     */
    @Resource
    private UserMapper userMapper;
}