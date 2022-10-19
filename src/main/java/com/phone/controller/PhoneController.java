package com.phone.controller;

import com.phone.pojo.Phones;
import com.phone.service.PhoneService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/phone")
public class PhoneController {
    @Autowired
    @Qualifier("PhoneServiceImpl")
    private PhoneService phoneService;

    @RequestMapping("/allPhone")
    public String list(Model model){
        List<Phones> list = phoneService.queryAllPhone();
        model.addAttribute("list",list);
        return "allPhone";
    }
    /*添加*/
    @RequestMapping("/toAddPhone")
    public String toAddPaper(){
        return "addPhone";
    }

    @RequestMapping("/addPhone")
    public String addPaper(Phones phones) {
        System.out.println("addPhone=>"+phones);
        phoneService.addPhone(phones);
        return "redirect:/phone/allPhone";
    }
    /*修改*/
    @RequestMapping("/toUpdatePhone")
    public String toUpdatePhone(Model model, int id) {
        Phones phones = phoneService.queryPhoneById(id);
        System.out.println(phones);
        model.addAttribute("phone",phones );
        return "updatePhone";
    }

    @RequestMapping("/updatePhone")
    public String updatePhone(Model model, Phones phone) {
        System.out.println(phone);
        phoneService.updatePhone(phone);
        Phones phones = phoneService.queryPhoneById(phone.getPhoneID());
        model.addAttribute("phones", phones);
        return "redirect:/phone/allPhone";
    }
    /*删除*/
    @RequestMapping("/del/{phoneId}")
    public String deletePhone(@PathVariable("phoneId") int id) {
        phoneService.deletePhoneById(id);
        return "redirect:/phone/allPhone";
    }
    /*查询*/
    @RequestMapping("/queryPhone")
    public String queryPhone(String queryPhoneName,Model model){
        Phones phones = phoneService.queryPhoneByName(queryPhoneName);
        List<Phones> list = new ArrayList<>();
        list.add(phones);
        if (phones==null){
            list = phoneService.queryAllPhone();
            model.addAttribute("error","未查到");
        }
        model.addAttribute("list",list);
        return "allPhone";

    }
}
