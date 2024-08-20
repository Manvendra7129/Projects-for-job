package com.mAnu.manuHotel.service.interfac;

import com.mAnu.manuHotel.dto.LoginRequest;
import com.mAnu.manuHotel.dto.Response;
import com.mAnu.manuHotel.entity.User;

public interface IUserService {
    Response register(User user);

    Response login(LoginRequest loginRequest);

    Response getAllUsers();

    Response getUserBookingHistory(String userId);

    Response deleteUser(String userId);

    Response getUserById(String userId);

    Response getMyInfo(String email);
}
