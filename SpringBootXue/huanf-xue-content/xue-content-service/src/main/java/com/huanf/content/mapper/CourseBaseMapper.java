package com.huanf.content.mapper;

import com.baomidou.mybatisplus.core.conditions.Wrapper;
import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.core.toolkit.Constants;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.huanf.domain.entity.CourseBase;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

/**
 * 课程基本信息(CourseBase)表数据库访问层
 *
 * @author
 *
 */
@Mapper
public interface CourseBaseMapper extends BaseMapper<CourseBase> {

    Page<CourseBase> coursePage(Page<CourseBase> page, @Param(Constants.WRAPPER) Wrapper<CourseBase> queryWrapper);

}