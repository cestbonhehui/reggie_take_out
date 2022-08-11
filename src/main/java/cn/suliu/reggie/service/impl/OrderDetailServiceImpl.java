package cn.suliu.reggie.service.impl;

import cn.suliu.reggie.entity.OrderDetail;
import cn.suliu.reggie.mapper.OrderDetailMapper;
import cn.suliu.reggie.service.OrderDetailService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * @Author admin
 * @Date 2022/8/10 20:17
 * @Version 1.0
 */
@Service
public class OrderDetailServiceImpl extends ServiceImpl<OrderDetailMapper, OrderDetail> implements OrderDetailService {
}
