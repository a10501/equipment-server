package com.equipment.equipmentMan.mapper;

import java.util.List;
import com.equipment.equipmentMan.domain.EqMainteRecord;

/**
 * 维修信息Mapper接口
 * 
 * @author cdy
 * @date 2022-04-12
 */
public interface EqMainteRecordMapper 
{
    /**
     * 查询维修信息
     * 
     * @param id 维修信息主键
     * @return 维修信息
     */
    public EqMainteRecord selectEqMainteRecordById(Long id);

    /**
     * 查询维修信息列表
     * 
     * @param eqMainteRecord 维修信息
     * @return 维修信息集合
     */
    public List<EqMainteRecord> selectEqMainteRecordList(EqMainteRecord eqMainteRecord);

    /**
     * 新增维修信息
     * 
     * @param eqMainteRecord 维修信息
     * @return 结果
     */
    public int insertEqMainteRecord(EqMainteRecord eqMainteRecord);

    /**
     * 修改维修信息
     * 
     * @param eqMainteRecord 维修信息
     * @return 结果
     */
    public int updateEqMainteRecord(EqMainteRecord eqMainteRecord);

    /**
     * 删除维修信息
     * 
     * @param id 维修信息主键
     * @return 结果
     */
    public int deleteEqMainteRecordById(Long id);

    /**
     * 批量删除维修信息
     * 
     * @param ids 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteEqMainteRecordByIds(Long[] ids);
}
