package kodlamaio.northwind.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kodlamaio.northwind.business.abstracts.ProductService;
import kodlamaio.northwind.entities.concretes.Product;

@RestController //sen bir controllersın
@RequestMapping("/api/products")//dışarıdan bu yolla istek gelirse ProductsController buna cevap verecek diyoruz 
public class ProductsController {

	private ProductService productService;
	
	@Autowired//projeyi tarıyıp bizim yerimize newleme yapıyor,çoklu somut nesnede patlar
	public ProductsController(ProductService productService) {
		super();
		this.productService = productService;
	}

	@GetMapping("/getall")//yukarıdaki adrese ek bu da gelirse bu metod çalışsın dedik
	public List<Product> getAll(){
		return this.productService.getAll();
	}
}
