package com.team.house.housebackapi.service.impl;

import com.team.house.housebackapi.entity.Street;
import com.team.house.housebackapi.entity.StreetExample;
import com.team.house.housebackapi.mapper.StreetMapper;
import com.team.house.housebackapi.service.DistrictService;
import com.team.house.housebackapi.service.StreetService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author 王建兵
 * @Classname DistrictServiceImpl
 * @Description TODO
 * @Date 2020/2/25 16:37
 * @Created by Administrator
 */
@Service
public class StreetServiceImpl implements StreetService {
    @Autowired(required = false)
    private StreetMapper streetMapper;
    @Override
    public List<Street> getStreetByDid(Integer did) {
        StreetExample streetExample=new StreetExample();
        StreetExample.Criteria criteria=streetExample.createCriteria();
        criteria.andDistrictIdEqualTo(did); //传条件
        return streetMapper.selectByExample(streetExample);
    }
}
