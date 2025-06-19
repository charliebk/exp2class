package com.topoplanet.ifc4x3_dev_73740fe4.entity;
import com.topoplanet.test.type.*;


public class IfcOwnerHistory {

    public IfcPersonAndOrganization OwningUser;
    public IfcApplication OwningApplication;
    public IfcStateEnum State; // OPTIONAL
    public IfcChangeActionEnum ChangeAction; // OPTIONAL
    public IfcTimeStamp LastModifiedDate; // OPTIONAL
    public IfcPersonAndOrganization LastModifyingUser; // OPTIONAL
    public IfcApplication LastModifyingApplication; // OPTIONAL
    public IfcTimeStamp CreationDate;
    // INVERSE attributes:
    // CorrectChangeAction : (EXISTS(LastModifiedDate)) OR
    // (NOT(EXISTS(LastModifiedDate)) AND NOT(EXISTS(ChangeAction))) OR
    // (NOT(EXISTS(LastModifiedDate)) AND EXISTS(ChangeAction) AND ((ChangeAction = IfcChangeActionEnum.NOTDEFINED) OR (ChangeAction = IfcChangeActionEnum.NOCHANGE)));

    // WHERE constraints:
    // CorrectChangeAction : (EXISTS(LastModifiedDate)) OR
    // (NOT(EXISTS(LastModifiedDate)) AND NOT(EXISTS(ChangeAction))) OR
    // (NOT(EXISTS(LastModifiedDate)) AND EXISTS(ChangeAction) AND ((ChangeAction = IfcChangeActionEnum.NOTDEFINED) OR (ChangeAction = IfcChangeActionEnum.NOCHANGE)));
}
