package com.gs.control;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.gs.entity.Computer_room;
import com.gs.service.ComputerService;

@Controller
public class Computer_roomControl {
	@Autowired
	private ComputerService   cs;
	
	@RequestMapping(method=RequestMethod.GET,  value="/add")
	public void addComputeRoom(){
		Computer_room cr=new Computer_room();
//		cr.setId(1);
		cr.setArea(10);
		cr.setName("test1");
		cr.setRoom_code("1001");
		cr.setLocation("16L");
		cr.setArea(100);
		cr.setManager_id(101);
		cr.setManager_name("admin1");
		cr.setManager_mobile("13983066986");
		cs.addComputer(cr);
		System.out.println("执行完成");
	}
	@RequestMapping(method=RequestMethod.GET,  value="/del")
	public void delComputeRoom(){
		Computer_room cr=new Computer_room();
		cr.setId(1);
		
		cs.delComputer(cr);
		System.out.println("执行完成");
	}
}
