package cn.suliu.reggie.service.impl;

import cn.suliu.reggie.entity.User;
import cn.suliu.reggie.mapper.UserMapper;
import cn.suliu.reggie.service.UserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * @Author admin
 * @Date 2022/8/10 16:38
 * @Version 1.0
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements UserService {
}
