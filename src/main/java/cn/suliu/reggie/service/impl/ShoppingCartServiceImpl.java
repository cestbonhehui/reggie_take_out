package cn.suliu.reggie.service.impl;

import cn.suliu.reggie.entity.ShoppingCart;
import cn.suliu.reggie.mapper.ShoppingCartMapper;
import cn.suliu.reggie.service.ShoppingCartService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * @Author admin
 * @Date 2022/8/10 19:49
 * @Version 1.0
 */
@Service
public class ShoppingCartServiceImpl extends ServiceImpl<ShoppingCartMapper, ShoppingCart> implements ShoppingCartService {
}
