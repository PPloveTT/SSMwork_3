package controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import pojo.quality;

import service.qualityService;

@Controller
public class qualityController {

	@Autowired
	private qualityService qs;

	public qualityService getQs() {
		return qs;
	}

	public void setQs(qualityService qs) {
		this.qs = qs;
	}
	
	@RequestMapping("/aaa")
	public String getall(@RequestParam(defaultValue="1")int pageindex,HttpServletRequest request){
		if(pageindex<1){
			return "index.jsp";
		}else{
			int begin=(pageindex-1)*2;
			int count=qs.count();
			int num=0;
			if(count%2==0){
				num=count/2;
			}else {
				num =count/2+1;
			}
			List<quality> list=qs.getAll(begin, 2);
			request.getSession().setAttribute("list", list);
			request.getSession().setAttribute("pageindex", pageindex);
			request.getSession().setAttribute("num", num);
			request.getSession().setAttribute("count", count);
			return "index.jsp";
		}
	}
	
	@RequestMapping("/bbb")
	public void add(HttpServletRequest request,HttpServletResponse response){
 try {
	PrintWriter out= response.getWriter();
	String id=request.getParameter("district_id");
	int district_id=Integer.parseInt(id);
	String monitor_time=request.getParameter("monitor_time");
	String a=request.getParameter("pm10");
	int pm10=Integer.parseInt(a);
	String b=request.getParameter("pm2.5");
	int pm25=Integer.parseInt(b);
	String monitoring_station=request.getParameter("monitoring_station");
	quality q=new quality();
	q.setDistrict_id(district_id);
	q.setMonitor_time(monitor_time);
	q.setPm10(pm10);
	q.setPm25(pm25);
	q.setMonitoring_station(monitoring_station);
	
	int num=qs.insert(q);
	if(num>0){
		out.print("1111");
	}else{
		out.print("");
	}
	
} catch (IOException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}
		
	}
	
	
}
