package com.openxu.autobean;

import lombok.Data;

/**
* Author: openXu
* Time: 2020/05/15 16:51:35
* class: ExamExamineplanobject
* Description:
*/
@Data
public class  ExamExamineplanobject {

    private String PlanObjectID;
    private String PlanObjectName;
    private String PlanID;
    private String PlanGroupID;
    private String ProjectObjectID;
    private String RealObjectID;
    private String RealObjectName;
    private Integer ExamObjectType;
    private String CreatedBy;
    private String CreatedByName;
    private String CreatedDate;
    private String ModifiedBy;
    private String ModifiedByName;
    private String ModifiedDate;
}
