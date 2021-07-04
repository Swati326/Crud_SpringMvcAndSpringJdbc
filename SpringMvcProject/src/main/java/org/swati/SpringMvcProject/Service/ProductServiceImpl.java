package org.swati.SpringMvcProject.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.servlet.ModelAndView;
import org.swati.SpringMvcProject.Model.Product;
import org.swati.SpringMvcProject.Repository.ProductRepo;
@Service("productService")
public class ProductServiceImpl implements ProductService{
@Autowired
private ProductRepo productrepo;
	@Override
	public boolean isAddProduct(Product product) {
		// TODO Auto-generated method stub
		boolean b=productrepo.isAddProduct(product);
		return b;
	}
	@Override
	public List<Product> getAllRecors() {
		// TODO Auto-generated method stub
		List<Product> product=productrepo.getAllRecors();
		return product;
	}
	@Override
	public boolean isUpdate(Product product) {
		// TODO Auto-generated method stub
		boolean b=productrepo.isUpdate(product);
		return b;
	}
	@Override
	public Product getById(int id) {
		// TODO Auto-generated method stub
		Product product=productrepo.getById(id);
		return product;
	}
	@Override
	public void delete(int id) {
		// TODO Auto-generated method stub
		productrepo.delete(id);
	}
	@Override
	public Product getByName(String productname) {
		// TODO Auto-generated method stub
		Product product=productrepo.getByName(productname);
		return product;
		
	}

}
