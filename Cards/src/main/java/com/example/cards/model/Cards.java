package com.example.cards.model;

import java.sql.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;


@Entity
@Table (name="cards")
public class Cards {
	
	
	
	@Id
	
	@GeneratedValue(strategy = GenerationType.AUTO)
	
	@Column(name="card_id")
	
	private int cardId;
	@Column(name="card_id")
	
	private int customerId;
	
	@Column(name="card_number")
	private int cardNumber;
	
	@Column(name="card_type")
	private String cardType;
	
	@Column(name="expire_date")
	private Date expireDate;
	
	
	
	public int getCardId() {
		return cardId;
	}
	public void setCardId(int cardId) {
		this.cardId = cardId;
	}
	public int getCustomerId() {
		return customerId;
	}
	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}
	public int getCardNumber() {
		return cardNumber;
	}
	public void setCardNumber(int cardNumber) {
		this.cardNumber = cardNumber;
	}
	public String getCardType() {
		return cardType;
	}
	public void setCardType(String cardType) {
		this.cardType = cardType;
	}
	public Date getExpireDate() {
		return expireDate;
	}
	public void setExpireDate(Date expireDate) {
		this.expireDate = expireDate;
	}
	
	

}
