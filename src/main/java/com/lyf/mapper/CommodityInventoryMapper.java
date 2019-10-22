package com.lyf.mapper;

import com.lyf.entity.CommodityInventory;
import com.lyf.entity.CommodityInventoryExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CommodityInventoryMapper {
    long countByExample(CommodityInventoryExample example);

    int deleteByExample(CommodityInventoryExample example);

    int insert(CommodityInventory record);

    int insertSelective(CommodityInventory record);

    List<CommodityInventory> selectByExample(CommodityInventoryExample example);

    int updateByExampleSelective(@Param("record") CommodityInventory record, @Param("example") CommodityInventoryExample example);

    int updateByExample(@Param("record") CommodityInventory record, @Param("example") CommodityInventoryExample example);
}