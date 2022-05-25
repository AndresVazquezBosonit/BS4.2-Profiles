package BS41Perfiles;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.ConfigurationPropertiesScan;

import javax.annotation.PostConstruct;

@SpringBootApplication
@ConfigurationPropertiesScan
public class PerfilesApplication {
  @Autowired ServiceClass serviceClass;
  @Autowired ConfigCLass configCLass;

  public static void main(String[] args) {
    for(String a: args){
      System.out.println(a);
    }
    SpringApplication.run(PerfilesApplication.class, args);
  }

  @PostConstruct
  public void init() {
    System.out.println(
        "{ "
            + "Url: "
            + serviceClass.getUrl()
            + ", Pasword: "
            + serviceClass.getPassword()
            + ", Valor1: "
            + configCLass.getValor1()
            + ", Valor2: "
            + configCLass.getValor2()
            + " }");
  }
}
