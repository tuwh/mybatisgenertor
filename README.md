# mybatisgenertor
mybatis代码生成器。对官方生成进行优化，可一次生成所有表的配置。同时支持分页。<br>
启动类GeneratorMain<br>
生成器依托于mybatis-generator工具类，在期基础上做了扩展。<br>
扩展如下：<br>
1、对生成名字进行了优化 如selectByPrimaryKey ->updateByUserId。其中User取自表名信息，Id取自表主键<br>
2、屏蔽视图类型生成文件的插入更新方法<br>
3、只需配置一个表的样例，后台自动生成当前数据库用户下的所有表<br>
4、增加分页查找方法，生成的分页方法无侵入。不需依赖mybatis外的第三方包。调用和普通的mapper查找方法一致。
5、修改Example类的名称，增加包名指定配置。<br>
6、生成的代码运行样例见工程： <br>

生成代码测试工程 ： https://github.com/tuwh/mybatistest <br>

生成mapper类样例
package com.uncub.dao;

import com.uncub.common.dao.Pagination;
import com.uncub.condition.MenuConditions;
import com.uncub.dto.Menu;
import java.util.List;
import org.mybatis.spring.annotation.MapperScan;

@MapperScan
public interface MenuMapper {
    /**
    * 根据主键进行删除
    * @Param id
    * @auth tuwh
    */
    int deleteMenuById(Integer id);

    /**
    * 根据主键进行新增,插入所有字段
    * @Param menu
    */
    int inset(Menu menu);

    /**
    * 根据主键进行新增,插入非空字段
    * @Param menu
    */
    int insetSelective(Menu menu);

    /**
    * 根据查询条件进行查找
    * @Param menu
    * @auth tuwh
    */
    List<Menu> queryMenuByConditions(MenuConditions menuConditions);

    /**
    * 根据主键进行查找
    * @Param menu
    * @auth tuwh
    */
    Menu selectMenuById(Integer id);

    /**
    * 根据主键进行更新，仅更新非主空字段
    * @Param menu
    */
    int updateMenuByIdSelective(Menu menu);

    /**
    * 根据主键进行更新，更新所有字段
    * @Param menu
    */
    int updateMenuById(Menu menu);

    /**
    * 根据所有不为空条件进行查询，分页。结果将传入@Param pagination 参数中
    */
    List<Menu> queryMenu(Menu menu, Pagination pagination);

    /**
    * 根据所有不为空条件进行查询，不分页
    */
    List<Menu> queryMenu(Menu menu);

    /**
    * 根据所有不为空条件进行查询，分页。结果将传入@Param pagination 参数中
    */
    List<Menu> queryMenuByConditions(MenuConditions menuConditions, Pagination pagination);
}
