package com.boot.boot.system.mapper;

import com.boot.boot.system.entity.Role;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
import java.util.Map;

/**
 * 角色
 */
@Mapper
public interface RoleMapper {

	Role get(Long roleId);
	
	List<Role> list(Map<String, Object> map);

	int count(Map<String, Object> map);
	
	int save(Role role);
	
	int update(Role role);
	
	int remove(Long roleId);
	
	int batchRemove(Long[] roleIds);
}
