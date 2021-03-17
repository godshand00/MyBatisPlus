package com.southwind.mybatisplus.service.impl;

import com.southwind.mybatisplus.entity.Country;
import com.southwind.mybatisplus.mapper.CountryMapper;
import com.southwind.mybatisplus.service.ICountryService;
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
public class CountryServiceImpl extends ServiceImpl<CountryMapper, Country> implements ICountryService {

}
