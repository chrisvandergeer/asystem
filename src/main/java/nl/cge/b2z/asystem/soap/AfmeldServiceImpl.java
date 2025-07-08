package nl.cge.b2z.asystem.soap;

import jakarta.jws.WebMethod;
import jakarta.jws.WebService;

@WebService(serviceName = "AfmeldService")
public class AfmeldServiceImpl implements AfmeldService {

    @WebMethod
    @Override
    public String meldAf(Integer jobId) {
        return "Job met jobId " + jobId + " afgemeld";
    }
}
