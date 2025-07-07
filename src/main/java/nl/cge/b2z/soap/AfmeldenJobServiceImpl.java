package nl.cge.b2z.soap;

import jakarta.jws.WebService;

@WebService(serviceName = "AfmeldenJobService", endpointInterface = "nl.cge.b2z.soap.AfmeldenJobService")
public class AfmeldenJobServiceImpl implements AfmeldenJobService {

    @Override
    public String afmeldenJob(Integer jobId) {
        return "Job " + jobId + " afgemeld";
    }
}
