package com.boot.boot.system.mapper;

import com.boot.boot.system.entity.User;
import org.apache.ibatis.annotations.Mapper;

/**
 * @author monkey_lwy@163.com
 * @date 2019-02-20 15:52
 * @desc
 */
@Mapper
public interface UserMapper {


    User getById(Long userId);


}
