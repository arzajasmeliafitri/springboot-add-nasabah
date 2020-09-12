package id.project.spring.springbootaddnasabah.controller;

import id.project.spring.springbootaddnasabah.model.Nasabah;
import id.project.spring.springbootaddnasabah.repository.AddNasabahRepository;
import id.project.spring.springbootaddnasabah.response.MessageResponse;
import id.project.spring.springbootaddnasabah.utlity.Formatter;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

/**
 * @author Arza Jasmelia.
 * springboot-add-nasabah
 * on 11/09/2020
 */

@RestController
@RequestMapping("/api/v1/nasabah")
public class AddNasabahController extends Formatter {

    @Autowired
    AddNasabahRepository addNasabahRepository;

    @PostMapping("/AddNasabah")
    @ApiOperation(value = "Add Nasabah",notes = "Add Data Nasabah")
    @ApiResponses(value = {
            @ApiResponse(code = 200,message = "AddNassabah found"),
            @ApiResponse(code = 404,message = "AddNassabah not found")
    })
    public MessageResponse createNasabah(@Valid @RequestBody Nasabah nasabah){

        MessageResponse messageResponse = new MessageResponse();
        messageResponse.setCode("0000");
        messageResponse.setMessage("Success");
        messageResponse.setDate(getDate());
        messageResponse.setTime(getTime());
        messageResponse.setContent(addNasabahRepository.save(nasabah));

        return messageResponse;
    }
}
