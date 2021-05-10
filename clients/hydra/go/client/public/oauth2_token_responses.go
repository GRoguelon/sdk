// Code generated by go-swagger; DO NOT EDIT.

package public

// This file was generated by the swagger tool.
// Editing this file might prove futile when you re-run the swagger generate command

import (
	"fmt"
	"io"

	"github.com/go-openapi/runtime"
	"github.com/go-openapi/strfmt"

	"github.com/ory/hydra-client-go/models"
)

// Oauth2TokenReader is a Reader for the Oauth2Token structure.
type Oauth2TokenReader struct {
	formats strfmt.Registry
}

// ReadResponse reads a server response into the received o.
func (o *Oauth2TokenReader) ReadResponse(response runtime.ClientResponse, consumer runtime.Consumer) (interface{}, error) {
	switch response.Code() {
	case 200:
		result := NewOauth2TokenOK()
		if err := result.readResponse(response, consumer, o.formats); err != nil {
			return nil, err
		}
		return result, nil
	case 400:
		result := NewOauth2TokenBadRequest()
		if err := result.readResponse(response, consumer, o.formats); err != nil {
			return nil, err
		}
		return nil, result
	case 401:
		result := NewOauth2TokenUnauthorized()
		if err := result.readResponse(response, consumer, o.formats); err != nil {
			return nil, err
		}
		return nil, result
	case 500:
		result := NewOauth2TokenInternalServerError()
		if err := result.readResponse(response, consumer, o.formats); err != nil {
			return nil, err
		}
		return nil, result

	default:
		return nil, runtime.NewAPIError("unknown error", response, response.Code())
	}
}

// NewOauth2TokenOK creates a Oauth2TokenOK with default headers values
func NewOauth2TokenOK() *Oauth2TokenOK {
	return &Oauth2TokenOK{}
}

/*Oauth2TokenOK handles this case with default header values.

oauth2TokenResponse
*/
type Oauth2TokenOK struct {
	Payload *models.Oauth2TokenResponse
}

func (o *Oauth2TokenOK) Error() string {
	return fmt.Sprintf("[POST /oauth2/token][%d] oauth2TokenOK  %+v", 200, o.Payload)
}

func (o *Oauth2TokenOK) GetPayload() *models.Oauth2TokenResponse {
	return o.Payload
}

func (o *Oauth2TokenOK) readResponse(response runtime.ClientResponse, consumer runtime.Consumer, formats strfmt.Registry) error {

	o.Payload = new(models.Oauth2TokenResponse)

	// response payload
	if err := consumer.Consume(response.Body(), o.Payload); err != nil && err != io.EOF {
		return err
	}

	return nil
}

// NewOauth2TokenBadRequest creates a Oauth2TokenBadRequest with default headers values
func NewOauth2TokenBadRequest() *Oauth2TokenBadRequest {
	return &Oauth2TokenBadRequest{}
}

/*Oauth2TokenBadRequest handles this case with default header values.

genericError
*/
type Oauth2TokenBadRequest struct {
	Payload *models.GenericError
}

func (o *Oauth2TokenBadRequest) Error() string {
	return fmt.Sprintf("[POST /oauth2/token][%d] oauth2TokenBadRequest  %+v", 400, o.Payload)
}

func (o *Oauth2TokenBadRequest) GetPayload() *models.GenericError {
	return o.Payload
}

func (o *Oauth2TokenBadRequest) readResponse(response runtime.ClientResponse, consumer runtime.Consumer, formats strfmt.Registry) error {

	o.Payload = new(models.GenericError)

	// response payload
	if err := consumer.Consume(response.Body(), o.Payload); err != nil && err != io.EOF {
		return err
	}

	return nil
}

// NewOauth2TokenUnauthorized creates a Oauth2TokenUnauthorized with default headers values
func NewOauth2TokenUnauthorized() *Oauth2TokenUnauthorized {
	return &Oauth2TokenUnauthorized{}
}

/*Oauth2TokenUnauthorized handles this case with default header values.

genericError
*/
type Oauth2TokenUnauthorized struct {
	Payload *models.GenericError
}

func (o *Oauth2TokenUnauthorized) Error() string {
	return fmt.Sprintf("[POST /oauth2/token][%d] oauth2TokenUnauthorized  %+v", 401, o.Payload)
}

func (o *Oauth2TokenUnauthorized) GetPayload() *models.GenericError {
	return o.Payload
}

func (o *Oauth2TokenUnauthorized) readResponse(response runtime.ClientResponse, consumer runtime.Consumer, formats strfmt.Registry) error {

	o.Payload = new(models.GenericError)

	// response payload
	if err := consumer.Consume(response.Body(), o.Payload); err != nil && err != io.EOF {
		return err
	}

	return nil
}

// NewOauth2TokenInternalServerError creates a Oauth2TokenInternalServerError with default headers values
func NewOauth2TokenInternalServerError() *Oauth2TokenInternalServerError {
	return &Oauth2TokenInternalServerError{}
}

/*Oauth2TokenInternalServerError handles this case with default header values.

genericError
*/
type Oauth2TokenInternalServerError struct {
	Payload *models.GenericError
}

func (o *Oauth2TokenInternalServerError) Error() string {
	return fmt.Sprintf("[POST /oauth2/token][%d] oauth2TokenInternalServerError  %+v", 500, o.Payload)
}

func (o *Oauth2TokenInternalServerError) GetPayload() *models.GenericError {
	return o.Payload
}

func (o *Oauth2TokenInternalServerError) readResponse(response runtime.ClientResponse, consumer runtime.Consumer, formats strfmt.Registry) error {

	o.Payload = new(models.GenericError)

	// response payload
	if err := consumer.Consume(response.Body(), o.Payload); err != nil && err != io.EOF {
		return err
	}

	return nil
}
