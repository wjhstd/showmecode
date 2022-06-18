package com.ityousee.boot;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class BootApplicationTests {
    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Test
    public void contextLoads() {
        Long tmp = 3435973836L;
        int max=10457280,min=5971520;
        
        for (int i= 5658; i < 6341; i++){
            int ran2 = (int) (Math.random()*(max-min)+min);
            tmp += ran2;
            String sql = "update p_volume_rt set capacity_used = ? where id = ?";
            jdbcTemplate.update(sql, tmp, i);
        }
        
    }

}
