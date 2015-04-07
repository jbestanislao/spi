package com.estanislao.serviceloader;
import com.estanislao.serviceloader.service.TestService;
import org.junit.Test;

import java.util.ServiceLoader;

public class MainTest {
    @Test
    public void test() {
        ServiceLoader<TestService> testServices = ServiceLoader.load(TestService.class);

        for (TestService testService : testServices) {
            testService.getServiceName();
        }
    }
}
