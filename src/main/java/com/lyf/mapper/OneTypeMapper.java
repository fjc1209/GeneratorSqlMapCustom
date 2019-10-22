package com.lyf.mapper;

import com.lyf.entity.OneType;
import com.lyf.entity.OneTypeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface OneTypeMapper {
    long countByExample(OneTypeExample example);

    int deleteByExample(OneTypeExample example);

    int insert(OneType record);

    int insertSelective(OneType record);

    List<OneType> selectByExample(OneTypeExample example);

    int updateByExampleSelective(@Param("record") OneType record, @Param("example") OneTypeExample example);

    int updateByExample(@Param("record") OneType record, @Param("example") OneTypeExample example);
}