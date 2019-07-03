package com.charleymot.controller;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.serializer.SerializerFeature;
import com.charleymot.dao.WishMapper;
import com.charleymot.entity.Wish;
import com.charleymot.exception.UniteException;
import com.charleymot.util.Dict;
import com.charleymot.util.Result;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import java.util.Date;
import java.util.List;

@RestController
@RequestMapping(value = "/petal", produces = {"application/json"})
@Slf4j
public class PetalController {
    @Resource
    WishMapper wishMapper;


    @RequestMapping(value = "/wish", method = {RequestMethod.POST,RequestMethod.GET})
    public Result wish(String desc, String name) throws UniteException {
        Wish record = new Wish(name, desc, new Date(), "false");
        wishMapper.insertSelective(record);
        return Result.OK();
    }

    @RequestMapping(value = "/getWish", method = {RequestMethod.POST,RequestMethod.GET})
    public Result getSceneCategory(String pageSize, String pageNum) throws UniteException {
        List<Wish> pageWish = wishMapper.getPageWish(Integer.parseInt(pageNum), Integer.parseInt(pageSize));
        JSONObject.DEFFAULT_DATE_FORMAT="yyyy/MM/dd";//设置日期格式
        return new Result.Builder().setCode(Dict.OK).setMessage(Dict.OK_MESSAGE).setData(JSONObject.toJSONString(pageWish, SerializerFeature.WriteDateUseDateFormat)).builder();
    }

}
