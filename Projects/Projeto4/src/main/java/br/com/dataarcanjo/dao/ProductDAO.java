package br.com.dataarcanjo.dao;

import java.io.Serializable;

import br.com.dataarcanjo.domain.Product;

public class ProductDAO extends GenericDAO<Product, Long>{

	public ProductDAO() {
		super(Product.class);
	}

}
