package cn.suliu.reggie.service;

import cn.suliu.reggie.entity.Category;
import com.baomidou.mybatisplus.extension.service.IService;

/**
 * @Author admin
 * @Date 2022/8/9 17:24
 * @Version 1.0
 */
public interface CategoryService extends IService<Category> {

    //根据ID删除分类
    public void remove(Long id);
}