package com.lau1yach.item.service;

import com.lau1yach.common.enums.ExceptionEnum;
import com.lau1yach.common.exception.LauException;
import com.lau1yach.item.mapper.CategoryMapper;
import com.lau1yach.item.pojo.Category;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;

import java.util.List;

/**
 * @author lyhpl
 * @Title: CategoryService
 * @ProjectName lau1yach
 * @Description: TODO
 * @date 2018/11/24  10:48
 */
@Service
public class CategoryService {
    @Autowired
    private CategoryMapper categoryMapper;

    public List<Category> queryCategoryListByPid(Long pid) {
        //查询条件,mapper会把对象中的非空属性作为查询条件
        Category t = new Category();
        t.setParentId(pid);
        List<Category> list = categoryMapper.select(t);
        //判断结果
        if (CollectionUtils.isEmpty(list)){
            throw new LauException(ExceptionEnum.CATEGORY_NOT_FOUND);
        }
        return list;
    }
}
