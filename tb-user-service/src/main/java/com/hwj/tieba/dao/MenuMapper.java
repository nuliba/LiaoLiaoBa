package com.hwj.tieba.dao;

import com.hwj.tieba.entity.MenuParent;
import com.hwj.tieba.entity.MenuSon;
import com.hwj.tieba.entity.Menu_Role_Item;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface MenuMapper {
    /**
     * 根据id查询父菜单
     * @param menu_role_itemList  包含RoleId对应的父菜单Id
     * @return 父菜单实例
     */
    public List<MenuParent> queryMenuParentById(@Param("idList") List<Menu_Role_Item> menu_role_itemList);

    /**
     * 根据父菜单id查询其对应的子菜单
     * @param idList 父菜单id
     * @return 子菜单实例
     */
    public List<MenuSon> queryMenuSonByParentId(@Param("idList") List<MenuParent> idList);

    public List<Menu_Role_Item> queryMenuParentByRoleId(@Param("roleIdList") List<Integer> roleIdList);
}
