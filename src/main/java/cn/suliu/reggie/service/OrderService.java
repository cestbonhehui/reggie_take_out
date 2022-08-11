package cn.suliu.reggie.service;

import cn.suliu.reggie.entity.Orders;
import com.baomidou.mybatisplus.extension.service.IService;

/**
 * @Author admin
 * @Date 2022/8/10 20:16
 * @Version 1.0
 */
public interface OrderService extends IService<Orders> {
    void submit(Orders orders);
}