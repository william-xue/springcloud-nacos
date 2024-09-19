package com.huanf.content.api;

/**
 * <code>CourseBaseInfoController</code>
 * Description
 * <b>Creation Time:</b> 2024/8/13 15:39.
 *
 * @author xue-freeze
 * @since SpringBootXue
 */

import com.huanf.base.model.PageParams;
import com.huanf.base.model.PageResult;
import com.huanf.content.service.CourseBaseService;
import com.huanf.domain.dto.AddCourseDto;
import com.huanf.domain.dto.CourseBaseInfoDto;
import com.huanf.domain.dto.QueryCourseParamsDto;
import com.huanf.domain.entity.CourseBase;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

@Slf4j
@Api(value = "课程信息编辑",tags = "课程信息编辑")
@RestController
public class CourseBaseInfoController {

    @Autowired
    CourseBaseService courseBaseService;

    @ApiOperation("环境测试接口")
    @GetMapping("/course/index")
    public String index(){
        return "看到我，你的环境就是没问题的啦111";
    }
    @ApiOperation("课程查询接口")
    @PostMapping("/course/list")

    public PageResult<CourseBase> list(PageParams pageParams, @RequestBody QueryCourseParamsDto dto){


        PageResult<CourseBase> pageResult = courseBaseService.queryCourseBaseList(pageParams, dto);
        log.info("查询的值 {}", pageResult);
        return pageResult;
    }

    @ApiOperation("新增课程")
    @PostMapping("/course")
    //@Validated注解的作用是开启参数校验，这样AddCourseDto类的@NotEmpty、@Size注解才会生效
    public CourseBaseInfoDto createCourseBase(@Validated @RequestBody AddCourseDto addCourseDto){
        //机构id，先硬编码，后续写机构端的时候会回来解决这个硬编码
        Long companyId = 1232141425L;
        CourseBaseInfoDto courseBase = courseBaseService.createCourseBase(companyId, addCourseDto);
        return courseBase;
    }

    @ApiOperation("根据课程id查询接口")
    @GetMapping("/course/{courseId}")
    public CourseBaseInfoDto getCourseBaseById(@PathVariable Long courseId){
        CourseBaseInfoDto courseBaseInfo = courseBaseService.getCourseBaseInfo(courseId);
        return courseBaseInfo;
    }


}
