package dev.ashish.EcomPaymentService.repository;

import dev.ashish.EcomPaymentService.entity.Payment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface PaymentRepository extends JpaRepository<Payment, UUID> {
    Payment findByOrderId(UUID orderId);
}
