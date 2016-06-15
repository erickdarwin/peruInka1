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

import pe.com.peruInka.core.domain.Hotel;
import pe.com.peruInka.core.domain.Product;
import pe.com.peruInka.core.domain.StatusHotel;
import pe.com.peruInka.core.domain.StatusPerson;
import pe.com.peruInka.core.domain.StatusProduct;
import pe.com.peruInka.core.domain.TypeDocument;
import pe.com.peruInka.service.services.PeruInkaService;

@Controller
public class DashboardController {

	@Autowired
	private PeruInkaService peruInkaService;

	@RequestMapping(value = "home/dashboard", method = RequestMethod.GET)
	public String homeDashboard(Model model, HttpServletRequest request) {
		model.addAttribute("listPerson", peruInkaService.findAllPerson());

		request.getSession().setAttribute("menuHeader", "home");

		System.out.println("home/dashboard");

		return "home/dashboard";
	}

	@RequestMapping(value = "home/deletePerson", method = RequestMethod.GET)
	public String deletePerson(Model model, HttpServletRequest request, @RequestParam("id_") Long id) {

		peruInkaService.deletePerson(id);

		return "redirect:dashboard";
	}

	@RequestMapping(value = "home/frmPerson", method = RequestMethod.GET)
	public String newPerson(Model model, HttpServletRequest request) {
		model.addAttribute("person", new pe.com.peruInka.core.domain.Person());
		model.addAttribute("opc", "new");

		return "home/frmPerson";
	}

	@ModelAttribute("typeDocument")
	public List<TypeDocument> typeDocumentList() {
		return peruInkaService.findTypeDocument();
	}

	@ModelAttribute("statusPerson")
	public List<StatusPerson> statusPersonList() {
		return peruInkaService.findStatusPerson();
	}

	@ModelAttribute("statusHotel")
	public List<StatusHotel> statusHotelList() {
		return peruInkaService.findStatusHotel();
	}

	@ModelAttribute("statusProduct")
	public List<StatusProduct> statusProductList() {
		return peruInkaService.findStatusProduct();
	}
	
	
	@RequestMapping(value = "home/savePerson", method = RequestMethod.POST)
	public String savePerson(Model model, HttpServletRequest request,
			@ModelAttribute("person") pe.com.peruInka.core.domain.Person person) {
		String opc = request.getParameter("opc");
		if (opc.equals("new")) {
			peruInkaService.savePerson(person);
		} else {
			peruInkaService.updatePerson(person);
		}

		return "redirect:dashboard";
	}

	@RequestMapping(value = "home/editPerson", method = RequestMethod.GET)
	public String editPerson(Model model, HttpServletRequest request, @RequestParam("id_") Long id) {
		model.addAttribute("person", peruInkaService.searchPerson(id));
		model.addAttribute("opc", "update");
		return "home/frmPerson";
	}

	@RequestMapping(value = "home/hotels", method = RequestMethod.GET)
	public String showHotels(Model model, HttpServletRequest request) {

		List<Hotel> lista = peruInkaService.findAllHotel();

		model.addAttribute("hoteles", lista);
		request.getSession().setAttribute("menuHeader", "hotels");

		return "home/hotels";
	}

	@RequestMapping(value = "home/frmHotel", method = RequestMethod.GET)
	public String getFrmHotel(Model model) {

		model.addAttribute("hotel", new Hotel());
		model.addAttribute("personas", peruInkaService.findAllPerson());
		model.addAttribute("opc", "new");
		return "home/frmHotel";
	}

	@RequestMapping(value = "home/saveHotel", method = RequestMethod.POST)
	public String saveHotel(Model model, @ModelAttribute("hotel") Hotel hotel, HttpServletRequest request) {
		String opc = request.getParameter("opc");

		peruInkaService.saveHotel(hotel);

		return "redirect:hotels";
	}

	@RequestMapping(value = "home/deleteHotel", method = RequestMethod.GET)
	public String deleteHotel(@RequestParam("id_") Long id) {

		peruInkaService.deleteHotel(id);

		return "redirect:hotels";
	}

	@RequestMapping(value = "home/editHotel", method = RequestMethod.GET)
	public String getEditHotel(Model model, @RequestParam("id_") Long id) {

		Hotel hotel = peruInkaService.searchHotel(id);

		model.addAttribute("hotel", hotel);
		model.addAttribute("opc", "update");
		model.addAttribute("personas", peruInkaService.findAllPerson());

		return "home/frmHotel";
	}

	
	@RequestMapping(value = "home/products", method = RequestMethod.GET)
	public String showProducts(Model model, HttpServletRequest request) {

		List<Product> lista = peruInkaService.findAllProduct();

		model.addAttribute("productos", lista);
		request.getSession().setAttribute("menuHeader", "products");

		return "home/products";
	}
	
	@RequestMapping(value = "home/frmProduct", method = RequestMethod.GET)
	public String getFrmProduct(Model model) {

		model.addAttribute("product", new Product());
		model.addAttribute("hoteles", peruInkaService.findAllHotel()); 
		model.addAttribute("opc", "new");
		return "home/frmProduct";
	}

	@RequestMapping(value = "home/saveProduct", method = RequestMethod.POST)
	public String saveHotel(Model model, @ModelAttribute("product") Product product, HttpServletRequest request) {
		String opc = request.getParameter("opc");

		peruInkaService.saveProduct(product);

		return "redirect:products";
	}

	@RequestMapping(value = "home/deleteProduct", method = RequestMethod.GET)
	public String deleteProduct(@RequestParam("id_") Long id) {

		peruInkaService.deleteProduct(id);

		return "redirect:products";
	}

	@RequestMapping(value = "home/editProduct", method = RequestMethod.GET)
	public String getEditProduct(Model model, @RequestParam("id_") Long id) {

		Product product = peruInkaService.searchProduct(id);

		model.addAttribute("product", product);
		model.addAttribute("opc", "update");
		model.addAttribute("hoteles", peruInkaService.findAllHotel());

		return "home/frmProduct";
	}
}
