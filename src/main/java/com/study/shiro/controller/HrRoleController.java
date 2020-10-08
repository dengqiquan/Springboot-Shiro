package com.study.shiro.controller;

import com.study.shiro.domain.HrRoleDto;
import com.study.shiro.service.HrRoleService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import javax.annotation.Resource;
import com.study.common.response.Response;
/**
*  generated by AddClassPlugin plugin
*/

@RestController
public class HrRoleController extends BaseController {

    @Resource
    private HrRoleService hrRoleService;
    /**
    * 新增
    * @param hrRoleDto
    * @return
    */
    @PostMapping("role/add")
    public Response addHrRole(@RequestBody HrRoleDto hrRoleDto) {
        hrRoleService.addHrRole(hrRoleDto);
        return success(Boolean.TRUE);
    }

}