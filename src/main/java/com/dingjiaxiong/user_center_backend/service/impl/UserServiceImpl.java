package com.dingjiaxiong.user_center_backend.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.dingjiaxiong.user_center_backend.model.User;
import com.dingjiaxiong.user_center_backend.service.UserService;
import com.dingjiaxiong.user_center_backend.mapper.UserMapper;
import org.springframework.stereotype.Service;

/**
* @author DingJiaxiong
* @description 针对表【user(用户)】的数据库操作Service实现
* @createDate 2024-06-27 12:48:36
*/
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User>
    implements UserService{

}




