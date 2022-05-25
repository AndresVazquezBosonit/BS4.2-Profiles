package BS41Perfiles;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
  @Autowired ServiceClass serviceClass;
  @Autowired ConfigCLass configCLass;
  @Autowired Perfiles perfil;

  @GetMapping("/parametros")
  private String getParametros() {
    return "Url: " + serviceClass.getUrl() + " " + "Password: " + serviceClass.getPassword();
  }

  @GetMapping("/miconfiguracion")
  private String getConfig() {
    return "{ "
        + "Url: "
        + serviceClass.getUrl()
        + ", Pasword: "
        + serviceClass.getPassword()
        + ", Valor1: "
        + configCLass.getValor1()
        + ", Valor2: "
        + configCLass.getValor2()
        + " }";
  }

  @GetMapping("/perfil")
  private String getPerfil() {
    return perfil.miFuncion();
  }
}
