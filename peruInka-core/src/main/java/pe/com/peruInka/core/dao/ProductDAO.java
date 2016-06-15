package pe.com.peruInka.core.dao;

import java.util.List;

import pe.com.peruInka.core.domain.Product;
import pe.com.peruInka.core.domain.StatusProduct;

public interface ProductDAO {

	 List<Product> findAllProduct();
	 
	 List<StatusProduct> findStatusProduct() ;
	 
	 void saveProduct(Product product);
	 
	 void deleteProduct(Long id) ;
	 
	 Product searchProduct(Long id);
	 	 

	

}
