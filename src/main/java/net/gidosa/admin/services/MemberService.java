package net.gidosa.admin.services;

import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import net.gidosa.admin.repositories.mappers.MemberMapper;
import org.springframework.stereotype.Service;

@Log4j2
@Service
@RequiredArgsConstructor
public class MemberService {
    private final MemberMapper memberMapper;
}
