package com.example.form.serviceimpl;

import com.example.form.dto.AppUserDto;
import com.example.form.entity.AppUser;
import com.example.form.repository.AppUserRepository;
import com.example.form.service.AppUserService;
import org.springframework.stereotype.Service;

@Service
public class AppUserServiceImpl implements AppUserService {


    private final AppUserRepository appUserRepository;

    public AppUserServiceImpl(AppUserRepository appUserRepository) {
        this.appUserRepository = appUserRepository;
    }

    @Override
    public void saveUser(AppUserDto appUserDto) {

        AppUser appUser = new AppUser();
        appUser.setFirstName(appUserDto.getFirstName());
        appUser.setLastName(appUserDto.getLastName());
        appUser.setCountry(appUserDto.getCountry());
        appUser.setEmail(appUserDto.getEmail());
        appUser.setPassword(appUserDto.getPassword());
        appUser.setHobbies(appUserDto.getHobbies());
        appUser.setGender(appUserDto.getGender());

        appUserRepository.save(appUser);

    }
}
