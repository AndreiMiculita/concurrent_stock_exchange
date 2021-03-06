package com.dead10cc;

import net.jcip.annotations.Immutable;

@Immutable
class CompletedTransaction extends Transaction {
    private final String buyerId;
    private final String sellerId;

    CompletedTransaction(Buyer buyer, int price, Share shareType, int amount, Seller seller) {
        super(price, shareType, amount);
        this.buyerId = buyer.getId();
        this.sellerId = seller.getId();
    }

    public String getSellerId() {
        return sellerId;
    }

    public String getBuyerId() {
        return buyerId;
    }
}
