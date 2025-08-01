package com.example.service;

import com.example.model.RoyaltyPayment;
import com.example.model.RoyaltyPayment.PayeeType;
import com.example.model.RoyaltyPayment.RoyaltyType;

import java.math.BigDecimal;
import java.util.List;
import java.util.Optional;

public interface IRoyaltyPaymentService {
RoyaltyPayment saveRoyaltyPayment(RoyaltyPayment royaltyPayment);
Optional<RoyaltyPayment> getRoyaltyPaymentById(int id);
List<RoyaltyPayment> getAllRoyaltyPayments();
void deleteRoyaltyPayment(int id);

List<RoyaltyPayment> getByPayee(PayeeType payeeType, int payeeId);
List<RoyaltyPayment> getByProductId(int productId);
List<RoyaltyPayment> getByOrderId(int orderId);
BigDecimal getTotalRoyaltyAmount(PayeeType payeeType, int payeeId);
List<RoyaltyPayment> getByRoyaltyType(RoyaltyType royaltyType);
}