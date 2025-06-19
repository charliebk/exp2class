package com.topoplanet.ifc4x3_dev_73740fe4.entity;
import com.topoplanet.test.type.*;


public class IfcWall extends IfcBuiltElement {

    public IfcWallTypeEnum PredefinedType; // OPTIONAL
    // INVERSE attributes:
    // CorrectPredefinedType : NOT(EXISTS(PredefinedType)) OR
    // (PredefinedType <> IfcWallTypeEnum.USERDEFINED) OR
    // ((PredefinedType = IfcWallTypeEnum.USERDEFINED) AND EXISTS (SELF\IfcObject.ObjectType));
    // CorrectTypeAssigned : (SIZEOF(IsTypedBy) = 0) OR
    // ('IFC4X3_DEV_73740fe4.IFCWALLTYPE' IN TYPEOF(SELF\IfcObject.IsTypedBy[1].RelatingType));

    // SUPERTYPE OF:
    // - IfcWallStandardCase SUBTYPE OF IfcBuiltElement

    // WHERE constraints:
    // CorrectPredefinedType : NOT(EXISTS(PredefinedType)) OR
    // (PredefinedType <> IfcWallTypeEnum.USERDEFINED) OR
    // ((PredefinedType = IfcWallTypeEnum.USERDEFINED) AND EXISTS (SELF\IfcObject.ObjectType));
    // CorrectTypeAssigned : (SIZEOF(IsTypedBy) = 0) OR
    // ('IFC4X3_DEV_73740fe4.IFCWALLTYPE' IN TYPEOF(SELF\IfcObject.IsTypedBy[1].RelatingType));
}
