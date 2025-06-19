package com.topoplanet.ifc4x3_dev_73740fe4.entity;
import com.topoplanet.test.type.*;


public class IfcReinforcingBar extends IfcReinforcingElement {

    public IfcPositiveLengthMeasure NominalDiameter; // OPTIONAL
    public IfcAreaMeasure CrossSectionArea; // OPTIONAL
    public IfcPositiveLengthMeasure BarLength; // OPTIONAL
    public IfcReinforcingBarTypeEnum PredefinedType; // OPTIONAL
    public IfcReinforcingBarSurfaceEnum BarSurface; // OPTIONAL
    // INVERSE attributes:
    // CorrectPredefinedType : NOT(EXISTS(PredefinedType)) OR
    // (PredefinedType <> IfcReinforcingBarTypeEnum.USERDEFINED) OR
    // ((PredefinedType = IfcReinforcingBarTypeEnum.USERDEFINED) AND EXISTS (SELF\IfcObject.ObjectType));
    // CorrectTypeAssigned : (SIZEOF(IsTypedBy) = 0) OR
    // ('IFC4X3_DEV_73740fe4.IFCREINFORCINGBARTYPE' IN TYPEOF(SELF\IfcObject.IsTypedBy[1].RelatingType));

    // WHERE constraints:
    // CorrectPredefinedType : NOT(EXISTS(PredefinedType)) OR
    // (PredefinedType <> IfcReinforcingBarTypeEnum.USERDEFINED) OR
    // ((PredefinedType = IfcReinforcingBarTypeEnum.USERDEFINED) AND EXISTS (SELF\IfcObject.ObjectType));
    // CorrectTypeAssigned : (SIZEOF(IsTypedBy) = 0) OR
    // ('IFC4X3_DEV_73740fe4.IFCREINFORCINGBARTYPE' IN TYPEOF(SELF\IfcObject.IsTypedBy[1].RelatingType));
}
