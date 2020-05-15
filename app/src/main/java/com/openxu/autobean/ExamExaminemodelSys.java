package com.openxu.autobean;

import lombok.Data;

/**
* Author: openXu
* Time: 2020/05/15 16:51:34
* class: ExamExaminemodelSys
* Description:
*/
@Data
public class  ExamExaminemodelSys {

    private String ExamineModelSysID;
    private String ExamineModelCode;
    private String ExamineModelName;
    private String Description;
    private String CompanyID;
    private Integer IsDelete;
    private String CreatedBy;
    private String CreatedByName;
    private String CreatedDate;
    private String ModifiedBy;
    private String ModifiedByName;
    private String ModifiedDate;
}
