package com.lau1yach.item.mapper;

import com.lau1yach.item.pojo.Brand;
import org.apache.ibatis.annotations.*;
import tk.mybatis.mapper.common.Mapper;

/**
 * @author lyhpl
 * @Title: BrandMapper
 * @ProjectName lau1yach
 * @Description: TODO
 * @date 2018/11/25  10:13
 */
public interface BrandMapper extends Mapper<Brand> {
    @Insert("INSERT INTO tb_category_brand (category_id, brand_id) VALUES (#{cid},#{bid})")
    int insertCategoryBrand(@Param("cid") Long cid, @Param("bid") Long bid);
}
