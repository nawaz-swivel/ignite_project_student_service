package com.swivel.ignite.student.dto.request;

import com.swivel.ignite.student.enums.RoleType;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

/**
 * DTO for Student creation request
 */
@Getter
@Setter
@AllArgsConstructor
public class StudentCreateRequestDto extends RequestDto {

    private RoleType roleType;
    private String username;
    private String password;

    @Override
    public String toLogJson() {
        return toJson();
    }

    @Override
    public boolean isRequiredAvailable() {
        return isNonEmpty(username) && isNonEmpty(password);
    }
}
