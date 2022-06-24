package com.ajrego.crud.dao;
import com.ajrego.crud.entity.Product;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;


public class ProductDAO {

    EntityManagerFactory sf = Persistence.createEntityManagerFactory("Crud");

    EntityManager em2 = sf.createEntityManager();


    private List<Product> allProducts= new ArrayList<Product>();

    public List<Product> getAllProducts() {
        return em2.createQuery("From Product").getResultList();
    }

    public void setallProducts(List<Product> todosProdutos) {
        this.allProducts = todosProdutos;
    }

    private Product product = new Product();
    private static Product productId = new Product();

    public Product getProductId() {
        return em2.find(Product.class, productId.getId());
    }

    public void setProductId(Product productId) {
        this.productId = productId;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product produto) {
        this.product = produto;
    }

    public List<Product> listaProdutos() {
        return allProducts;
    }

    public List<Product> consultarAllProducts() {
        return em2.createQuery("From Product").getResultList();
    }
}
