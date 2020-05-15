package com.openxu.autobean;

import lombok.Data;

/**
* Author: openXu
* Time: 2020/05/15 16:51:34
* class: ExamExamineindicator
* Description:
*/
@Data
public class  ExamExamineindicator {

    private String IndicatorID;
    private String IndicatorCode;
    private String IndicatorName;
    private String DisplayName;
    private String Description;
    private String Statute;
    private String TechnicalStandard;
    private Integer IsCounter;
    private String CountUnit;
    private Float StandardScore;
    private Float MaxScore;
    private Float MinScore;
    private String IndicatorSign;
    private Float Scale;
    private String ExamineMode;
    private String IndicatorType;
    private String DataType;
    private String DefaultValue;
    private Double UpperLimit;
    private Double LowerLimit;
    private Integer IndicatorPrecision;
    private Integer RiskLevel;
    private Integer HazardLevel;
    private Integer AccidentLevel;
    private Integer IsDelete;
    private String CreatedBy;
    private String CreatedByName;
    private String CreatedDate;
    private String ModifiedBy;
    private String ModifiedByName;
    private String ModifiedDate;
}
