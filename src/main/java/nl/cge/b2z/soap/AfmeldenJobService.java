package nl.cge.b2z.soap;

import jakarta.jws.WebMethod;
import jakarta.jws.WebService;

@WebService(name = "AfmeldenJobService", serviceName = "AfmeldenJobService")
public interface AfmeldenJobService {

    @WebMethod
    String afmeldenJob(Integer jobId);
}
