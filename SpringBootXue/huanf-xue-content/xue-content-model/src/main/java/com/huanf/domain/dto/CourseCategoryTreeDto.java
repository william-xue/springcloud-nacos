package com.huanf.domain.dto;

import com.huanf.domain.entity.CourseCategory;
import lombok.Data;
import java.io.Serializable;
import java.util.List;


@Data
public class CourseCategoryTreeDto extends CourseCategory implements Serializable {

    List<CourseCategoryTreeDto> childrenTreeNodes;
}