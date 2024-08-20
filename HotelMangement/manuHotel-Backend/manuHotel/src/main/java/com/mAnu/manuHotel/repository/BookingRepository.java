package com.mAnu.manuHotel.repository;

import com.mAnu.manuHotel.entity.Booking;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface BookingRepository extends JpaRepository<Booking, Long> {
    Optional<Booking> findByRoomId(Long roomId);
    Optional<Booking> findByBookingConfirmationCode(String confirmationCode);

    Optional<Booking> findByUserId(Long userId);
}
