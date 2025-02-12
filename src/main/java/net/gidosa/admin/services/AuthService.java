package net.gidosa.admin.services;

import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import net.gidosa.admin.repositories.mappers.AuthMapper;
import org.springframework.stereotype.Service;

@Log4j2
@Service
@RequiredArgsConstructor
public class AuthService {
    private final AuthMapper authMapper;

    public String test1() {
        return authMapper.test1().toString();
    }
}
