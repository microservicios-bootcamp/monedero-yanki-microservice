package com.demo.app.monedero.model;

import com.demo.app.monedero.model.common.DocumentTypeEnum;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Purse {

    @Id
    private String id;
    private String phoneNumber;
    private String imei;
    private String email;
    private DocumentTypeEnum documentEnum;
    private String DocumentNumber;

}
