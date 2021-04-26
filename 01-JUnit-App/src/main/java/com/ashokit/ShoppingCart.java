package com.ashokit;


import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {
private List<ProductStockPair> contents = new ArrayList<>();
private int cartID;
private double total = 0.0;

public ShoppingCart(int cartID) {
this.cartID = cartID;
}

public List<ProductStockPair> getContents() {
return contents;
}

public void add(Product p, int amount) {

if (amount < 1) return;

total += p.price * amount;
for (int i = 0; i < contents.size(); i++) {
ProductStockPair item = contents.get(i);
if (item.product.id == p.id) {
contents.set(i, new ProductStockPair(item.product, item.stock + amount));
return;
}
}
contents.add(new ProductStockPair(p, amount));
}

public boolean remove(Product p, int amount) {

if (amount < 1) return false;

for (int i = 0; i < contents.size(); i++) {
ProductStockPair item = contents.get(i);
if (item.product.id == p.id) {
if (item.stock < amount) {
return false;
}
else if (item.stock == amount) {
contents.remove(i); // delete
}
else {
contents.set(i, new ProductStockPair(item.product, item.stock - amount));
}
total -= p.price * amount;
return true;
}
}
// didnt find it
return false;
}

public void clear() {
contents.clear();
}

public double getTotal() {
return total;
}

public int getCartID() { return cartID; }
}