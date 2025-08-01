package com.example.model;

import jakarta.persistence.*;
import java.time.LocalDateTime;
import java.util.List;

@Entity
@Table(name = "Carts")
public class Cart {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "Cart_ID")
	private int cartId;

	@OneToOne
	@JoinColumn(name = "User_ID", unique = true, nullable = false)
	private User user;

	@Column(name = "Created_At", nullable = false)
	private LocalDateTime createdAt;

	@OneToMany(mappedBy = "cart", cascade = CascadeType.ALL, orphanRemoval = true)
	private List<CartItem> cartItems;

	public Cart() {}

	// Getters and Setters

	public int getCartId() {
	    return cartId;
	}

	public void setCartId(int cartId) {
	    this.cartId = cartId;
	}

	public User getUser() {
	    return user;
	}

	public void setUser(User user) {
	    this.user = user;
	}

	public LocalDateTime getCreatedAt() {
	    return createdAt;
	}

	public void setCreatedAt(LocalDateTime createdAt) {
	    this.createdAt = createdAt;
	}

	public List<CartItem> getCartItems() {
	    return cartItems;
	}

	public void setCartItems(List<CartItem> cartItems) {
	    this.cartItems = cartItems;
	}
}
