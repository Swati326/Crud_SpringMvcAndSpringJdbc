package org.swati.SpringMvcProject.Repository;

import java.util.List;

import org.swati.SpringMvcProject.Model.Product;





public interface ProductRepo {
	public boolean isAddProduct(Product product);
	public List<Product> getAllRecors();
	public boolean isUpdate(Product product);
	public Product getById(int id);
	public void delete(int id);
	public Product getByName(String name);
	
	
}
