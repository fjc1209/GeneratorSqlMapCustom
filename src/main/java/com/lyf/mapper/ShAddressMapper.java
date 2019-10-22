package com.lyf.mapper;

import com.lyf.entity.ShAddress;
import com.lyf.entity.ShAddressExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ShAddressMapper {
    long countByExample(ShAddressExample example);

    int deleteByExample(ShAddressExample example);

    int insert(ShAddress record);

    int insertSelective(ShAddress record);

    List<ShAddress> selectByExample(ShAddressExample example);

    int updateByExampleSelective(@Param("record") ShAddress record, @Param("example") ShAddressExample example);

    int updateByExample(@Param("record") ShAddress record, @Param("example") ShAddressExample example);
}