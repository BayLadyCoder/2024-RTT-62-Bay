package com.example.springboot.validation;

import com.example.springboot.database.dao.EmployeeDAO;
import com.example.springboot.database.entity.Employee;
import jakarta.validation.*;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.*;
import org.springframework.util.*;


@Slf4j
public class EmployeeEmailUniqueImpl implements ConstraintValidator<EmployeeEmailUnique, String> {

    @Autowired
    private EmployeeDAO employeeDao;

    @Override
    public boolean isValid(String value, ConstraintValidatorContext context) {
        if (StringUtils.isEmpty(value)) {
            return true;
        }

        Employee employee = employeeDao.findByEmailIgnoreCase(value);

        return (employee == null);
    }
}
