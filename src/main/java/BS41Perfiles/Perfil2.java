package BS41Perfiles;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Component
@Profile("perfil2")
public class Perfil2 implements Perfiles {
  private String perfil="Perfil 2";

  @Override
  public String miFuncion() {
    System.out.println("////------PERFIL 2------////");
    return this.perfil;

  }
}
