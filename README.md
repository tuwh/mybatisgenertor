# mybatisgenertor
mybatis代码生成器。对官方生成进行优化，可一次生成所有表的配置。同时支持分页。
生成器依托于mybatis-generator工具类，在期基础上做了扩展。<br>
扩展如下：<br>
1、对生成名字进行了优化 如selectByPrimaryKey ->updateByUserId。其中User取自表名信息，Id取自表主键<br>
2、屏蔽视图类型生成文件的插入更新方法<br>
3、只需配置一个表的样例，后台自动生成当前数据库用户下的所有表<br>
4、增加分页查找方法，生成的分页方法无侵入。不需依赖mybatis外的第三方包。调用和普通的mapper查找方法一致。
5、修改Example类的名称，增加包名指定配置。
6、生成的代码运行样例见工程： <br>
