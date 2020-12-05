1.apache-tomcat-8.5.32-src源码包，官网下载并解压即可
2.apache-ant-1.10.5（用的最新版）下载并安装：Tomcat源码默认采用的是ant编译；安装好以后配置环境变量
1、pom.xml文件配置




https://www.jb51.net/article/144696.html



NioEndpoint


过滤器
ApplicationFilterChain-》

乱码
bnd = ResourceBundle.getBundle(bundleName, locale);

在java中, 读取文件的默认格式是iso8859-1, 而我们中文存储的时候一般是UTF-8. 所以导致读出来的是乱码

命令：

中文转Unicode：native2ascii -encoding GBK D:\zh.txt D:\zh_gbk.txt //GB2312也可以
Unicode转中文：native2ascii -reverse -encoding GBK D:\cn_gbk.txt D:\gbk_back.txt

native2ascii.exe -encoding UTF-8 LocalStrings_zh_CN1.properties  LocalStrings_zh_CN.properties

native2ascii.exe -encoding UTF-8 LocalStrings_zh_CN1.txt  LocalStrings_zh_CN.txt


 MapperListener ?? 

org.apache.tomcat.util.res.StringManager类中的getString(final String key, final Object... args)方法

org.apache.jasper.compiler.Localizer类的getMessage(String errCode)


### 总体架构
一个Server包含多个Service（他们互相独立，只是共享一个JVM以及系统类库），一个Service负责维护多个Connector和一个Container(即Engine，用以表示整个Servlet引擎。引擎只负责处理请求，并不考虑请求链接，协议等)。
Context表示一个应用，一个Engine可以包含多个应用
Host表示虚拟主机

### Catalina

- Digester是一款用于将XML转换为Java对象的事件驱动型工具，线性不安全的
   

### tomcat配置管理
- JVM配置
    - server -Xms1024m -xmx2048m -XX:PermSize=256m -XX:MaxPermSize=512m
    - Xms:堆内的初始大小
    - Xmx:堆内存上限
    - XX:PerSize: 非对内存初始大小，在JDK8中已经由-XX:MetaspaceSize代替
    - XX:MaxPerSize：非堆内存上限，在JDK8中已经由-XX:MaxMetaspaceSize代替
- 系统属性
   - 还可以通过“-Dproperty”的方式指定系统属性
- 服务器配置
    - 
 