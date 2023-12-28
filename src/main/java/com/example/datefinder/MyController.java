package com.example.datefinder;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import java.time.*;
import java.time.format.DateTimeFormatter;

@RestController
public class MyController {
    
    @GetMapping("/")
    public String dateFinder(){
        LocalDate dateobj = LocalDate.now();
        
        LocalDate formatteddate = dateobj.plusDays(100);
        DateTimeFormatter format1 = DateTimeFormatter.ofPattern("dd-MM-YYYY");
        String updatedDate = formatteddate.format(format1);
        return updatedDate;
    }

}
