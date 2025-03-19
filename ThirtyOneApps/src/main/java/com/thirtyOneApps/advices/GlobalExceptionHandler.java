package com.thirtyOneApps.advices;

import com.thirtyOneApps.exceptions.ResourceNotFoundException;
import com.thirtyOneApps.exceptions.RunTimeConflictException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;

public class GlobalExceptionHandler {

    @ExceptionHandler(ResourceNotFoundException.class)
    public ResponseEntity<ApiResponse<?>> handleResourceNotFound(ResourceNotFoundException exception){
        ApiError error = ApiError.builder()
                .status(HttpStatus.NOT_FOUND)
                .message(exception.getMessage())
                .build();
        return buildErrorResponseEntity(error);

    }

    @ExceptionHandler(Exception.class)
    public ResponseEntity<ApiResponse<?>> handleInternalserverError(Exception exception){
        ApiError apiError = ApiError.builder()
                .status(HttpStatus.INTERNAL_SERVER_ERROR)
                .message(exception.getMessage())
                .build();
        return buildErrorResponseEntity(apiError);
    }
    @ExceptionHandler(RunTimeConflictException.class)
    public ResponseEntity<ApiResponse<?>> handleRunTimeConflictException(RunTimeConflictException exception){
        ApiError apiError = ApiError.builder()
                .status(HttpStatus.CONFLICT)
                .message(exception.getMessage())
                .build();
        return buildErrorResponseEntity(apiError);
    }


    private ResponseEntity<ApiResponse<?>> buildErrorResponseEntity(ApiError error) {
        return new ResponseEntity<>(new ApiResponse<>(error),error.getStatus());
    }
}
