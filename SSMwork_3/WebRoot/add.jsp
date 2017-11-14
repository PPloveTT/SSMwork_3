<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>


<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
 

  </head>
  
  <body>
 
	<form action="bbb" method="post">
	<table>
	<tr>
	<td>监测区域</td>
	 <select name="district_id">
	 <option value="1">东城区</option> 
	 <option value="2">西城区</option> 
	 <option value="3">海淀区</option> 
	 <option value="4">朝阳区</option> 
	 <option value="5">丰田区</option> 
	 </select>
	</tr>
	
	<tr>
	<td>监测日期</td>
	<td><input type="text" name="monitor_time"> </td>
	</tr>
	
	<tr>
	<td>PM10值</td>
	<td><input type="text" name="pm10"></td>
	</tr>
	
	<tr>
	<td>PM2.5值</td>
	<td><input type="text" name="pm2.5"></td>
	</tr>
	
	<tr>
	<td>监测站</td>
	<td><input type="text" name="monitoring_station"></td>
	</tr>
	<tr><input type="submit" value="保存"> </tr>
	</table>
	
	</form>

  </body>
</html>
