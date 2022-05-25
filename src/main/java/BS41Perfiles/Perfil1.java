package BS41Perfiles;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Component
@Profile("perfil1")
public class Perfil1 implements Perfiles {
    private String perfil="Perfil 1";
    @Override
    public String miFuncion() {
        System.out.println("////------PERFIL 1------////");
        return this.perfil;
    }
}
