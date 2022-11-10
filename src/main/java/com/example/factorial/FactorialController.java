package com.example.factorial;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
//@RequestMapping("api/factorial")
public class FactorialController {

    @GetMapping("/factorialOfN")

        public static ResponseEntity<Long> fact(@RequestParam(value = "number", defaultValue = "0") long n)
        {
            long result;
            try{
               result= factorialfunctional.Fact(n);
            }
            catch(IllegalArgumentException ex)
            {
                return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
            }
            return new ResponseEntity<>(result, HttpStatus.OK);
        }
    @GetMapping("/factorialsTillN")
        public static ResponseEntity<ArrayList<Long>> facts(@RequestParam(value = "number", defaultValue = "0") long n)
        {
            ArrayList<Long> res = new ArrayList<>();
            try
            {
                res= factorialfunctional.FactsTillN(n);
            }
            catch(IllegalArgumentException ex)
            {
                return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
            }

            return new ResponseEntity<>(res, HttpStatus.OK);
        }
}

