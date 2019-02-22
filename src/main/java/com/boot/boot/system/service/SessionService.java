package com.boot.boot.system.service;

import com.boot.boot.system.entity.User;
import com.boot.boot.system.entity.UserOnline;
import org.apache.shiro.session.Session;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.List;

@Service
public interface SessionService {
	List<UserOnline> list();

	List<User> listOnlineUser();

	Collection<Session> sessionList();
	
	boolean forceLogout(String sessionId);
}
