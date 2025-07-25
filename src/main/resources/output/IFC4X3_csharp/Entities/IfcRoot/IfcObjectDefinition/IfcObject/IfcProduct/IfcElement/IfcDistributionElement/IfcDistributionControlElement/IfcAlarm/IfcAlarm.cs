public class IfcAlarm : IfcDistributionControlElement
{
    public IfcAlarmTypeEnum PredefinedType { get; set; }

    // === WHERE CLAUSES ===
    // CorrectPredefinedType : NOT(EXISTS(PredefinedType)) OR (PredefinedType <> IfcAlarmTypeEnum.USERDEFINED) OR ((PredefinedType = IfcAlarmTypeEnum.USERDEFINED) AND EXISTS (SELF\IfcObject.ObjectType))
    // CorrectTypeAssigned : (SIZEOF(IsTypedBy) = 0) OR ('IFC4X3_DEV_73740fe4.IFCALARMTYPE' IN TYPEOF(SELF\IfcObject.IsTypedBy[1].RelatingType))
}
