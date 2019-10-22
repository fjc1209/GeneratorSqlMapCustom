package com.lyf.mapper;

import com.lyf.entity.TwoType;
import com.lyf.entity.TwoTypeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TwoTypeMapper {
    long countByExample(TwoTypeExample example);

    int deleteByExample(TwoTypeExample example);

    int insert(TwoType record);

    int insertSelective(TwoType record);

    List<TwoType> selectByExample(TwoTypeExample example);

    int updateByExampleSelective(@Param("record") TwoType record, @Param("example") TwoTypeExample example);

    int updateByExample(@Param("record") TwoType record, @Param("example") TwoTypeExample example);
}