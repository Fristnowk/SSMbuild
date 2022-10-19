package com.phone.dao;

import com.phone.pojo.Phones;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface PhoneMapper {
    //增加
    int addPhone(Phones phones);

    //根据id删除
    int deletePhoneById(@Param("phoneID") int id);

    //更新
    int updatePhone(Phones phones);

    //根据id查询,返回Phone
    Phones queryPhoneById(@Param("phoneID") int id);

    //查询全部Phone,返回list集合
    List<Phones> queryAllPhone();

    Phones queryPhoneByName(@Param("phoneName") String phoneName);
}
