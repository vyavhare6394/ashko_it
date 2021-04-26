package com.chegg.ank;

import java.util.ArrayList;
import java.util.List;

public class Inventory {


private final List<ProductStockPair> productCatalog = new ArrayList<>();

public Inventory() {
initialize();
}

/**
* Returns the stock of the specified Product (given by its id).
*
* @param pid int : the id of the Product.
* @return int : -1 if id is invalid, or stock of the specified Product.
*/
public int getStock(int pid) {
for (ProductStockPair pair : productCatalog) {
if (pair.product.id == pid) {
return pair.stock;
}
}
return -1;
}

// not sure how they would've done the method signature differently
// this method will overwrite the old ProductStockPair
public void addStock(Product p, int n) {
// no negative ids please
if (p.id < 0) return;
if (n < 1) return;

for (int i = 0; i < productCatalog.size(); i++) {
ProductStockPair pair = productCatalog.get(i);
if (pair.product.id == p.id) {
productCatalog.set(i, new ProductStockPair(p, pair.stock + n));
return;
}
}
productCatalog.add(new ProductStockPair(p, n));
}

public boolean removeStock(int pid, int n) {

if (n < 1) return false;

for (int i = 0; i < productCatalog.size(); i++) {
ProductStockPair pair = productCatalog.get(i);
if (pair.product.id == pid) {
if (pair.stock >= n) {
productCatalog.set(i, new ProductStockPair(pair.product, pair.stock - n));
return true;
}
return false;
}
}
return false;
}

/**
* Get the Product from the Inventory corresponding to the id.
*
* @param pid int : the id of the Product.
* @return Product : null if id is invalid, or the Product corresponding to the id.
*/
public Product getProductInfo(int pid) {
for (ProductStockPair pair : productCatalog) {
if (pair.product.id == pid) {
return pair.product;
}
}
return null;
}

public List<ProductStockPair> getProductCatalog() {
return productCatalog;
}

}