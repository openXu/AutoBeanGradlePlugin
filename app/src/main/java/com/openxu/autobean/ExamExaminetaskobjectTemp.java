package com.openxu.autobean;

import lombok.Data;

/**
* Author: openXu
* Time: 2020/05/15 16:51:35
* class: ExamExaminetaskobjectTemp
* Description:
*/
@Data
public class  ExamExaminetaskobjectTemp {

    private String TaskObjectID;
    private String TaskObjectName;
    private String TaskGroupID;
    private String TaskID;
    private String PlanObjectID;
    private String RealObjectID;
    private String RealObjectName;
    private Integer TotalIndicatorCount;
    private Integer ExamIndicatorCount;
    private Integer NormalIndicatorCount;
    private Integer AbnormalIndicatorCount;
    private String CreatedBy;
    private String CreatedByName;
    private String CreatedDate;
    private String ModifiedBy;
    private String ModifiedByName;
    private String ModifiedDate;
}
