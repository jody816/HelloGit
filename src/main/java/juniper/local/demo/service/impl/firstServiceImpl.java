package juniper.local.demo.service.impl;

import juniper.local.demo.service.firstService;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
public class firstServiceImpl implements firstService {

    @Override
    public Map<String, Object> getFirstData() {

        Map<String, Object> firstData = new HashMap<>();

        firstData.put("label1", "check1");
        firstData.put("label2", "check2");
        firstData.put("label3", "check3");
        firstData.put("test1", "test1");
        firstData.put("test2", "test2");

        return firstData;
    }

}
