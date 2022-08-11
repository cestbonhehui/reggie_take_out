package cn.suliu.reggie.service;

import cn.suliu.reggie.dto.DishDto;
import cn.suliu.reggie.entity.Dish;
import com.baomidou.mybatisplus.extension.service.IService;

/**
 * @Author admin
 * @Date 2022/8/9 18:48
 * @Version 1.0
 */
public interface DishService extends IService<Dish> {
    void saveWithFlavor(DishDto dishDto);

    DishDto getByIdWithFlavor(Long id);

    void updateWithFlavor(DishDto dishDto);
}
