/**
 * NOTE: This class is auto generated by the swagger code generator program (2.3.1).
 * https://github.com/swagger-api/swagger-codegen
 * Do not edit the class manually.
 */
package io.swagger.api;

import java.math.BigDecimal;
import io.swagger.model.TideData;
import io.swagger.annotations.*;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.multipart.MultipartFile;

import javax.validation.Valid;
import javax.validation.constraints.*;
import java.util.List;
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2018-04-07T22:40:35.263Z")

@Api(value = "tide", description = "the tide API")
public interface TideApi {

    @ApiOperation(value = "Add new tide data to the server", nickname = "addTideData", notes = "", response = TideData.class, authorizations = {
        @Authorization(value = "tidedata_auth", scopes = {
            @AuthorizationScope(scope = "write:tidedata", description = "modify tide datasets on the server")
            })
    }, tags={ "tide", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Success! Added new tide data", response = TideData.class),
        @ApiResponse(code = 405, message = "Invalid input") })
    @RequestMapping(value = "/tide",
        produces = { "application/json" }, 
        consumes = { "application/json" },
        method = RequestMethod.POST)
    ResponseEntity<TideData> addTideData(@ApiParam(value = "Tide objects that needs to be added to the store" ,required=true )  @Valid @RequestBody TideData body);


    @ApiOperation(value = "Finds tide data sets by location", nickname = "findTideDatasByLocation", notes = "Returns the specified number of future tide data at the given location, defaults to next 5 max/min values", response = TideData.class, responseContainer = "List", authorizations = {
        @Authorization(value = "tidedata_auth", scopes = {
            @AuthorizationScope(scope = "read:tidedata", description = "read tide datasets"),
            @AuthorizationScope(scope = "write:tidedata", description = "modify tide datasets on the server")
            })
    }, tags={ "tide", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "successful operation", response = TideData.class, responseContainer = "List"),
        @ApiResponse(code = 400, message = "Invalid location value") })
    @RequestMapping(value = "/tide/findByLocation",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    ResponseEntity<List<TideData>> findTideDatasByLocation(@NotNull @ApiParam(value = "Location id for filtering tide data", required = true) @Valid @RequestParam(value = "location", required = true) String location,@ApiParam(value = "Number of results to return, default 5 - max 100") @Valid @RequestParam(value = "limit", required = false) BigDecimal limit);


    @ApiOperation(value = "Update an existing set of tide data", nickname = "updateTide", notes = "", authorizations = {
        @Authorization(value = "tidedata_auth", scopes = {
            @AuthorizationScope(scope = "write:tidedata", description = "modify tide datasets on the server")
            })
    }, tags={ "tide", })
    @ApiResponses(value = { 
        @ApiResponse(code = 400, message = "Invalid ID supplied"),
        @ApiResponse(code = 404, message = "Tide not found"),
        @ApiResponse(code = 405, message = "Validation exception") })
    @RequestMapping(value = "/tide",
        produces = { "application/json" }, 
        consumes = { "application/json" },
        method = RequestMethod.PUT)
    ResponseEntity<Void> updateTide(@ApiParam(value = "Tide object that needs to be added to the store" ,required=true )  @Valid @RequestBody TideData body);

}
