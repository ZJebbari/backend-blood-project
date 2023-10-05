package com.zj.springbootproductseller.service;

import com.zj.springbootproductseller.model.Purchase;
import com.zj.springbootproductseller.repository.projection.PurchaseItem;

import java.util.List;

public interface PurchaseService {
    Purchase savePurchase(Purchase purchase);

    List<PurchaseItem> findPurchaseItemsOfUser(Long userId);
}
