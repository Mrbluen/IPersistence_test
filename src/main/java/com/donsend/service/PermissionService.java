package com.donsend.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.donsend.domain.Permission;
import com.donsend.domain.Permission;

import java.util.List;

public interface PermissionService extends IService<Permission> {
    // 根据用户ID查询对应的权限
    List<Permission> findByUserId(Integer id);
}
