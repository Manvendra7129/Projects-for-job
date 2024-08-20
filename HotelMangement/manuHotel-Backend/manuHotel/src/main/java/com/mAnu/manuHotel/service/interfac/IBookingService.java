package com.mAnu.manuHotel.service.interfac;


import com.mAnu.manuHotel.dto.Response;
import com.mAnu.manuHotel.entity.Booking;

public interface IBookingService {

    Response saveBooking(Long roomId, Long userId, Booking bookingRequest);

    Response findBookingByConfirmationCode(String confirmationCode);

    Response getAllBookings();

    Response cancelBooking(Long bookingId);

}