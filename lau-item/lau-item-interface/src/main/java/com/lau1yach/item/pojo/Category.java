package com.lau1yach.item.pojo;

import lombok.Data;
import tk.mybatis.mapper.annotation.KeySql;

import javax.persistence.*;

@Table(name="tb_category")
@Data
public class Category {
	@Id
	@KeySql(useGeneratedKeys=true)
	private Long id;
	private String name;
	private Long parentId;
	private Boolean isParent;
	private Integer sort;
}