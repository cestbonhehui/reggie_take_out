package cn.suliu.reggie.service;

import cn.suliu.reggie.dto.SetmealDto;
import cn.suliu.reggie.entity.Setmeal;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;

/**
 * @Author admin
 * @Date 2022/8/9 18:49
 * @Version 1.0
 */
public interface SetmealService extends IService<Setmeal> {
    void saveWithDish(SetmealDto setmealDto);

    void removeWithDish(List<Long> ids);
}
