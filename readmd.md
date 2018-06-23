1、项目包结构：
    api：存放调用第三方的接口，接口类名称，如招行，CmbAPI,cmb=china merchant bank招行
    config:配置项目全局的配置
    constant:存放对应各个API接口文档的常量定义，如返回的成功的编码1，SUCCESS="1"，避免出现魔法数字，可在下建立子包区别不同的API。
    controller:接口层，处理简单的参数校验
    service：业务逻辑层
    intercepter:拦截器、切面、全局异常处理的配置
    dao：数据库交互层
    entity：实体类层
    dto：数据传输对象
    utils：工具类
    
    
2、技术选型：spring boot :充当脚手架 
            mybatis plus ：与Spring-data-jpa同角色地位，并仍可自行编写xml的sql。
            maven：配置中加入了针对不同的环境打包不同的配置文件的插件。dev、pro、test可选。
            

3、操作日志：