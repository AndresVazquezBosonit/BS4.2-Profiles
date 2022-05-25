package BS41Perfiles;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class ServiceClass {
    @Value("${url}")
    private String url;
    @Value("${password}")
    private String password;

    public ServiceClass() {
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "ServiceClass{" +
                "url='" + url + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
