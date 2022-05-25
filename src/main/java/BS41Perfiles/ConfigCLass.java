package BS41Perfiles;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@PropertySource("classpath:miconfiguracion.properties")
public class ConfigCLass {
    @Value("${valor1}")
    private String valor1;
    @Value("${valor2}")
    private String valor2;

    public ConfigCLass() {
    }

    public String getValor1() {
        return valor1;
    }

    public void setValor1(String valor1) {
        this.valor1 = valor1;
    }

    public String getValor2() {
        return valor2;
    }

    public void setValor2(String valor2) {
        this.valor2 = valor2;
    }

    @Override
    public String toString() {
        return "ConfigCLass{" +
                "valor1='" + valor1 + '\'' +
                ", valor2='" + valor2 + '\'' +
                '}';
    }
}
