<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
  
  </head>
  
  <body>
  <p align="center"><h1>空气质量检测信息库</h1></p>
  <h2 align="right"></h2> <a href="">添加</a>
  <table border="1px">
  <tr>
  <td>序列</td>
  <td>区域</td>
  <td>监测时间</td>
  <td>PM10数据</td>
  <td>PM2.5数据</td>
  <td>监测站</td>
   </tr>
   <c:forEach items="${sessionScope.list }" var="l">
    <tr>
  <td>${l.id}</td>
  <td>${l.d.name}</td>
  <td>${l.monitor_time}</td>
  <td>${l.pm10}</td>
  <td>${l.pm25}</td>
  <td>${l.monitoring_station}</td>
   </tr>
   </c:forEach>
  </table>
  <a href="aaa?pageindex=1">首页</a>  <a href="aaa?pageindex=${pageindex-1}">上一页</a>  <a href="aaa?pageindex=${pageindex+1}">下一页</a>  <a href="aaa/pageindex=${num}">尾页</a>
  <span>第 ${pageindex} 页</span><span>共 ${num}</span><span>总共 ${count}</span>
  </body>
</html>
