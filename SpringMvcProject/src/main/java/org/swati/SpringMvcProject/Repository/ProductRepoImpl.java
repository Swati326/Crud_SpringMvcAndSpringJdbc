package org.swati.SpringMvcProject.Repository;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.PreparedStatementSetter;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import org.swati.SpringMvcProject.Model.Product;
import org.swati.SpringMvcProject.Repository.ProductRepo;


@Repository("productrepo")
public class ProductRepoImpl implements ProductRepo {
	@Autowired
	JdbcTemplate template; 
	Product product;
	@Override
	public boolean isAddProduct(final Product product) {
		// TODO Auto-generated method stub
		int val=template.update("insert into product values('0',?,?)",new PreparedStatementSetter()
				{

					@Override
					public void setValues(PreparedStatement ps) throws SQLException {
						// TODO Auto-generated method stub
						ps.setString(1, product.getProductname());
						ps.setInt(2, product.getPrice());
					}
					
				});
				if(val>0)
				{
					return true;
				}
				else
				{
		return false;
	}
	}
	@Override
	public List<Product> getAllRecors() {
		// TODO Auto-generated method stub
		List<Product> list = template.query("select *from product", new RowMapper<Product>() {
			public Product mapRow(ResultSet rs, int rowNum) throws SQLException {
				Product p=new Product();
				p.setId(rs.getInt(1));
				p.setProductname(rs.getString(2));
				p.setPrice(rs.getInt(3));
				//System.out.println(p);
				return p;	
			}
			
		});
		return list;
	}
	@Override
	public boolean isUpdate(final Product product) {
		
		// TODO Auto-generated method stub
		int val=template.update("update product set productname=?,price=? where id=?",new PreparedStatementSetter() {

					public void setValues(PreparedStatement ps) throws SQLException {
						// TODO Auto-generated method stub
						ps.setString(1, product.getProductname());
						ps.setInt(2, product.getPrice());
						ps.setInt(3, product.getId());
					}
					
				});
				if(val>0)
				{
					return true;
				}
				else
				{
				return false;
			}
			
	}
	@Override
	public Product getById(int id){
		// TODO Auto-generated method stub
		product=template.queryForObject("select *from product where id=?", new Object[] {id}, new RowMapper<Product>() {
			public Product mapRow(ResultSet rs, int rowNum) throws SQLException {
				Product p=new Product();
				p.setId(rs.getInt(1));
				p.setProductname(rs.getString(2));
				p.setPrice(rs.getInt(3));
				
				return p;
			}
			
		});
		return product;
	}
	
	public void delete(int id) {
		// TODO Auto-generated method stub
		template.update("delete from product where id=?",new Object[] {id});
		
		
	}
	
	public Product getByName(String productname){
		// TODO Auto-generated method stub
		try {
		product=template.queryForObject("select *from product where productname=?", new Object[] {productname}, new RowMapper<Product>() {
			public Product mapRow(ResultSet rs, int rowNum) throws SQLException {
				Product p=new Product();
				p.setId(rs.getInt(1));
				p.setProductname(rs.getString(2));
				p.setPrice(rs.getInt(3));
				
				return p;
			}
			
		});
		return product;
	}
		catch (EmptyResultDataAccessException e)
		{
			 System.out.printf("No record found in database for "+productname, e);
			 return null;
	    }
		}
		
	
	}
	


    
    
  
  

	
	


