package com.gs.daoImple;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.gs.Idao.IComputer_room;
import com.gs.entity.Computer_room;
@Repository("computer_room_dao")
public class Computer_room_dao extends BaseDao<Computer_room> implements IComputer_room{
	

}
