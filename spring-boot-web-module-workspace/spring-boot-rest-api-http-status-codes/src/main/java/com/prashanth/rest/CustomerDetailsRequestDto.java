package com.prashanth.rest;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CustomerDetailsRequestDto {

    @NotBlank(message = "Name cannot be blank")
    @Size(min = 5, message = "Name must be at least 5 characters long")
    private String name; // *

    @NotBlank
    @Email(message = "Email is Invalid")
    private String email; // *

    @NotBlank
    @Size(min = 5, max = 100, message = "Password must be between 5 and 100 characters")
    private String password; // *

   // @Pattern(regexp = "^[0-9]{10}$", message = "Contact number must be 10 digits")
    private long contact; // *

    private String gender; // optional
    private String city; // optional
}
