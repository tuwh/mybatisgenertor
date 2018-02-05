# mybatisgenertor
mybatis代码生成器。对官方生成进行优化，可一次生成所有表的配置。同时支持分页。
生成器依托于mybatis-generator工具类，在期基础上做了扩展。
扩展如下：
1、对生成名字进行了优化 如selectByPrimaryKey ->updateByUserId。其中User取自表名信息
