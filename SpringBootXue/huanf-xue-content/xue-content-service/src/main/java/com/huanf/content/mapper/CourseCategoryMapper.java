package com.huanf.content.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.huanf.domain.dto.CourseCategoryTreeDto;
import com.huanf.domain.entity.CourseCategory;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;


@Mapper
public interface CourseCategoryMapper extends BaseMapper<CourseCategory> {

    /**
     * 课程分类的查询
     * @param id
     * @return
     */
    List<CourseCategoryTreeDto> selectTreeNodes(@Param("id") String id);
}