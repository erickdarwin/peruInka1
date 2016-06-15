package pe.com.peruInka.webapp.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import pe.com.peruInka.core.domain.StatusUser;
import pe.com.peruInka.core.domain.TypeDocument;
import pe.com.peruInka.core.domain.UserSystem;
import pe.com.peruInka.service.services.PeruInkaService;

@Controller
public class AdminController {

	@Autowired
	private PeruInkaService peruInkaService;

	@RequestMapping(value = "admin/userSystem", method = RequestMethod.GET)
	public String adminUserSystem(Model model, HttpServletRequest request){

		request.getSession().setAttribute("menuHeader", "userSystem");
		
		model.addAttribute("listUserSystem", peruInkaService.findUserSystem());
		
		return "admin/userSystem";
	}


	@RequestMapping(value = "admin/frmUserSystem", method = RequestMethod.GET)
	public String frmUserSystem(Model model, HttpServletRequest request) {
		model.addAttribute("userSystem", new UserSystem());
		return "admin/frmUserSystem";
	}
	
	@RequestMapping(value = "admin/deleteUserSystem", method = RequestMethod.GET)
	public String deleteUserSystem(Model model, HttpServletRequest request, @RequestParam("id") Long id) {
		peruInkaService.deleteUserSystem(id);
		return "redirect:userSystem";
	}
//	
	
	
	
	@RequestMapping(value = "admin/saveUserSystem", method = RequestMethod.POST)
	public String savePerson(Model model, HttpServletRequest request,@ModelAttribute("userSystem") UserSystem userSystem) {
		peruInkaService.saveUserSystem(userSystem);
		return "redirect:userSystem";
	}

	@RequestMapping(value = "admin/editUserSystem", method = RequestMethod.GET)
	public String editPerson(Model model, HttpServletRequest request,@RequestParam("id") Long id) {
		model.addAttribute("userSystem", peruInkaService.findUserSystemById(id) );
		return "admin/frmUserSystem";
	}


	//para los combos
	@ModelAttribute("statusUser")
	public List<StatusUser> statusUserList(){
		return peruInkaService.findStatusUser();
	}
	
	@ModelAttribute("typeDocument")
	public List<TypeDocument> typeDocumentList(){
		return peruInkaService.findTypeDocument();
	}

	
	
	
	
	
	
	
	
	
	

	@RequestMapping(value = "admin/dashboard", method = RequestMethod.GET)
	public String adminDashboard(Model model, HttpServletRequest request) {

		request.getSession().setAttribute("menuHeader", "admin");

		System.out.println("admin/dashboard");

		return "admin/dashboard";
	}
}
