package com.lau1yach.item.web;

import com.lau1yach.common.vo.PageResult;
import com.lau1yach.item.pojo.Brand;
import com.lau1yach.item.service.BrandService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.*;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author lyhpl
 * @Title: BrandController
 * @ProjectName lau1yach
 * @Description: TODO
 * @date 2018/11/25  10:16
 */
@RestController
@RequestMapping("brand")
public class BrandController {

    @Autowired
    private BrandService brandService;

    @GetMapping("page")
    public ResponseEntity<PageResult<Brand>> queryBrandByPage(
            @RequestParam(value = "page", defaultValue = "1") Integer page,
            @RequestParam(value = "rows", defaultValue = "5") Integer rows,
            @RequestParam(value = "sortBy", required = false) String sortBy,
            @RequestParam(value = "desc", defaultValue = "false") Boolean desc,
            @RequestParam(value = "key", required = false) String key){
        return ResponseEntity.ok(brandService.queryBrandByPage(page,rows,sortBy,desc,key));

    }

    /**
     *@Author: WingHung Lau
     *@Description: 新增品牌
     *@Date: 9:32 2018/11/26
     */
    @PostMapping
    public ResponseEntity<Void> saveBrand(Brand brand, @RequestParam("cids") List<Long> cids){
        brandService.saveBrand(brand,cids);
        return ResponseEntity.status(HttpStatus.CREATED).build();
    }
}
