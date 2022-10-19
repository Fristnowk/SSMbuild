package com.phone.service;

import com.phone.pojo.Phones;

import java.util.List;

public interface PhoneService {
    //增加
    int addPhone(Phones phones);

    //根据id删除
    int deletePhoneById(int id);

    //更新
    int updatePhone(Phones phones);

    //根据id查询,返回一个Phone
    Phones queryPhoneById(int id);

    //查询全部Phone,返回list集合
    List<Phones> queryAllPhone();

    Phones queryPhoneByName(String phoneName);
}
