package com.gs.service;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.gs.daoImple.Computer_room_dao;
import com.gs.entity.Computer_room;

@Service("computerService")
@Transactional
public class ComputerService {
	@Autowired
	private Computer_room_dao   computer_room_dao;
	
	public void addComputer(Computer_room cr){
		computer_room_dao.update(cr);
//		cr.setId(1);
		computer_room_dao.update(cr);
//		int c=computer_room_dao.add(cr);
		System.out.println(1);
	}
	public void delComputer(Computer_room cr){
//		computer_room_dao.add(cr);
		cr.setId(2);
		Computer_room c=computer_room_dao.get(Computer_room.class, cr.getId());
		computer_room_dao.delete(c);
		System.out.println(1);
	}
}
