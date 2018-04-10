package com.terrybisiar.api;

import java.math.BigDecimal;

import com.terrybisiar.model.TideData;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.swagger.annotations.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

import javax.validation.constraints.*;
import javax.validation.Valid;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;
import java.util.List;
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2018-04-07T22:40:35.263Z")

@Controller
public class TideApiController implements TideApi {

    private static final Logger log = LoggerFactory.getLogger(TideApiController.class);

    private final ObjectMapper objectMapper;

    private final HttpServletRequest request;

    @org.springframework.beans.factory.annotation.Autowired
    public TideApiController(ObjectMapper objectMapper, HttpServletRequest request) {
        this.objectMapper = objectMapper;
        this.request = request;
    }

    public ResponseEntity<TideData> addTideData(@ApiParam(value = "Tide objects that needs to be added to the store" ,required=true )  @Valid @RequestBody TideData body) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<TideData>(objectMapper.readValue("{  \"heightUnits\" : \"m\",  \"location\" : {    \"code\" : \"AKL\",    \"description\" : \"Auckland, NZ\",    \"id\" : 0  },  \"id\" : 12345,  \"timestamp\" : \"2017-07-21T17:32:28Z\",  \"height\" : 2.2}", TideData.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<TideData>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<TideData>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<List<TideData>> findTideDatasByLocation(@NotNull @ApiParam(value = "Location id for filtering tide data", required = true) @Valid @RequestParam(value = "location", required = true) String location,@ApiParam(value = "Number of results to return, default 5 - max 100") @Valid @RequestParam(value = "limit", required = false) BigDecimal limit) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<List<TideData>>(objectMapper.readValue("[ {  \"heightUnits\" : \"m\",  \"location\" : {    \"code\" : \"AKL\",    \"description\" : \"Auckland, NZ\",    \"id\" : 0  },  \"id\" : 12345,  \"timestamp\" : \"2017-07-21T17:32:28Z\",  \"height\" : 2.2}, {  \"heightUnits\" : \"m\",  \"location\" : {    \"code\" : \"AKL\",    \"description\" : \"Auckland, NZ\",    \"id\" : 0  },  \"id\" : 12345,  \"timestamp\" : \"2017-07-21T17:32:28Z\",  \"height\" : 2.2} ]", List.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<List<TideData>>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<List<TideData>>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Void> updateTide(@ApiParam(value = "Tide object that needs to be added to the store" ,required=true )  @Valid @RequestBody TideData body) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

}
