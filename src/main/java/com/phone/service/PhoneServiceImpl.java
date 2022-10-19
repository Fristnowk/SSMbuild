package com.phone.service;

import com.phone.dao.PhoneMapper;
import com.phone.pojo.Phones;

import java.util.List;

public class PhoneServiceImpl implements PhoneService {

    //调用dao层的操作，组合DAO
    private PhoneMapper phoneMapper;
    public void setPhoneMapper(PhoneMapper phoneMapper) {
        this.phoneMapper = phoneMapper;
    }

    public int addPhone(Phones phones) {
        return phoneMapper.addPhone(phones);
    }

    public int deletePhoneById(int id) {
        return phoneMapper.deletePhoneById(id);
    }

    public int updatePhone(Phones phones) {
        return phoneMapper.updatePhone(phones);
    }

    public Phones queryPhoneById(int id) {
        return phoneMapper.queryPhoneById(id);
    }

    public List<Phones> queryAllPhone() {
        return phoneMapper.queryAllPhone();
    }

    public Phones queryPhoneByName(String phoneName) {
        return phoneMapper.queryPhoneByName(phoneName);
    }

}
