package com.lyf.mapper;

import com.lyf.entity.Commodity;
import com.lyf.entity.CommodityExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CommodityMapper {
    long countByExample(CommodityExample example);

    int deleteByExample(CommodityExample example);

    int insert(Commodity record);

    int insertSelective(Commodity record);

    List<Commodity> selectByExample(CommodityExample example);

    int updateByExampleSelective(@Param("record") Commodity record, @Param("example") CommodityExample example);

    int updateByExample(@Param("record") Commodity record, @Param("example") CommodityExample example);
}