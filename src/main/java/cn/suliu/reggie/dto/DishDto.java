package cn.suliu.reggie.dto;

import cn.suliu.reggie.entity.Dish;
import cn.suliu.reggie.entity.DishFlavor;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author admin
 * @Date 2022/8/9 20:04
 * @Version 1.0
 */
@Data
public class DishDto extends Dish {
    private List<DishFlavor> flavors = new ArrayList<>();

    private String categoryName;

    private Integer copies;
}