package com.fh.controller;

import com.fh.model.Aviation;
import com.fh.model.FlightQuery;
import com.fh.model.vo.FlightVo;
import com.fh.service.AviationService;
import com.fh.util.wyx_export;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletResponse;
import java.util.List;

@Controller

public class Export {
    @Autowired
    private AviationService aviationService;

    @RequestMapping("/export")
    public void Export(HttpServletResponse response, FlightQuery flightQuery){
        List<FlightVo> list =aviationService.initTable(flightQuery);
        wyx_export.export(list,response);
    }

    public static void main (String [] a){
     /*   Class<Address> addressClass = Address.class;
        TableName annotation = addressClass.getAnnotation(TableName.class);
        Field[] declaredFields = addressClass.getDeclaredFields();
        String sql="select ";
        String coulmn= "";
        for (int i=0;i<declaredFields.length;i++){
            TableField annotation1 = declaredFields[i].getAnnotation(TableField.class);
            if (annotation1 !=null){
                String value = annotation1.value();
                coulmn+=value+",";
            }
        }
         coulmn =coulmn.substring(0,coulmn.length()-1);
        sql +=coulmn;
        sql+=" from ";
        if (annotation != null){
            String value = annotation.value();
            sql+=value;
        }
        System.out.println(sql);
        */


    }

}
