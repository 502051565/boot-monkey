package com.boot.boot.system.service;

import com.boot.boot.common.domain.Tree;
import com.boot.boot.system.entity.Menu;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;
import java.util.Set;

@Service
public interface MenuService {
	Tree<Menu> getSysMenuTree(Long id);

	List<Tree<Menu>> listMenuTree(Long id);

	Tree<Menu> getTree();

	Tree<Menu> getTree(Long id);

	List<Menu> list(Map<String, Object> params);

	int remove(Long id);

	int save(Menu menu);

	int update(Menu menu);

	Menu get(Long id);

	Set<String> listPerms(Long userId);
}
