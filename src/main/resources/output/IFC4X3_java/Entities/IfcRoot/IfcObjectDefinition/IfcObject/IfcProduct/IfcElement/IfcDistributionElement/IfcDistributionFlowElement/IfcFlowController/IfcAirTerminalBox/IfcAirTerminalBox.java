public class IfcAirTerminalBox extends IfcFlowController {
    public IfcAirTerminalBoxTypeEnum PredefinedType;

    // === WHERE CLAUSES ===
    // CorrectPredefinedType : NOT(EXISTS(PredefinedType)) OR (PredefinedType <> IfcAirTerminalBoxTypeEnum.USERDEFINED) OR ((PredefinedType = IfcAirTerminalBoxTypeEnum.USERDEFINED) AND EXISTS (SELF\IfcObject.ObjectType))
    // CorrectTypeAssigned : (SIZEOF(IsTypedBy) = 0) OR ('IFC4X3_DEV_73740fe4.IFCAIRTERMINALBOXTYPE' IN TYPEOF(SELF\IfcObject.IsTypedBy[1].RelatingType))
}
