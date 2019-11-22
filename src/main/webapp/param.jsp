<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%--
  Created by IntelliJ IDEA.
  User: MECHREVO
  Date: 2019/11/19
  Time: 16:57
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
    <head>
        <title>用户保存</title>
    </head>
    <body>
        <%--请求参数绑定--%>
        <h3>

            <a href="param/testParam?username=zyh&password=123456">请求参数绑定</a>
            <%--<form action="param/saveAccount" method="post">--%>
                <%--name要与javabean类里的属性名一致，
                如果包含引用类型的属性可以这样封装：引用属性.引用类属性--%>
                <%--输入中文乱码，可以用过滤器来解决，在web.xml里写过滤器--%>
                <%--
                    用户名：<input type="text" name="username"/><br/>
                    密码：<input type="text" name="password"/><br/>
                    金额：<input type="text" name="money"/><br/>
                    姓名：<input type="text" name="user.name"/><br/>
                    年龄：<input type="text" name="user.age"/><br/>
                    <input type="submit" name="提交"/>
                </form>
                --%>
            <%--将数据封装到Account类中，类中存在集合List,Map--%>
            <form action="param/saveAccount" method="post">

                用户名：<input type="text" name="username"/><br/>
                密码：<input type="text" name="password"/><br/>
                <%--金额：<input type="text" name="money"/><br/>--%>

                <%--姓名：<input type="text" name="list[0].name"/><br/>--%>
                <%--年龄：<input type="text" name="list[0].age"/><br/>--%>

                <%--姓名：<input type="text" name="map['one'].name"/><br/>--%>
                <%--年龄：<input type="text" name="map['one'].age"/><br/>--%>
                <input type="submit" name="提交"/>

            </form>
        </h3>
    </body>
</html>
