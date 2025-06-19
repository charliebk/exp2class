package com.topoplanet.ifc4x3_dev_73740fe4.entity;
import com.topoplanet.test.type.*;


import java.util.List;

public class IfcReinforcingMeshType extends IfcReinforcingElementType {

    public IfcReinforcingMeshTypeEnum PredefinedType;
    public IfcPositiveLengthMeasure MeshLength; // OPTIONAL
    public IfcPositiveLengthMeasure MeshWidth; // OPTIONAL
    public IfcPositiveLengthMeasure LongitudinalBarNominalDiameter; // OPTIONAL
    public IfcPositiveLengthMeasure TransverseBarNominalDiameter; // OPTIONAL
    public IfcAreaMeasure LongitudinalBarCrossSectionArea; // OPTIONAL
    public IfcAreaMeasure TransverseBarCrossSectionArea; // OPTIONAL
    public IfcPositiveLengthMeasure LongitudinalBarSpacing; // OPTIONAL
    public IfcPositiveLengthMeasure TransverseBarSpacing; // OPTIONAL
    public IfcLabel BendingShapeCode; // OPTIONAL
    // INVERSE attributes:
    // BendingShapeCodeProvided : NOT EXISTS(BendingParameters) OR EXISTS(BendingShapeCode);
    // CorrectPredefinedType : (PredefinedType <> IfcReinforcingMeshTypeEnum.USERDEFINED) OR
    // ((PredefinedType = IfcReinforcingMeshTypeEnum.USERDEFINED) AND EXISTS (SELF\IfcElementType.ElementType));

    // WHERE constraints:
    // BendingShapeCodeProvided : NOT EXISTS(BendingParameters) OR EXISTS(BendingShapeCode);
    // CorrectPredefinedType : (PredefinedType <> IfcReinforcingMeshTypeEnum.USERDEFINED) OR
    // ((PredefinedType = IfcReinforcingMeshTypeEnum.USERDEFINED) AND EXISTS (SELF\IfcElementType.ElementType));
}
