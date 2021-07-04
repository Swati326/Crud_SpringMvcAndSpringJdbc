package org.swati.SpringMvcProject.controller;

import java.io.IOException;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import org.swati.SpringMvcProject.Model.Product;
import org.swati.SpringMvcProject.Model.User;
import org.swati.SpringMvcProject.Service.ProductService;

@Controller
public class HomeController {

	@Autowired
	ProductService productService;

	@RequestMapping(value="/")
	public ModelAndView test(HttpServletResponse response) throws IOException{
		return new ModelAndView("success");
	}
	
	@RequestMapping(value="/hi",method=RequestMethod.POST)
		public String handlForm(@ModelAttribute("user") User user,Map map)
		{
		 if(user.getName().equals("admin") && user.getPassword().equals("admin"))
		 {
				return "view";
		 }
	
		 else
		 {
			 map.put("msg","invalid username and password");
			 return "success";
		 }
	}
	@RequestMapping(value="/addnewproduct",method=RequestMethod.GET)
	public String addNewProduct()
	{
		return "addproduct";
		
	}
	@RequestMapping(value="/add" ,method=RequestMethod.POST)
	public String add(Product product,Map map)
	{
		boolean b=productService.isAddProduct(product);
		if(b)
		{
			map.put("msg","Record save successfully");
		}
		else
		{
			map.put("msg","Record Not save successfully");
		}
		return "addproduct";
		
	}
	@RequestMapping(value="/viewproduct")
	public String viewProduct(Model model) 
	{
		List<Product> product=productService.getAllRecors();
		
		model.addAttribute("product",product);
		return "viewproduct";
		
	}
	/*
	@RequestMapping(value="/editproduct/{product.id}")
	public String EditProduct(@PathVariable int id,Model m)
	{
		Product product=productService.getById(id);
		  m.addAttribute("product",product);  
		  	return "update";
		
	}

    }    

	@RequestMapping(value="/edit",method=RequestMethod.POST)
	public String EditProduct1(Product product,Map map)
	{
		boolean b=productService.isUpdate(product);
		//model.addAttribute("product",product);
		if(b)
		{
			map.put("msg","update successfully");
			return "viewproduct";
		}
		else
		{
			map.put("msg","not update successfully");
		}
		return "viewproduct";
		
	}
	*/
	@RequestMapping(value = "/deleteproduct", method = RequestMethod.GET)
	public ModelAndView deleteContact(HttpServletRequest request) {
		int id = Integer.parseInt(request.getParameter("id"));
		 productService.delete(id);
		return new ModelAndView("redirect:/viewproduct");
	}
	/* @RequestMapping(value="/deleteproduct/{product.id}",method = RequestMethod.GET)  
	    public String deleteData(@ModelAttribute("product") Product product,@PathVariable("id")int id)
	 	{  
		 productService.delete(id);  
	        return "home";  
	    }   

	*/
	@RequestMapping(value = "/update", method = RequestMethod.POST)
	public ModelAndView saveProduct(@ModelAttribute Product product) {
		productService.isUpdate(product);		
		return new ModelAndView("redirect:/viewproduct");
	
}
	@RequestMapping(value = "/editproduct", method = RequestMethod.GET)
	public ModelAndView editProduct(HttpServletRequest request) {
		int id = Integer.parseInt(request.getParameter("id"));
		Product product = productService.getById(id);
		ModelAndView model = new ModelAndView("update");
		model.addObject("product", product);	
		return model;
	}
	
	@RequestMapping(value="/searchproduct",method=RequestMethod.GET)
	public String SearchProduct()
	{
		return "searchproduct";
	}
	
	@RequestMapping(value="/back",method=RequestMethod.GET)
	public String Gotohome()
	{
		return "view";
	}
	
	@RequestMapping(value = "/search", method = RequestMethod.GET)
	public ModelAndView searchProduct(HttpServletRequest request) {
		String productname= request.getParameter("productname");
		Product product = productService.getByName(productname);
		ModelAndView model = new ModelAndView("Searchpd");
		model.addObject("product", product);
		return model;
}
}
		
	
	

