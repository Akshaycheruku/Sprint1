package com.surveybuilder.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import com.surveybuilder.dao.AdminDao;
import com.surveybuilder.dao.SurveyorDao;
import com.surveybuilder.entities.Admin;
import com.surveybuilder.entities.Feedback;
import com.surveybuilder.entities.Responses;
import com.surveybuilder.entities.Surveyor;


@Service
@Scope(scopeName="singleton")
public class AdminServiceImpl implements AdminService{
	@Autowired
	private AdminDao admindao=null;
	
	@Autowired
	private SurveyorDao surveyordao=null;
	
	@Override
	public void createAdmin(Admin admin) {
		admindao.save(admin);
	}
	@Override
	public void createSurveyor(Surveyor surveyor) {
		surveyordao.save(surveyor);
		
	}
	
	

}
