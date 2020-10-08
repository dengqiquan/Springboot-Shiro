package com.study.shiro.service;

import com.study.shiro.domain.MenuDto;
import com.study.shiro.domain.MenuSearch;
import com.study.shiro.entity.Menu;

import java.net.Inet4Address;
import java.util.List;
/**
*  generated by AddClassPlugin plugin
*/

public interface MenuService {
        /**
        * 新增
        * @param menuDto
        */
        void addMenu(MenuDto menuDto);
        /**
        * 修改(删除)
        * @param menuDto
        * @param menuSearch
        */
        void updateByMenuSearch(MenuDto menuDto, MenuSearch menuSearch);
        /**
        * 根据id查询
        * @param id
        * @return
        */
        MenuDto findById(Integer
                                 id);
        /**
        * 分页list
        * @param menuSearch
        * @return
        */
        List<MenuDto> searchByMenuSearch(MenuSearch menuSearch);
        /**
        * 分页条数
        * @param menuSearch
        * @return
        */
        Long count(MenuSearch menuSearch);
}