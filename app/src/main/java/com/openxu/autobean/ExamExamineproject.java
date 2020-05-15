package com.openxu.autobean;

import lombok.Data;

/**
* Author: openXu
* Time: 2020/05/15 16:51:35
* class: ExamExamineproject
* Description:
*/
@Data
public class  ExamExamineproject {

    private String ProjectID;
    private String ProjectCode;
    private String ProjectName;
    private String Descript;
    private Integer ExamObjectType;
    private String ExamineModelID;
    private String CompanyID;
    private String CompanyName;
    private Integer Effectived;
    private Integer LimitMode;
    private Integer ExamineMode;
    private Integer RouteMode;
    private Integer RectifyTimeLimit;
    private Integer ProjectStatus;
    private Integer EnableUploadAttach;
    private Integer IsRisk;
    private String ProjectType;
    private String CreatedBy;
    private String CreatedByName;
    private String CreatedDate;
    private String ModifiedBy;
    private String ModifiedByName;
    private String ModifiedDate;
}
