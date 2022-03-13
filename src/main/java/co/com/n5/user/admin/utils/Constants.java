package co.com.n5.user.admin.utils;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Constants {

    @Value("${rout.path.principal}")
    public String principalPath;

    @Value("${rout.path.person}")
    public String personPath;

    @Value("${rout.path.gender}")
    public String genderPath;

    @Value("${rout.path.documentType}")
    public String documentTypePath;

    @Value("${rout.path.role}")
    public String rolePath;

    @Value("${rout.path.access}")
    public String accessPath;

    @Value("${rout.path.access.role}")
    public String accessByRolePath;

    @Value("${rout.path.role.user}")
    public String roleByUserPath;

}
