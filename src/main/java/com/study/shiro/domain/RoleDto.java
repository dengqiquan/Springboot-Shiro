package com.study.shiro.domain;
import com.study.shiro.entity.Role;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.List;

/**
*  generated by AddClassPlugin plugin
*/
@Data
@EqualsAndHashCode(callSuper=false)
public class RoleDto extends Role {

    private List<MenuDto> menuDtoList;
}