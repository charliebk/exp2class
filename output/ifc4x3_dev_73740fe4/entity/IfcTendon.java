package com.topoplanet.ifc4x3_dev_73740fe4.entity;
import com.topoplanet.test.type.*;


public class IfcTendon extends IfcReinforcingElement {

    public IfcTendonTypeEnum PredefinedType; // OPTIONAL
    public IfcPositiveLengthMeasure NominalDiameter; // OPTIONAL
    public IfcAreaMeasure CrossSectionArea; // OPTIONAL
    public IfcForceMeasure TensionForce; // OPTIONAL
    public IfcPressureMeasure PreStress; // OPTIONAL
    public IfcNormalisedRatioMeasure FrictionCoefficient; // OPTIONAL
    public IfcPositiveLengthMeasure AnchorageSlip; // OPTIONAL
    public IfcPositiveLengthMeasure MinCurvatureRadius; // OPTIONAL
    // INVERSE attributes:
    // CorrectPredefinedType : NOT(EXISTS(PredefinedType)) OR
    // (PredefinedType <> IfcTendonTypeEnum.USERDEFINED) OR
    // ((PredefinedType = IfcTendonTypeEnum.USERDEFINED) AND EXISTS (SELF\IfcObject.ObjectType));
    // CorrectTypeAssigned : (SIZEOF(IsTypedBy) = 0) OR
    // ('IFC4X3_DEV_73740fe4.IFCTENDONTYPE' IN TYPEOF(SELF\IfcObject.IsTypedBy[1].RelatingType));

    // WHERE constraints:
    // CorrectPredefinedType : NOT(EXISTS(PredefinedType)) OR
    // (PredefinedType <> IfcTendonTypeEnum.USERDEFINED) OR
    // ((PredefinedType = IfcTendonTypeEnum.USERDEFINED) AND EXISTS (SELF\IfcObject.ObjectType));
    // CorrectTypeAssigned : (SIZEOF(IsTypedBy) = 0) OR
    // ('IFC4X3_DEV_73740fe4.IFCTENDONTYPE' IN TYPEOF(SELF\IfcObject.IsTypedBy[1].RelatingType));
}
