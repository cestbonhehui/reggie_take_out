package cn.suliu.reggie.dto;

import cn.suliu.reggie.entity.Setmeal;
import cn.suliu.reggie.entity.SetmealDish;
import lombok.Data;

import java.util.List;

/**
 * @Author admin
 * @Date 2022/8/10 11:06
 * @Version 1.0
 */
@Data
public class SetmealDto extends Setmeal {

    private List<SetmealDish> setmealDishes;//套餐关联的菜品集合

    private String categoryName;//分类名称
}