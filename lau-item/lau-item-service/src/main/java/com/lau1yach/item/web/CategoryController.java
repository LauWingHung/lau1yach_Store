package com.lau1yach.item.web;

import com.lau1yach.item.pojo.Category;
import com.lau1yach.item.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author lyhpl
 * @Title: CategoryController
 * @ProjectName lau1yach
 * @Description: TODO
 * @date 2018/11/24  10:51
 */
@RestController
@RequestMapping("category")
public class CategoryController {
    @Autowired
    private CategoryService categoryService;

    /**
     *@Author: WingHung Lau
     *@Description: 根据父节点查询Id
     *@Date: 10:58 2018/11/24
     */
    @GetMapping("list")
    public ResponseEntity<List<Category>> queryCategoryListByPid(@RequestParam("pid") Long pid){
        return ResponseEntity.ok(categoryService.queryCategoryListByPid(pid));
    }

}
