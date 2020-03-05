package com.team.house.housebackapi.service;

import com.team.house.housebackapi.entity.Street;

import java.util.List;

/**
 * @author 王建兵
 * @Classname DistrictService
 * @Description TODO
 * @Date 2020/2/25 16:36
 * @Created by Administrator
 */
public interface StreetService {
    //通过区域编号查询街道
    public List<Street> getStreetByDid(Integer did);
}
