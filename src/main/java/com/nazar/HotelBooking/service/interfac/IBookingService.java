package com.nazar.HotelBooking.service.interfac;

import com.nazar.HotelBooking.dto.Response;
import com.nazar.HotelBooking.entity.Booking;

public interface IBookingService {

    Response saveBooking(Long roomId, Long userId, Booking bookingRequest);
    Response findBookingByConfirmationCode(String confirmationCode);
    Response getAllBookings();
    Response cancelBooking(Long bookingId);
}
