package com.topoplanet.ifc4x3_dev_73740fe4.entity;
import com.topoplanet.test.type.*;


public class IfcReinforcingMesh extends IfcReinforcingElement {

    public IfcPositiveLengthMeasure MeshLength; // OPTIONAL
    public IfcPositiveLengthMeasure MeshWidth; // OPTIONAL
    public IfcPositiveLengthMeasure LongitudinalBarNominalDiameter; // OPTIONAL
    public IfcPositiveLengthMeasure TransverseBarNominalDiameter; // OPTIONAL
    public IfcAreaMeasure LongitudinalBarCrossSectionArea; // OPTIONAL
    public IfcAreaMeasure TransverseBarCrossSectionArea; // OPTIONAL
    public IfcPositiveLengthMeasure LongitudinalBarSpacing; // OPTIONAL
    public IfcPositiveLengthMeasure TransverseBarSpacing; // OPTIONAL
    public IfcReinforcingMeshTypeEnum PredefinedType; // OPTIONAL
    // INVERSE attributes:
    // CorrectPredefinedType : NOT(EXISTS(PredefinedType)) OR
    // (PredefinedType <> IfcReinforcingMeshTypeEnum.USERDEFINED) OR
    // ((PredefinedType = IfcReinforcingMeshTypeEnum.USERDEFINED) AND EXISTS (SELF\IfcObject.ObjectType));
    // CorrectTypeAssigned : (SIZEOF(IsTypedBy) = 0) OR
    // ('IFC4X3_DEV_73740fe4.IFCREINFORCINGMESHTYPE' IN TYPEOF(SELF\IfcObject.IsTypedBy[1].RelatingType));

    // WHERE constraints:
    // CorrectPredefinedType : NOT(EXISTS(PredefinedType)) OR
    // (PredefinedType <> IfcReinforcingMeshTypeEnum.USERDEFINED) OR
    // ((PredefinedType = IfcReinforcingMeshTypeEnum.USERDEFINED) AND EXISTS (SELF\IfcObject.ObjectType));
    // CorrectTypeAssigned : (SIZEOF(IsTypedBy) = 0) OR
    // ('IFC4X3_DEV_73740fe4.IFCREINFORCINGMESHTYPE' IN TYPEOF(SELF\IfcObject.IsTypedBy[1].RelatingType));
}
