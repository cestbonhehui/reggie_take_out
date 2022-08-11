package cn.suliu.reggie.mapper;

import cn.suliu.reggie.entity.User;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * @Author admin
 * @Date 2022/8/10 16:37
 * @Version 1.0
 */
@Mapper
public interface UserMapper extends BaseMapper<User> {
}
