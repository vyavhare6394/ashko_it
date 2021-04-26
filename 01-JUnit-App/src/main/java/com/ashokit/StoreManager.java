package com.ashokit;


import java.util.ArrayList;
import java.util.List;
public class StoreManager {

	
	   private Inventory storeInventory = new Inventory();
	    private List<ShoppingCart> shoppingCarts = new ArrayList<>();
	    private int shoppingCartCounter = 0;

	    public int getProductStock(int pid) {
	        return storeInventory.getStock(pid);
	    }

	    // makes a new cart and returns the cartid
	    public int assignNewCartID() {
	        int id = shoppingCartCounter++;
	        shoppingCarts.add(new ShoppingCart(id));
	        return id;
	    }

	    public boolean addToCart(int cartID, Product p, int amount) {
	        if (storeInventory.removeStock(p.id, amount)) {
	            for (ShoppingCart cart : shoppingCarts) {
	                if (cart.getCartID() == cartID) {
	                    cart.add(p, amount);
	                    return true;
	                }
	            }
	            // put items back
	            storeInventory.addStock(p, amount);
	        }
	        return false;
	    }

	    public boolean removeFromCart(int cartID, Product p, int amount) {
	        for (ShoppingCart cart : shoppingCarts) {
	            if (cart.getCartID() == cartID) {
	                if (cart.remove(p, amount)) {
	                    storeInventory.addStock(p, amount);
	                    return true;
	                }
	                return false;
	            }
	        }
	        return false;
	    }

	    public List<ProductStockPair> getAvailableProducts() {
	        return storeInventory.getProductCatalog();
	    }

	    public List<ProductStockPair> getCartContents(int cartID) {
	        for (ShoppingCart cart : shoppingCarts) {
	            if (cart.getCartID() == cartID) {
	                return cart.getContents();
	            }
	        }
	        return new ArrayList<>(); // just give an empty ArrayList if not found
	    }

	    // on quit
	    public void clearCartContents(int cartID) {
	        for (ShoppingCart cart : shoppingCarts) {
	            if (cart.getCartID() == cartID) {
	                List<ProductStockPair> stuffToPutBack = cart.getContents();
	                for (ProductStockPair pair : stuffToPutBack) {
	                    storeInventory.addStock(pair.product, pair.stock);
	                }
	                // delete cart from shoppingCarts
	                shoppingCarts.remove(cart);
	                return;
	            }
	        }
	    }

	    public double getCartTotal(int cartID) {
	        for (ShoppingCart cart : shoppingCarts) {
	            if (cart.getCartID() == cartID) {
	                return cart.getTotal();
	            }
	        }
	        return -1.0;
	    }
	
	
	
}
