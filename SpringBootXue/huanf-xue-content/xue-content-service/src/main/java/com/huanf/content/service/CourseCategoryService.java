package com.huanf.content.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.huanf.domain.dto.CourseCategoryTreeDto;
import com.huanf.domain.entity.CourseCategory;

import java.util.List;

/**
 * 课程分类(CourseCategory)表服务接口
 *

 */
public interface CourseCategoryService extends IService<CourseCategory> {
    /**
     * 课程分类树形结构查询
     * @param id
     * @return
     */
    List<CourseCategoryTreeDto> queryTreeNodes(String id);
}