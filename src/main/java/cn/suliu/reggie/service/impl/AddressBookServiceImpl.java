package cn.suliu.reggie.service.impl;

import cn.suliu.reggie.entity.AddressBook;
import cn.suliu.reggie.mapper.AddressBookMapper;
import cn.suliu.reggie.service.AddressBookService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * @Author admin
 * @Date 2022/8/10 17:10
 * @Version 1.0
 */
@Service
public class AddressBookServiceImpl extends ServiceImpl<AddressBookMapper, AddressBook> implements AddressBookService {
}