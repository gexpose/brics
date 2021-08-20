/**
 * NOTE: This class is auto generated by the swagger code generator program (3.0.8).
 * https://github.com/swagger-api/swagger-codegen
 * Do not edit the class manually.
 */
package gov.nih.tbi.api.query.controller;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import gov.nih.tbi.api.query.model.RepeatableGroup;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import io.swagger.annotations.Authorization;
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-01-08T12:59:25.689-05:00[America/New_York]")
@Api(value = "dataElement", description = "the dataElement API")
public interface DataElementApi {

    @ApiOperation(value = "Find data elements by form structure short name", nickname = "getDataElementsByFormName", notes = "This service return data elements that are associated with the given form structure.", response = RepeatableGroup.class, responseContainer = "List", authorizations = {
        @Authorization(value = "bearerAuth")    }, tags={ "Data Element", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "successful operation", response = RepeatableGroup.class, responseContainer = "List"),
        @ApiResponse(code = 401, message = "JWT is missing or invalid"),
        @ApiResponse(code = 404, message = "The specified resource was not found") })
    @RequestMapping(value = "/dataElement/form/{formName}",
        produces = "application/json", 
        method = RequestMethod.GET)
    ResponseEntity<List<RepeatableGroup>> getDataElementsByFormName(@ApiParam(value = "Form short name to return associated studies for.",required=true) @PathVariable("formName") String formName);

}
