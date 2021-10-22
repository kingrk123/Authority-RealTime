package com.getarrays.entity;

import io.swagger.annotations.ApiModelProperty;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Entity;
import java.io.Serializable;

@Entity
public class Invoice implements Serializable {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(nullable = false, updatable = false)
	private Long id;
	@ApiModelProperty(notes = "Unique number for an invoice", example = "123")
	private String invoiceNumber;
	@ApiModelProperty(notes = "List of products in the invoice", example = "[rice, beans]")
	private String[] products;
	@ApiModelProperty(notes = "Name of the customer for the invoice", example = "John Doe")
	private String customer;
	@ApiModelProperty(notes = "The total amount of the invoice", example = "25.78")
	private double total;

	public Invoice() {}

	public Invoice(String invoiceNumber, String[] products, String customer, double total) {
		this.invoiceNumber = invoiceNumber;
		this.products = products;
		this.customer = customer;
		this.total = total;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getInvoiceNumber() {
		return invoiceNumber;
	}

	public void setInvoiceNumber(String invoiceNumber) {
		this.invoiceNumber = invoiceNumber;
	}

	public String[] getProducts() {
		return products;
	}

	public void setProducts(String[] products) {
		this.products = products;
	}

	public String getCustomer() {
		return customer;
	}

	public void setCustomer(String customer) {
		this.customer = customer;
	}

	public double getTotal() {
		return total;
	}

	public void setTotal(double total) {
		this.total = total;
	}
}
