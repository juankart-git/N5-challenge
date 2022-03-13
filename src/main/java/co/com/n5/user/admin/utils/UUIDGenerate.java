package co.com.n5.user.admin.utils;

import org.springframework.stereotype.Component;

import java.util.UUID;

@Component
public class UUIDGenerate {

    public UUID randomUUID () {
        return UUID.randomUUID();
    }

}
