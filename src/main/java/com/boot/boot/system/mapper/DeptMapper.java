package com.boot.boot.system.mapper;

import com.boot.boot.system.entity.Dept;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
import java.util.Map;

/**
 * 部门管理
 */
@Mapper
public interface DeptMapper {

	Dept get(Long deptId);
	
	List<Dept> list(Map<String, Object> map);

	int count(Map<String, Object> map);
	
	int save(Dept dept);
	
	int update(Dept dept);
	
	int remove(Long deptId);
	
	int batchRemove(Long[] deptIds);
	
	Long[] listParentDept();
	
	int getDeptUserNumber(Long deptId);
}
