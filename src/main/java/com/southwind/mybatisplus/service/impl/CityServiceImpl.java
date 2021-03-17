package com.southwind.mybatisplus.service.impl;

import com.southwind.mybatisplus.entity.City;
import com.southwind.mybatisplus.mapper.CityMapper;
import com.southwind.mybatisplus.service.ICityService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author Leon.King
 * @since 2021-03-19
 */
@Service
public class CityServiceImpl extends ServiceImpl<CityMapper, City> implements ICityService {

}
