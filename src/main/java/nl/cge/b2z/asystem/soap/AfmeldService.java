package nl.cge.b2z.asystem.soap;

import jakarta.jws.WebMethod;
import jakarta.jws.WebService;

@WebService(name = "AfmeldService", serviceName = "AfmeldService")
public interface AfmeldService {

    @WebMethod
    String meldAf(Integer jobId);

}
