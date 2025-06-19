package com.topoplanet.ifc4x3_dev_73740fe4.entity;
import com.topoplanet.test.type.*;


public class IfcStairFlight extends IfcBuiltElement {

    public IfcInteger NumberOfRisers; // OPTIONAL
    public IfcInteger NumberOfTreads; // OPTIONAL
    public IfcPositiveLengthMeasure RiserHeight; // OPTIONAL
    public IfcPositiveLengthMeasure TreadLength; // OPTIONAL
    public IfcStairFlightTypeEnum PredefinedType; // OPTIONAL
    // INVERSE attributes:
    // CorrectPredefinedType : NOT(EXISTS(PredefinedType)) OR
    // (PredefinedType <> IfcStairFlightTypeEnum.USERDEFINED) OR
    // ((PredefinedType = IfcStairFlightTypeEnum.USERDEFINED) AND EXISTS (SELF\IfcObject.ObjectType));
    // CorrectTypeAssigned : (SIZEOF(IsTypedBy) = 0) OR
    // ('IFC4X3_DEV_73740fe4.IFCSTAIRFLIGHTTYPE' IN TYPEOF(SELF\IfcObject.IsTypedBy[1].RelatingType));

    // WHERE constraints:
    // CorrectPredefinedType : NOT(EXISTS(PredefinedType)) OR
    // (PredefinedType <> IfcStairFlightTypeEnum.USERDEFINED) OR
    // ((PredefinedType = IfcStairFlightTypeEnum.USERDEFINED) AND EXISTS (SELF\IfcObject.ObjectType));
    // CorrectTypeAssigned : (SIZEOF(IsTypedBy) = 0) OR
    // ('IFC4X3_DEV_73740fe4.IFCSTAIRFLIGHTTYPE' IN TYPEOF(SELF\IfcObject.IsTypedBy[1].RelatingType));
}
