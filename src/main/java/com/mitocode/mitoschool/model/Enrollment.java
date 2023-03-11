package com.mitocode.mitoschool.model;

import java.time.LocalDateTime;
import java.util.List;

public class Enrollment {

    private LocalDateTime enrollDate;

    private Student student;

    private List<EnrollmentDetail> details;

    private boolean status;

}
