package com.ustglobal.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.ustglobal.forms.FormPOItem;
import com.ustglobal.forms.mapper.FormPOItemMapper;
import com.ustglobal.integration.login.service.LoginService;
import com.ustglobal.integration.login.to.LoginRequestTO;
import com.ustglobal.integration.login.to.LoginResponseTO;
import com.ustglobal.model.POItem;
import com.ustglobal.service.ReceiptService;

@Controller
public class LoginController {

	@Autowired
	LoginService loginService;

	@Autowired
	ReceiptService receiptService;

	@RequestMapping(value = "/login", method = RequestMethod.GET)
	public ModelAndView showLogin(HttpServletRequest request, HttpServletResponse response) {
		ModelAndView mav = new ModelAndView("login");
		mav.addObject("login", new LoginRequestTO());
		return mav;
	}

	@RequestMapping(value = "/loginProcess", method = RequestMethod.POST)
	public ModelAndView loginProcess(HttpServletRequest request, HttpServletResponse response,
			@ModelAttribute("login") LoginRequestTO login) {
		ModelAndView mav = null;
		LoginResponseTO loginResponseTO = loginService.validateUser(login);

		if (null != loginResponseTO) {

			// Get assigned user PO
			List<POItem> po_Items = receiptService.getAssignedPOItems(loginResponseTO.getUserId());
			mav = new ModelAndView("welcome");
			mav.addObject("firstname", loginResponseTO.getFirstname());
			mav.addObject("formPoItems", FormPOItemMapper.map(po_Items));
		} else {
			mav = new ModelAndView("login");
			mav.addObject("message", "Username or Password is wrong!!");
		}
		return mav;
	}
	
	
	@RequestMapping(value = "/receive", method = RequestMethod.POST)
	public ModelAndView receive(HttpServletRequest request, HttpServletResponse response,
			@ModelAttribute("formPoItems") List<FormPOItem> formPOItems) {
		ModelAndView mav = null;
		receiptService.receiveToWareHouse(formPOItems);
		mav = new ModelAndView("successful");
		return mav;
	}
}
