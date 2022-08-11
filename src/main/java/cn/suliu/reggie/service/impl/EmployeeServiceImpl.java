package cn.suliu.reggie.service.impl;

import cn.suliu.reggie.entity.Employee;
import cn.suliu.reggie.mapper.EmployeeMapper;
import cn.suliu.reggie.service.EmployeeService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * @Author admin
 * @Date 2022/8/6 20:46
 * @Version 1.0
 */
@Service
public class EmployeeServiceImpl extends ServiceImpl<EmployeeMapper, Employee> implements EmployeeService {

}
