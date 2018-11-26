package com.lau1yach.item.pojo;

import lombok.Data;
import tk.mybatis.mapper.annotation.KeySql;

import javax.persistence.*;

@Table(name = "tb_brand")
@Data
public class Brand {
    @Id
    @KeySql(useGeneratedKeys=true)
    private Long id;
    // 品牌名称
    private String name;
    // 品牌图片
    private String image;
    private Character letter;
    // getter setter 略
}