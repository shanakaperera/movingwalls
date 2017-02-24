package com.movingwalls.dao.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import com.movingwalls.dao.MovingWallsDAO;
import com.movingwalls.entity.Approvalstatus;
import com.movingwalls.entity.Finance;
import com.movingwalls.entity.Tours;
import com.movingwalls.entity.User;
import com.movingwalls.entity.Usertype;
@Repository
public class MovingWallsDAOImpl implements MovingWallsDAO{
	
	@Autowired
	private com.movingwalls.util.HibernateUtil hibernateUtil;

	@Override
	public List<Tours> getUsersTours() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Finance> getFinanceTours() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void createTours(Tours tours) {
		
		hibernateUtil.createTours(tours);
		
	}

	@Override
	public void updateToursUsers() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void updateToursFinance() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public User getUserObject(String name) {
		// TODO Auto-generated method stub
		return hibernateUtil.getUserObject(name);
	}

	@Override
	public Approvalstatus getStatusObject(String name) {
		
		return hibernateUtil.getStatusObject(name);
		
	}

	@Override
	public User login(User user) {
		return hibernateUtil.login(user);
	}

	@Override
	public List<Tours> getTourLiist(int id) {
		
		return hibernateUtil.getTourLiist(id);
	}

	@Override
	public Tours getTourObject(int id) {
		
		return hibernateUtil.getTourObject(id);
		
	}

	@Override
	public void updateTour(Tours tour) {
		
		hibernateUtil.updateTour(tour);
		
	}

	@Override
	public List<User> getAllManagers() {
		return hibernateUtil.getAllManagers();
	}

	@Override
	public List<User> getAllFinanceManagers() {
		
		return hibernateUtil.getAllFinanceManagers();
	}

	@Override
	public void saveFinance(Finance finance) {
		hibernateUtil.saveFinance(finance);
	}

	@Override
	public List<Finance> getAllFinance() {
		
		return hibernateUtil.getAllFinance();
	}

	@Override
	public List<Finance> getFinanceLiist(String name) {
		
		return hibernateUtil.getFinanceLiist(name);
		
	}

	@Override
	public Finance getFinanceObject(int id) {
		
		return hibernateUtil.getFinanceObject(id);
	}

	@Override
	public void updatefinance(Finance finance) {
		
		hibernateUtil.updatefinance(finance);
		
	}

	




	

}
