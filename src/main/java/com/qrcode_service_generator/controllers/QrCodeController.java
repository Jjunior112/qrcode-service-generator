package com.qrcode_service_generator.controllers;

import com.google.zxing.WriterException;
import com.qrcode_service_generator.dtos.qrcode.QrCodeRequest;
import com.qrcode_service_generator.services.QrCodeService;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;

@RestController
@RequestMapping("qrcode")
public class QrCodeController {

    private final QrCodeService qrCodeService;


    public QrCodeController(QrCodeService qrCodeService) {
        this.qrCodeService = qrCodeService;
    }

    @PostMapping
    public ResponseEntity<byte[]> generate(@RequestBody QrCodeRequest request) throws IOException, WriterException {

        var response = qrCodeService.generate(request.url());

        return ResponseEntity.ok().contentType(MediaType.IMAGE_PNG).body(response);
    }

}
