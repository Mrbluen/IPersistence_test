package com.donsend.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.donsend.domain.Permission;
import com.donsend.mapper.PermissionMapper;
import com.donsend.service.PermissionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 权限Service
 */
@Service
public class PermissionServiceImpl extends ServiceImpl<PermissionMapper, Permission> implements PermissionService {

    @Autowired
    PermissionMapper permissionMapper;

    /**
     * 根据用户ID查询权限列表
     *
     * @return
     */
    @Override
    public List<Permission> findByUserId(Integer id) {
        return permissionMapper.findByUserId(id);
    }
}
