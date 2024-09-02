package com.simple.basic.test.mapper;

import org.apache.ibatis.annotations.Mapper;

@Mapper //웬만하면 하나 달기(mapper라는 의미)
public interface TestMapper {

	public String getTime();
}
