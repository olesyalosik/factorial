package com.example.factorial;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
//@RequestMapping("api/factorial")
public class FactorialController {

    @GetMapping("/factorialOfN")

        public static long fact(@RequestParam(value = "number", defaultValue = "0") long n)
        {
            long result=1;
            if(n==0)
            {
                return 1;
            }
            for(int i=1; i<=n; i++)
            {
                result*=i;
            }
            return result;
        }
    @GetMapping("/factorialsTillN")
        public static ArrayList<Long> facts(@RequestParam(value = "number", defaultValue = "0") long n)
        {
            ArrayList<Long> res =new ArrayList<>();
            long result=1;
            if(n==0)
            {
                res.add(1L);
                return res;
            }
            for(int i=1; i<=n; i++)
            {
                result*=i;
                res.add(result);
            }
            return res;
        }
}
