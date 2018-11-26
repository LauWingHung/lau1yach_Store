package com.lau1yach.item.service;

import com.github.pagehelper.*;
import com.lau1yach.common.enums.ExceptionEnum;
import com.lau1yach.common.exception.LauException;
import com.lau1yach.common.vo.PageResult;
import com.lau1yach.item.mapper.BrandMapper;
import com.lau1yach.item.pojo.Brand;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.*;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.CollectionUtils;
import tk.mybatis.mapper.entity.Example;

import java.util.List;

/**
 * @author lyhpl
 * @Title: BrandService
 * @ProjectName lau1yach
 * @Description: TODO
 * @date 2018/11/25  10:14
 */
@Service
public class BrandService {

    @Autowired
    private BrandMapper brandMapper;

    public PageResult<Brand> queryBrandByPage(Integer page, Integer rows, String sortBy, Boolean desc, String key) {
        //分页
        PageHelper.startPage(page,rows);
        //过滤
        Example example = new Example(Brand.class);
        if (StringUtils.isNotBlank(key)){
            //过滤条件
            example.createCriteria().orLike("name", "%"+key+"%")
                    .orEqualTo("letter",key.toUpperCase());
        }
        //排序
        if (StringUtils.isNotBlank(sortBy)){
            String orderByClause = sortBy+(desc ? " DESC" : " ASC");
            example.setOrderByClause(orderByClause);
        }
        //查询
        List<Brand> list = brandMapper.selectByExample(example);
        if (CollectionUtils.isEmpty(list)){
            throw new LauException(ExceptionEnum.BRAND_NOT_FOUND);
        }
        //解析分页结果
        PageInfo<Brand> brandPageInfo = new PageInfo<>(list);
        return new PageResult<>(brandPageInfo.getTotal(),list);
    }

    @Transactional
    public void saveBrand(Brand brand, List<Long> cids) {
        //新增品牌
        brand.setId(null);
        int count = brandMapper.insert(brand);
        if (count != 1){
            throw new LauException(ExceptionEnum.BRAND_SAVE_ERROR);
        }
        //新增中间表
        for (Long cid : cids) {
            count = brandMapper.insertCategoryBrand(cid, brand.getId());
            if (count != 1){
                throw new LauException(ExceptionEnum.CATEGORY_BRAND_SAVE_ERROR);            }
        }
    }
}
