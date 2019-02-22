package com.boot.boot.system.service.impl;

import com.boot.boot.system.entity.User;
import com.boot.boot.system.entity.UserOnline;
import com.boot.boot.system.service.SessionService;
import org.apache.shiro.session.Session;
import org.apache.shiro.session.mgt.eis.SessionDAO;
import org.apache.shiro.subject.SimplePrincipalCollection;
import org.apache.shiro.subject.support.DefaultSubjectContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/**
 * 待完善
 *
 */
@Service
public class SessionServiceImpl implements SessionService {


//    private final SessionDAO sessionDAO;

//    @Autowired
//    public SessionServiceImpl(SessionDAO sessionDAO) {
//        this.sessionDAO = sessionDAO;
//    }

    @Override
    public List<UserOnline> list() {
        List<UserOnline> list = new ArrayList<>();
//        Collection<Session> sessions = sessionDAO.getActiveSessions();
        Collection<Session> sessions = null;
        for (Session session : sessions) {
            UserOnline userOnline = new UserOnline();
            if (session.getAttribute(DefaultSubjectContext.PRINCIPALS_SESSION_KEY) == null) {
                continue;
            } else {
                SimplePrincipalCollection principalCollection = (SimplePrincipalCollection) session
                        .getAttribute(DefaultSubjectContext.PRINCIPALS_SESSION_KEY);
                User userDO = (User) principalCollection.getPrimaryPrincipal();
                userOnline.setUsername(userDO.getUsername());
            }
            userOnline.setId((String) session.getId());
            userOnline.setHost(session.getHost());
            userOnline.setStartTimestamp(session.getStartTimestamp());
            userOnline.setLastAccessTime(session.getLastAccessTime());
            userOnline.setTimeout(session.getTimeout());
            list.add(userOnline);
        }
        return list;
    }

    @Override
    public List<User> listOnlineUser() {
        List<User> list = new ArrayList<>();
        User user;
//        Collection<Session> sessions = sessionDAO.getActiveSessions();
        Collection<Session> sessions = null;
        for (Session session : sessions) {
            SimplePrincipalCollection principalCollection = new SimplePrincipalCollection();
            if (session.getAttribute(DefaultSubjectContext.PRINCIPALS_SESSION_KEY) == null) {
                continue;
            } else {
                principalCollection = (SimplePrincipalCollection) session
                        .getAttribute(DefaultSubjectContext.PRINCIPALS_SESSION_KEY);
                user = (User) principalCollection.getPrimaryPrincipal();
                list.add(user);
            }
        }
        return list;
    }

    @Override
    public Collection<Session> sessionList() {
        return null;
    }

    @Override
    public boolean forceLogout(String sessionId) {
        Session session = null;
        session.setTimeout(0);
        return true;
    }
}
