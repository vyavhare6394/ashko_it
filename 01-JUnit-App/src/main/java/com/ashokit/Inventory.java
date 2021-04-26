package com.ashokit;


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

private void initialize() {
// can add some default inventory stock here
productCatalog.add(new ProductStockPair(new Product(100.0, "SYSC2004", 0), 76));
productCatalog.add(new ProductStockPair(new Product(55.0, "SYSC4906", 1), 0));
productCatalog.add(new ProductStockPair(new Product(45.0, "SYSC2006", 2), 32));
productCatalog.add(new ProductStockPair(new Product(35.0, "MUSI1001", 3), 3));
productCatalog.add(new ProductStockPair(new Product(0.01, "CRCJ1000", 4), 12));
productCatalog.add(new ProductStockPair(new Product(25.0, "ELEC4705", 5), 132));
productCatalog.add(new ProductStockPair(new Product(145.0, "SYSC4907", 6), 322));
}
}
