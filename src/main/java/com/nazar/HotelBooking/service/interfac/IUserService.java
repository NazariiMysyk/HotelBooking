package com.nazar.HotelBooking.service.interfac;

import com.nazar.HotelBooking.dto.LoginRequest;
import com.nazar.HotelBooking.dto.Response;
import com.nazar.HotelBooking.entity.User;

public interface IUserService {

    Response register(User user);
    Response login(LoginRequest loginRequest);
    Response getAllUsers();
    Response getUserBookingHistory(String userId);
    Response deleteUser(String userId);
    Response getUserById(String userId);
    Response getMyInfo(String email);





}
